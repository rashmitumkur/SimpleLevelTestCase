package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.ELTC_061POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_061Tests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private ELTC_061POM ELTC_061POM;
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
		ELTC_061POM = new ELTC_061POM(driver);
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
		loginPOM.sendUserName("rashmiteacher");
		loginPOM.sendPassword("Anirudh@1");
		loginPOM.clickLoginBtn();

		ELTC_061POM.clickCreateaCourseBtn();
		// 1.Add a new course page should get displayed

		ELTC_061POM.sendcoursename("Rashminewcourse1g");
		// 2.Entered credentials in Course name textbox should get displayed

		ELTC_061POM.clickAdvancedSettingsBtn();
		// 3.Category, Course code, Language fields should get visible

		ELTC_061POM.selectCategoryDropDown("PROJ");
		// 4.Selected Value should get displayed in Category list box

		ELTC_061POM.sendcoursecode("Rashminewcoursecode1g");
		// 5.Entered credentials in Course code textbox should get displayed

		ELTC_061POM.selectLanguage("English");
		// 6.Selected Value should get displayed in Language list box

		ELTC_061POM.clickcoursesubmitBtn();
		// 7.Course should get created

		ELTC_061POM.clickaddintroductiontextBtn();
		// 8.Text box to enter introduction should get displayed
		screenShot.captureScreenShot("ELTC_061_Screen1");

		ELTC_061POM.sendiframe(null);
		// 9. Entered credentials should get displayed in textbox

		screenShot.captureScreenShot("ELTC_061_Screen2");

		ELTC_061POM.clickSaveIntroBtn();
		// 10.Intro was updated message should get displayed along with introduction
		// text

		ELTC_061POM.clickCourseDescriptionLink();
		// 11.Description should get displayed

		ELTC_061POM.clickdescriptionIcon();
		// 12.Description page with Title & Content fields should get displayed

		ELTC_061POM.sendDescriptionTitle("Description one");
		// 13.Entered credentials in Title textbox should get displayed

		ELTC_061POM.sendIframeTwo("Content one");
		// 14.Entered credentials in Content textbox should get displayed

		screenShot.captureScreenShot("ELTC_061_Screen3");

		ELTC_061POM.clickCourseDescriptionSubmitBtn();
		// 15.The description has been updated message should get displayed

		ELTC_061POM.clickObjectiveIcon();
		// 16.Objectives page with Title & Content fields should get displayed

		ELTC_061POM.sendObjectiveTitle("Description one");
		// 17.Entered credentials in Title textbox should get displayed

		ELTC_061POM.sendIframeThree("Content two");
		// 18.Entered credentials in Content textbox should get displayed

		screenShot.captureScreenShot("ELTC_061_Screen3");

		ELTC_061POM.clickCourseDescriptionSubmitBtn2();
		// 19.The description has been updated message should get displayed

		ELTC_061POM.clickTopicsIcon();
		// 20.Topics page with Title & Content fields should get displayed

		ELTC_061POM.sendTopicsTitle("Description one");
		// 21. Entered credentials in Title textbox should get displayed

		ELTC_061POM.sendIframeFour("Content three");
		// 22. Entered credentials in Content textbox should get displayed

		screenShot.captureScreenShot("ELTC_061_Screen4");

		ELTC_061POM.clickCourseDescriptionSubmitBtn3();
		// 23.The description has been updated message should get displayed

	}
}
