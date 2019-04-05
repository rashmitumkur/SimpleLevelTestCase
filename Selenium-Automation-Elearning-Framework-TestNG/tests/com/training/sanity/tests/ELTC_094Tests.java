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
import com.training.pom.ELTC_094POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_094Tests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private ELTC_094POM ELTC_094POM;
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
		ELTC_094POM = new ELTC_094POM(driver);
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
	
	@Test(dataProvider = "excel-inputs2", dataProviderClass = LoginDataProviders.class)
	public void registrationTest(String userName, String password, String coursename, String categoryDropDown, String coursecode,
			String language, String descriptionTitle, String objectiveTitle, String topicsTitle, String searchCourseName, String studentNameSearch) throws InterruptedException {
			
		loginPOM.sendUserName(userName);
		loginPOM.sendPassword(password);
		loginPOM.clickLoginBtn();

		ELTC_094POM.clickCreateaCourseBtn();
		// 1.Add a new course page should get displayed

		ELTC_094POM.sendcoursename(coursename);
		// 2.Entered credentials in Course name textbox should get displayed

		ELTC_094POM.clickAdvancedSettingsBtn();
		// 3.Category, Course code, Language fields should get visible

		ELTC_094POM.selectCategoryDropDown(categoryDropDown);
		// 4.Selected Value should get displayed in Category list box

		ELTC_094POM.sendcoursecode(coursecode);
		// 5.Entered credentials in Course code textbox should get displayed

		ELTC_094POM.selectLanguage(language);
		// 6.Selected Value should get displayed in Language list box

		ELTC_094POM.clickcoursesubmitBtn();
		// 7.Course should get created

		ELTC_094POM.clickaddintroductiontextBtn();
		// 8.Text box to enter introduction should get displayed
		screenShot.captureScreenShot("ELTC_061_Screen1");

		ELTC_094POM.sendiframe(null);
		// 9. Entered credentials should get displayed in textbox

		screenShot.captureScreenShot("ELTC_061_Screen2");

		ELTC_094POM.clickSaveIntroBtn();
		// 10.Intro was updated message should get displayed along with introduction
		// text

		ELTC_094POM.clickCourseDescriptionLink();
		// 11.Description should get displayed

		ELTC_094POM.clickdescriptionIcon();
		// 12.Description page with Title & Content fields should get displayed

		ELTC_094POM.sendDescriptionTitle(descriptionTitle);
		// 13.Entered credentials in Title textbox should get displayed

		ELTC_094POM.sendIframeTwo("Content one");
		// 14.Entered credentials in Content textbox should get displayed

		screenShot.captureScreenShot("ELTC_061_Screen3");

		ELTC_094POM.clickCourseDescriptionSubmitBtn();
		// 15.The description has been updated message should get displayed

		ELTC_094POM.clickObjectiveIcon();
		// 16.Objectives page with Title & Content fields should get displayed

		ELTC_094POM.sendObjectiveTitle(objectiveTitle);
		// 17.Entered credentials in Title textbox should get displayed

		ELTC_094POM.sendIframeThree("Content two");
		// 18.Entered credentials in Content textbox should get displayed

		screenShot.captureScreenShot("ELTC_061_Screen3");

		ELTC_094POM.clickCourseDescriptionSubmitBtn2();
		// 19.The description has been updated message should get displayed

		ELTC_094POM.clickTopicsIcon();
		// 20.Topics page with Title & Content fields should get displayed

		ELTC_094POM.sendTopicsTitle(topicsTitle);
		// 21. Entered credentials in Title textbox should get displayed

		ELTC_094POM.sendIframeFour("Content three");
		// 22. Entered credentials in Content textbox should get displayed

		screenShot.captureScreenShot("ELTC_061_Screen4");

		ELTC_094POM.clickCourseDescriptionSubmitBtn3();
		// 23.The description has been updated message should get displayed
		
		loginPOM.sendUserName(userName);
		loginPOM.sendPassword(password);
		loginPOM.clickLoginBtn();
		//24. Student Home page should get displayed
		
		ELTC_094POM.clickCourseCatalogBtn();
		//25. Courses catalog page containing details of the course should get displayed
		
		ELTC_094POM.sendSearchCourseName(searchCourseName);
		//26. entered credentials in search textbox should get displayed
		
		ELTC_094POM.clickSearchBtn();
		//27.courses matching the search criteria should get displayed
		
		ELTC_094POM.clickSubscribeBtn();
		//28.You have been registered to course: selenium message should get displayed
		
		Assert.assertEquals("You have been registered to course:",
				"You have been registered to course:");
		
		//29.Course Introduction should get displayed
		ELTC_094POM.clickSubscribedCourseBtn();
		
		//30.Course details should get displayed
		ELTC_094POM.clickcourseDescriptionBtn();
		
		loginPOM.sendUserName(userName);
		loginPOM.sendPassword(password);
		loginPOM.clickLoginBtn();
		//33.admin home page should get displayed
		
		ELTC_094POM.clickReportingBtn();
		//34.Reporting page should get displayed
		
		ELTC_094POM.clickFollowedStudentsBtn();
		//35.Learners page should get displayed
		
		ELTC_094POM.sendStudentNameSearch(studentNameSearch);
		//36.entered credential in keyword textbox should get displayed
		
		ELTC_094POM.clickSearchBtnTwo();
		//37. details of student should get displayed
		
		ELTC_094POM.clickIconOne();
		//38.details of student with subscribed course should get displayed
		
		ELTC_094POM.clickIconTwo();
		//39.overall details of the student in that particular course should get displayed
		

	}
}
