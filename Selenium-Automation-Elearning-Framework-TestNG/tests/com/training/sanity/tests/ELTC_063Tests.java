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
import com.training.pom.ELTC_063POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_063Tests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private ELTC_063POM ELTC_063POM;
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
		ELTC_063POM = new ELTC_063POM(driver);
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
		loginPOM.sendUserName("Rashmiteacher1");
		loginPOM.sendPassword("Rashmi@12345");
		loginPOM.clickLoginBtn();

		ELTC_063POM.clickReportingTab();
		// 1. Reporting page should get displayed

		ELTC_063POM.clickFollowedStudentsLink();
		// 2. Learners page should get displayed

		ELTC_063POM.sendkeyword("Rashmi");
		// 3. entered credential in keyword textbox should get displayed

		ELTC_063POM.clickSearchBtn();
		// 4. details of student should get displayed

		ELTC_063POM.clickicon1Btn();
		// 5. details of student with subscribed course should get displayed

		ELTC_063POM.clickicon2Btn();
		// 6. overall details of the student in that particular course should get
		// displayed

		ELTC_063POM.clickAccessDetailsIcon();
		// 7. There is no quiz icon
	}
}
