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

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.ELTC_032POM;
import com.training.pom.ELTC_065POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_065Tests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private ELTC_065POM ELTC_065POM;
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
		ELTC_065POM = new ELTC_065POM(driver);
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
		loginPOM.sendUserName("newstudent3");
		loginPOM.sendPassword("Anirudh@12");
		loginPOM.clickLoginBtn();
		
		ELTC_065POM.clickCourseCatelogBtn();
		ELTC_065POM.sendSearch("1Selenium13");
		ELTC_065POM.clickSearchBtn();
		ELTC_065POM.clickSubscribeBtn();
		Assert.assertEquals("You have been registered to course: 1Selenium13", "You have been registered to course: 1Selenium13");
		ELTC_065POM.clickSubscribedCourseLink();
		
		ELTC_065POM.clicktestLink();
		//Test name containing name of the test & Status containing description should get displayed
		
		ELTC_065POM.clickTestNameLink();
		//Start Test button should get displayed
		
		ELTC_065POM.clickStartTestBtn();
		//Test questions should get displayed
		
		ELTC_065POM.clickQuestionOneRadioBtn();
		//answered questions should get displayed
		
		ELTC_065POM.clickSaveOneBtnBtn();
		//Save the 1st question-answer
		
		ELTC_065POM.clickQuestionOneRadioBtn();
		//answered questions should get displayed
		
		ELTC_065POM.clickSaveOneBtnBtn();
		//Save the 1st question-answer
		
		ELTC_065POM.clickQuestionTwoRadioBtn();
		//answered questions should get displayed
		
		ELTC_065POM.clickSaveTwoBtn();
		//Save the 1st question-answer
		
	}
}