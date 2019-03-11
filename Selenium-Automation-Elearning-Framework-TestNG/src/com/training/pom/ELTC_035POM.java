package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ELTC_035POM {
	private WebDriver driver;

	public ELTC_035POM(WebDriver driver) {
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

	// TO verify whether application allows admin to create classes
	// 1. Click on Administration tab
	@FindBy(xpath = "//a[@title='Administration']")
	private WebElement administration;

	public void clickAdministrationBtn() {
		this.administration.click();
	}

	// 2. Click on Classes link
	@FindBy(xpath = "//a[contains(text(),'Classes')]")
	private WebElement classes;

	public void clickClassesBtn() {
		this.classes.click();
	}

	// 3. Click on Subscribe class to courses icon of class
	@FindBy(xpath = "//a[@href='add_courses_to_usergroup.php?id=166']//img[@title='Subscribe class to courses']")
	private WebElement subscribeClassToCourse;

	public void clickSubscribeClassToCourseBtn() {
		this.subscribeClassToCourse.click();
	}

	//4. Select Course name to subscribe in Courses on the platform. : window
	@FindBy(xpath = "//*[@value='134']")
	private WebElement courseName;

	public void clickCourseName() {
		this.courseName.click();
		
	}

	// 5. Click on --> icon
	@FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/div[1]/form[1]/table[1]/tbody[1]/tr[3]/td[2]/button[2]\r\n"
			+ "")
	private WebElement subscribingClass;

	public void clickSubscribingClassIcon() {
		this.subscribingClass.click();
	}

	// 6. click on Subscribe class to Courses button
	@FindBy(xpath = "//button[contains(text(),'Subscribe class to courses')]")
	private WebElement buttonSubscribeClassToCourse;

	public void clickbuttonSubscribeClassToCourse() {
		this.buttonSubscribeClassToCourse.click();
	}
}
