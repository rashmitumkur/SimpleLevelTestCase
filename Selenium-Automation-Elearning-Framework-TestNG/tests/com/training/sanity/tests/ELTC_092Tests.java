package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.ELTC_031aPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_092Tests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private ELTC_031aPOM ELTC_031aPOM;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		ELTC_031aPOM = new ELTC_031aPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}

	@Test(dataProvider = "excel-inputs1", dataProviderClass = LoginDataProviders.class)
	public void registrationTest(String userName, String password, String firstName, String lastName, String email,
			String userNameTwo, String passwordTwo, String phone, String language, String profile) {
		// Login page will open
		loginPOM.sendUserName(userName);
		loginPOM.sendPassword(password);
		loginPOM.clickLoginBtn();

		// 1. Registration page should get displayed
		ELTC_031aPOM.clickAddUserLink();

		// 2. entered credential should be get displayed in First name textbox
		ELTC_031aPOM.sendFirstName(firstName);

		// 3. entered credential should be get displayed in Last name textbox
		ELTC_031aPOM.sendLastName(lastName);

		// 4. entered credential should be get displayed in e-mail textbox
		ELTC_031aPOM.sendemail(email);

		// 5. entered credential should be get displayed in username textbox
		ELTC_031aPOM.sendUserNameTwo(userNameTwo);

		// 6. entered credential should be get displayed in pass textbox
		ELTC_031aPOM.clickSelectPasswordRadioBtn();

		// 8. entered credential should be get displayed in phone textbox
		ELTC_031aPOM.sendPhone(phone);

		// 9. Selected language should get displayed in Language list box
		ELTC_031aPOM.selectLanguageDropDown(language);

		// 10. Student radio button in Profile should get selected
		ELTC_031aPOM.selectProfile(profile);

		screenShot.captureScreenShot("ELTC_092_Screen1");

		// 11. Error message should get displayed
		ELTC_031aPOM.clickRegistrationSubmitBtn();

		Assert.assertEquals("The email address is not complete or contains some invalid characters",
				"The email address is not complete or contains some invalid characters");

		screenShot.captureScreenShot("ELTC_92_Screen1");

	}
}
