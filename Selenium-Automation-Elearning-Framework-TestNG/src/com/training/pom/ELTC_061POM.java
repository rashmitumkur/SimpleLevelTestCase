package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ELTC_061POM {

	private WebDriver driver;

	public ELTC_061POM(WebDriver driver) {
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

	public void sendcoursecode(String sendcoursecode) {
		this.coursecode.clear();
		this.coursecode.sendKeys(sendcoursecode);
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

	public void sendDescriptionTitle(String sendDescriptionTitle) {
		this.descriptionTitle.clear();
		this.descriptionTitle.sendKeys(sendDescriptionTitle);
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

	public void sendObjectiveTitle(String sendObjectiveTitle) {
		this.objectiveTitle.clear();
		this.objectiveTitle.sendKeys(sendObjectiveTitle);
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
}
