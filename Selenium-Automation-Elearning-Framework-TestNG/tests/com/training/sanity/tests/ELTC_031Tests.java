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

import com.training.generics.ScreenShot;
import com.training.pom.ELTC_031POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_031Tests {

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

	@Test
	public void registrationTest() {

		registrationPOM.clicksignUpBtn();
		registrationPOM.sendFirstName("Rashmi");
		registrationPOM.sendLastName("new student three");
		registrationPOM.sendemail("newstudent3@gmail.com");
		registrationPOM.sendUserName("newstudent3");
		registrationPOM.sendPassword("Anirudh@12");
		registrationPOM.sendPassword2("Anirudh@12");
		registrationPOM.sendPhone("1234567890");
		registrationPOM.selectLanguageDropDown("English");
		registrationPOM.clickProfileRadioButton();
		screenShot.captureScreenShot("ELTC_031_Screen1");
		registrationPOM.clickRegistrationSubmitBtn();

		Assert.assertEquals("Your personal settings have been registered", "Your personal settings have been registered");
		
		screenShot.captureScreenShot("ELTC_031_Screen2");

	}
}