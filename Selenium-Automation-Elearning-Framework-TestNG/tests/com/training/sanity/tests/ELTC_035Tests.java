package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.ELTC_034POM;
import com.training.pom.ELTC_035POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_035Tests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private ELTC_035POM subscribeclasstocoursePOM;
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
		loginPOM = new LoginPOM(driver);
		subscribeclasstocoursePOM = new ELTC_035POM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}

	@Test
	public void createaCourseTest() {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@1234");
		loginPOM.clickLoginBtn();

		subscribeclasstocoursePOM.clickAdministrationBtn();
		subscribeclasstocoursePOM.clickClassesBtn();
		subscribeclasstocoursePOM.clickSubscribeClassToCourseBtn();
		subscribeclasstocoursePOM.clickCourseName();
		subscribeclasstocoursePOM.clickSubscribingClassIcon();
		subscribeclasstocoursePOM.clickbuttonSubscribeClassToCourse();
		screenShot.captureScreenShot("First");
	}
}