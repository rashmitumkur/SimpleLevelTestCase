package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ELTC_094POM {

	private WebDriver driver;

	public ELTC_094POM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Logging in
	@FindBy(id = "login")
	private WebElement userName;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(xpath = "//button[@id='form-login_submitAuth']")
	private WebElement loginBtn;

	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}

	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}

	public void clickLoginBtn() {
		this.loginBtn.click();
	}

	// To verify whether application allows teacher to create a course, add
	// description, objective & Topics
	// Add a new course
	// 1. Click on Create a Course link
	@FindBy(xpath = "//a[contains(text(),'Create a course')]")
	private WebElement createaCourse;

	public void clickCreateaCourseBtn() {
		this.createaCourse.click();
	}

	// 2. Enter valid credential in Course name textbox
	@FindBy(id = "title")
	private WebElement coursename;

	public void sendcoursename(String coursename) {
		this.coursename.clear();
		this.coursename.sendKeys(coursename);
	}

	// 3. Click on Advanced Settings button
	@FindBy(id = "advanced_params")
	private WebElement advancedsettings;

	public void clickAdvancedSettingsBtn() {
		this.advancedsettings.click();
	}

	// 4. Select Valid credentials from Category list box
	@FindBy(id = "add_course_category_code")
	private WebElement categoryDropDown;

	public void selectCategoryDropDown(String string) {
		Select drop = new Select(categoryDropDown);
		drop.selectByValue(string);
	}

	// 5. Enter valid credential in Course code textbox
	@FindBy(id = "add_course_wanted_code")
	private WebElement coursecode;

	public void sendcoursecode(String coursecode) {
		this.coursecode.clear();
		this.coursecode.sendKeys(coursecode);
	}

	// 6. Select Language
	@FindBy(id = "add_course_course_language")
	private WebElement language;

	public void selectLanguage(String string) {
		Select drop = new Select(language);
		drop.selectByVisibleText(string);
	}

	// 7. Click on Create this course button
	@FindBy(id = "add_course_submit")
	private WebElement coursesubmit;

	public void clickcoursesubmitBtn() {
		this.coursesubmit.click();
	}

	// 8. click on Add an introduction icon
	@FindBy(xpath = "//*[@id=\"course_tools\"]/div[1]/div/div[2]/div/a[1]")
	private WebElement addintroductiontext;

	public void clickaddintroductiontextBtn() {
		this.addintroductiontext.click();
	}

	// 9. Enter valid credentials in textbox

	@FindBy(xpath = "//body/p")
	private WebElement iframe;

	public void sendiframe(String string) throws InterruptedException {

		int iframe = driver.findElements(By.tagName("iframe")).size();
		System.out.println(iframe);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);

		Thread.sleep(3000);
		this.iframe.click();
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("Selenium testing");
		// this.iframe.sendKeys(Keys.SPACE+"Ketuuu");
		System.out.println("Is editable??= " + this.iframe.isEnabled());
		driver.switchTo().defaultContent();
	}

	// 10. Click on Save intro text
	@FindBy(css = "#introduction_text_intro_cmdUpdate")
	private WebElement saveIntroText;

	public void clickSaveIntroBtn() {
		this.saveIntroText.click();
	}

	// 11. Click on Course description icon
	@FindBy(xpath = "//a[contains(text(),'Course description')]")
	private WebElement courseDescriptionLink;

	public void clickCourseDescriptionLink() {
		this.courseDescriptionLink.click();
	}

	// 12. Click on Description icon
	@FindBy(xpath = "//img[@title='Description']")
	private WebElement descriptionIcon;

	public void clickdescriptionIcon() {
		this.descriptionIcon.click();
	}

	// 13. Enter valid credentials in Title textbox
	@FindBy(id = "course_description_title")
	private WebElement descriptionTitle;

	public void sendDescriptionTitle(String descriptionTitle) {
		this.descriptionTitle.clear();
		this.descriptionTitle.sendKeys(descriptionTitle);
	}

	// 14. Enter valid credentials in Content text box

	@FindBy(xpath = "//body/p")
	private WebElement iframetwo;

	public void sendIframeTwo(String string) throws InterruptedException {

		int iframetwo = driver.findElements(By.tagName("iframetwo")).size();
		System.out.println(iframetwo);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);

		Thread.sleep(3000);
		this.iframetwo.click();
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("Selenium testing two");
		System.out.println("Is editable??= " + this.iframetwo.isEnabled());
		driver.switchTo().defaultContent();
	}

	// 15. Click on Save button
	@FindBy(id = "course_description_submit")
	private WebElement courseDescriptionSubmit;

	public void clickCourseDescriptionSubmitBtn() {
		this.courseDescriptionSubmit.click();
	}

	// 16. Click on Objectives icon
	@FindBy(xpath = "//img[@title='Objectives']")
	private WebElement objectiveIcon;

	public void clickObjectiveIcon() {
		this.objectiveIcon.click();
	}

	// 17. Enter valid credentials in Title textbox
	@FindBy(id = "course_description_title")
	private WebElement objectiveTitle;

	public void sendObjectiveTitle(String objectiveTitle) {
		this.objectiveTitle.clear();
		this.objectiveTitle.sendKeys(objectiveTitle);
	}

	// 18. Enter valid credentials in Content text box

	@FindBy(xpath = "//body/p")
	private WebElement iframeThree;

	public void sendIframeThree(String string) throws InterruptedException {

		int iframeThree = driver.findElements(By.tagName("iframeThree")).size();
		System.out.println(iframeThree);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);

		Thread.sleep(3000);
		this.iframeThree.click();
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("Selenium testing three");
		System.out.println("Is editable??= " + this.iframetwo.isEnabled());
		driver.switchTo().defaultContent();
	}

	// 19. Click on Save button
	@FindBy(id = "course_description_submit")
	private WebElement courseDescriptionSubmit2;

	public void clickCourseDescriptionSubmitBtn2() {
		this.courseDescriptionSubmit2.click();
	}

	// 20. Click on Topics icon
	@FindBy(xpath = "//img[@title='Topics']")
	private WebElement topicsIcon;

	public void clickTopicsIcon() {
		this.topicsIcon.click();
	}

	// 21. Enter valid credentials in Title textbox

	@FindBy(id = "course_description_title")
	private WebElement topicsTitle;

	public void sendTopicsTitle(String sendTopicsTitle) {
		this.topicsTitle.clear();
		this.topicsTitle.sendKeys(sendTopicsTitle);
	}

	// 22. Enter valid credentials in Content text box

	@FindBy(xpath = "//body/p")
	private WebElement iframeFour;

	public void sendIframeFour(String string) throws InterruptedException {

		int iframeFour = driver.findElements(By.tagName("iframeFour")).size();
		System.out.println(iframeFour);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);

		Thread.sleep(3000);
		this.iframeFour.click();
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("Selenium testing four");
		System.out.println("Is editable??= " + this.iframetwo.isEnabled());
		driver.switchTo().defaultContent();
	}

	// 23. Click on Save button
	@FindBy(id = "course_description_submit")
	private WebElement courseDescriptionSubmit3;

	public void clickCourseDescriptionSubmitBtn3() {
		this.courseDescriptionSubmit3.click();
	}
	
		
	//25.click on Course catalog
	@FindBy(id = "//a[contains(text(),'Course catalog')]")
	private WebElement courseCatalog;

	public void clickCourseCatalogBtn() {
		this.courseCatalog.click();
	}
	
	//26.Enter course name to register in search textbox
	@FindBy(xpath = "//input[@name='search_term']")
	private WebElement searchCourseName;

	public void sendSearchCourseName(String searchCourseName) {
		this.searchCourseName.clear();
		this.searchCourseName.sendKeys(searchCourseName);
	}
	
	//27. click on search button
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement searchBtn;

	public void clickSearchBtn() {
		this.searchBtn.click();
	}
	
	//28. Click on Subscribe button of the course to get registered
	@FindBy(xpath = "//a[@title='Subscribe']")
	private WebElement subscribeBtn;

	public void clickSubscribeBtn() {
		this.subscribeBtn.click();
	}
	
	//29. Click on Course Introduction icon
	@FindBy(xpath = "//a[contains(text(),'Rashminewcourse1g')]")
	private WebElement subscribedCourseBtn;

	public void clickSubscribedCourseBtn() {
		this.subscribedCourseBtn.click();
	}
	//There is no Course Introduction icon
	
	
	//30.Click on Course Description icon
	@FindBy(xpath = "//a[@id='istooldesc_1153']")
	private WebElement courseDescriptionBtn;

	public void clickcourseDescriptionBtn() {
		this.courseDescriptionBtn.click();
	}
	
	//31. Click on Course Objective icon - There is no Course Objective icon
	
	//32. Click on Course Topics icon - There is no Course Topics icon
	
	//33. Login as Admin
		
	//34. click on Reporting tab
	@FindBy(xpath = "//a[@title='Reporting']")
	private WebElement reportingBtn;

	public void clickReportingBtn() {
		this.reportingBtn.click();
	}
	
	//35. click on Followed students link
	@FindBy(xpath = "//a[contains(text(),'Followed students')]")
	private WebElement followedStudentsBtn;

	public void clickFollowedStudentsBtn() {
		this.followedStudentsBtn.click();
	}
	
	//36. enter student name in keyword textbox
	@FindBy(xpath = " //input[@id='search_user_keyword']")
	private WebElement studentNameSearch;

	public void sendStudentNameSearch(String studentNameSearch) {
		this.studentNameSearch.clear();
		this.studentNameSearch.sendKeys(studentNameSearch);
	}
	
	//37. click on search button
	@FindBy(xpath = "//button[@id='search_user_submit']")
	private WebElement searchBtnTwo;

	public void clickSearchBtnTwo() {
		this.searchBtnTwo.click();
	}
	
	//38. click on >> icon of the student
	@FindBy(xpath = "//img[@title='Details csm1']")
	private WebElement iconOne;

	public void clickIconOne() {
		this.iconOne.click();
	}
	
	//39. click on >> icon of the course
	@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[7]/a[1]/img[1]")
	private WebElement iconTwo;

	public void clickIconTwo() {
		this.iconTwo.click();
	}
}
