package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ELTC_032POM {

	private WebDriver driver;

	public ELTC_032POM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Logging in
	@FindBy(id = "login")
	private WebElement userName;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "formLogin_submitAuth")
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

	// Create a course by teacher - TO verify whether application allows Teacher to
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
		drop.selectByVisibleText(string);
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
	
	@FindBy(xpath = "/html[1]/body[1]")
	private WebElement iframe;
	
	public void sendiframe(String string) {
		driver.switchTo().frame("0");
		this.iframe.click();
		this.iframe.sendKeys("iframe");
	}
	//10. Click on Save intro text
		@FindBy(id = "introduction_text_intro_cmdUpdate")
		private WebElement saveIntroText;

		public void clickSaveIntroBtn() {
			this.saveIntroText.click();
		}
}
