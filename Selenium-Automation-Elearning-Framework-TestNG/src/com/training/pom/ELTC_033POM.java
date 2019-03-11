package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ELTC_033POM {
	private WebDriver driver;

	public ELTC_033POM(WebDriver driver) {
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

	// To verify whether application allows admin to create course
	// 1. Click on Administration tab
	@FindBy(xpath = "//a[@title='Administration']")
	private WebElement administration;

	public void clickAdministrationBtn() {
		this.administration.click();
	}

	// Add a new course
	// 2. Click on Create a Course link
	@FindBy(xpath = "//a[contains(text(),'Create a course')]")
	private WebElement createaCourse;

	public void clickCreateaCourseBtn() {
		this.createaCourse.click();
	}

	// 3. Enter valid credential in Title textbox
	@FindBy(id = "update_course_title")
	private WebElement title;

	public void sendtitle(String sendtitle) {
		this.title.clear();
		this.title.sendKeys(sendtitle);
	}

	// 4. Enter valid credential in code textbox
	@FindBy(id = "visual_code")
	private WebElement coursecode;

	public void sendcoursecode(String sendcoursecode) {
		this.coursecode.clear();
		this.coursecode.sendKeys(sendcoursecode);
	}

//5. Select Valid credentials in Teacher list box
	@FindBy(id = "course_teachers")
	private WebElement teachers;

	public void selectTeachers(String string) {
		Select drop = new Select(teachers);
		drop.selectByValue(string);
	}

	// 6. Select Valid credentials from Category list box
	@FindBy(id = "update_course_category_code")
	private WebElement categoryDropDown;

	public void selectCategoryDropDown(String string) {
		Select drop = new Select(categoryDropDown);
		drop.selectByVisibleText(string);
	}

	// 7. Select Valid credentials from Language list box
	@FindBy(id = "update_course_course_language")
	private WebElement language;

	public void selectLanguage(String string) {
		Select drop = new Select(language);
		drop.selectByVisibleText(string);
	}

	// 8. Click on Create a course button
	@FindBy(id = "update_course_submit")
	private WebElement coursesubmit;

	public void clickcoursesubmitBtn() {
		this.coursesubmit.click();
	}

}
