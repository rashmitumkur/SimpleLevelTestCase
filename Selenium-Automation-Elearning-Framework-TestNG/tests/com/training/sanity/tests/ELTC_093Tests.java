package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.ELTC_093POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_093Tests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private ELTC_093POM ELTC_093POM;

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
		ELTC_093POM = new ELTC_093POM(driver);
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

	@Test(dataProvider = "db-inputs1", dataProviderClass = LoginDataProviders.class)
	public void createaCourseTest(String userName, String password, String firstName, String lastName, String email,
			String userNameTwo, String passwordTwo, String phone, String language, String profile) throws InterruptedException {
	
		loginPOM.sendUserName(userName);
		loginPOM.sendPassword(password);
		loginPOM.clickLoginBtn();

		// registrationPOM.clicksignUpBtn();
		ELTC_093POM.clickAddUserLink();
		ELTC_093POM.sendFirstName(firstName);
		ELTC_093POM.sendLastName(lastName);
		ELTC_093POM.sendemail(email);
		ELTC_093POM.sendUserNameTwo(userNameTwo);
		ELTC_093POM.clickSelectPasswordRadioBtn();
		
		ELTC_093POM.sendPasswordTwo(passwordTwo);
		ELTC_093POM.sendPhone(phone);
		ELTC_093POM.selectLanguageDropDown(language);
		ELTC_093POM.selectProfile(profile);
		screenShot.captureScreenShot("ELTC_093_Screen1");
		ELTC_093POM.clickRegistrationSubmitBtn();

		Assert.assertEquals("Your personal settings have been registered",
				"Your personal settings have been registered");

		screenShot.captureScreenShot("ELTC_093_Screen2");

	}
}
