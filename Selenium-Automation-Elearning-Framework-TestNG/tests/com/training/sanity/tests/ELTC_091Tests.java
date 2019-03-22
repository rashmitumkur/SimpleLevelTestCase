package com.training.sanity.tests;

import static org.testng.Assert.assertEquals;

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
import com.training.pom.ELTC_031POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_091Tests {

	private WebDriver driver;
	private String baseUrl;
	private ELTC_031POM registrationPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		registrationPOM = new ELTC_031POM(driver);
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

	@Test(dataProvider ="excel-inputs", dataProviderClass = LoginDataProviders.class)
	public void registrationTest(String firstName,String lastName,String email,String userName,String password,String password2,String phone,String language) {

		registrationPOM.clicksignUpBtn();
		registrationPOM.sendFirstName(firstName);
		registrationPOM.sendLastName(lastName);
		registrationPOM.sendemail(email);
		registrationPOM.sendUserName(userName);
		registrationPOM.sendPassword(password);
		registrationPOM.sendPassword2(password2);
		registrationPOM.sendPhone(phone);
		registrationPOM.selectLanguageDropDown(language);
		registrationPOM.clickProfileRadioButton();
		screenShot.captureScreenShot("ELTC_031_Screen1");
		//registrationPOM.clickRegistrationSubmitBtn();

		Assert.assertEquals("Your personal settings have been registered", "Your personal settings have been registered");
		
		screenShot.captureScreenShot("ELTC_031_Screen2");

	}
}