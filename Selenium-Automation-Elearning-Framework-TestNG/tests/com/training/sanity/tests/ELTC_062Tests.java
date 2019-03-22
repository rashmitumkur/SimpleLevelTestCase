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
import com.training.pom.ELTC_062POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_062Tests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private ELTC_062POM ELTC_062POM;
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
		ELTC_062POM = new ELTC_062POM(driver);
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
	public void createaCourseTest() throws InterruptedException {
		loginPOM.sendUserName("rashmiteacher");
		loginPOM.sendPassword("Anirudh@1");
		loginPOM.clickLoginBtn();

		ELTC_062POM.clickMyCoursesTab();
		ELTC_062POM.clickCourseLink();
		
		ELTC_062POM.clickTestsLink();
		//1.Test Page containing Create a new test button
		
		ELTC_062POM.clickNewTestBtn();
		//2.Create a new test page containing Test name text should get displayed
		
		ELTC_062POM.sendTestName("Rashmi Test name one");
		//3.Entered credentials in Test name textbox should get displayed
		
		ELTC_062POM.clickAdvancedSettingsBtn();
		//4.All the hidden fields should get displayed
		
		ELTC_062POM.sendIframeOne(null);
		//5. entered credentials in Give a context to the test textbox should get displayed
		
		ELTC_062POM.clickfeedbackRadioBtn();
		//6.At end of test radio button in Feedback section should get displayed
		
		ELTC_062POM.clickEnableStartTimeCheckBox();
		//7. Enable start time checkbox should get displayed with date & time for the test. 8. selected timings should get displayed
		
		ELTC_062POM.sendPassPercentage("60");
		//9. Entered credentials in Pass percentage textbox should get displayed
		
		ELTC_062POM.clickproceedToQuestions();
		//10.Exercise added message with options to add Questions should get displayed
		
		ELTC_062POM.clickMultipleChoice();
		//11.Add this question to the test: Multiple choice page containing fields to enter questions & answers should get displayed
		
		ELTC_062POM.sendQuestionName("which course you are learning");
		//12. entered credentials in Questions textbox should get displayed
		
		ELTC_062POM.sendIframeTwo(null);
		//13.entered credentials in first option textbox should get displayed
		
		ELTC_062POM.sendIframeThree(null);
		//14.entered credentials in second option textbox should get displayed
		
		ELTC_062POM.sendIframeFour(null);
		//15.entered credentials in third option textbox should get displayed
		
		ELTC_062POM.sendIframeFive(null);
		//16.entered credentials in forth option textbox should get displayed
		
		ELTC_062POM.clickCorrectAnswerOneRadioBtn();
		//17.Second radio button should get selected
		
		ELTC_062POM.clickAddQuestionOneBtn();
		//18. 1 questions, for a total score (all questions) of 0. message should get displayed
		
		ELTC_062POM.clickMultipleChoice2();
		//19.Add this question to the test: Multiple choice page containing fields to enter questions & answers should get displayed
		
		ELTC_062POM.sendQuestionNameTwo("which language are you using in selenium");
		//20.entered credentials in Questions textbox should get displayed
		
		ELTC_062POM.sendIframeSix(null);
		//21.entered credentials in first option textbox should get displayed
		
		ELTC_062POM.sendIframeSeven(null);
		//22.entered credentials in second option textbox should get displayed
		
		ELTC_062POM.sendIframeEight(null);
		//23.entered credentials in third option textbox should get displayed
		
		ELTC_062POM.sendIframeNine(null);
		//24. entered credentials in forth option textbox should get displayed
		
		ELTC_062POM.clickCorrectAnswerTwoRadioBtn();
		//25. second radio button should get selected
		
		ELTC_062POM.clickAddQuestionTwoBtn();
		//26. 2 questions, for a total score (all questions) of 0.. message should get displayed
		
		ELTC_062POM.clickPreviewIcon();
		//27. Start test button should get displayed
		
		ELTC_062POM.clickPreviewStartBtn();
		//28. test with the questions & options should get displayed
		
		ELTC_062POM.clickPreviewQuestionOne();
		//29.answered radio button should get displayed
		
		ELTC_062POM.clickSaveOne();
		//30. next question should get displayed
		
		ELTC_062POM.clickPreviewQuestionTwo();
		//31. answered radio button should get displayed
		
		ELTC_062POM.clickSaveTwo();
		//32.test should get submitted & results should get displayed based on the authoring & answer
		
		screenShot.captureScreenShot("ELTC_062_Screen1");

	}
}
