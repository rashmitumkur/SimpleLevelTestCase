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
import com.training.pom.ELTC_032POM;
import com.training.pom.ELTC_033POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_033Tests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private ELTC_033POM createacoursePOM;
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
		createacoursePOM = new ELTC_033POM(driver);
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
	public void createaCourseTest() {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@1234");
		loginPOM.clickLoginBtn();

		createacoursePOM.clickAdministrationBtn();
		createacoursePOM.clickCreateaCourseBtn();
		createacoursePOM.sendtitle("Rashminewcourse3");
		createacoursePOM.sendcoursecode("Rashminewcoursecode3657");
		createacoursePOM.selectTeachers("401");
		createacoursePOM.selectCategoryDropDown("(OL) Online Learning");

		createacoursePOM.selectLanguage("English");
		createacoursePOM.clickcoursesubmitBtn();
		screenShot.captureScreenShot("First");
	}
}