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
import com.training.pom.ELTC_031aPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_031aTests {

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

	@Test

	public void createaCourseTest() throws InterruptedException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn();

		// registrationPOM.clicksignUpBtn();
		ELTC_031aPOM.clickAddUserLink();
		ELTC_031aPOM.sendFirstName("Rashmi");
		ELTC_031aPOM.sendLastName("new student Four");
		ELTC_031aPOM.sendemail("newstudent4@gmail.com");
		ELTC_031aPOM.sendUserNameTwo("newstudent3");
		ELTC_031aPOM.clickSelectPasswordRadioBtn();
		
		ELTC_031aPOM.sendPasswordTwo("Anirudh@12");
		ELTC_031aPOM.sendPhone("1234567890");
		ELTC_031aPOM.selectLanguageDropDown("English");
		ELTC_031aPOM.selectProfile("Learner");
		screenShot.captureScreenShot("ELTC_031a_Screen1");
		ELTC_031aPOM.clickRegistrationSubmitBtn();

		Assert.assertEquals("Your personal settings have been registered",
				"Your personal settings have been registered");

		screenShot.captureScreenShot("ELTC_031_Screen2");

	}
}
