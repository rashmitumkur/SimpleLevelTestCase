package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ELTC_065POM {

	private WebDriver driver;

	public ELTC_065POM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Logging in as student
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

	// 1. click on Course catalog
	@FindBy(xpath = "//a[contains(text(),'Course catalog')]")
	private WebElement courseCatelogBtn;

	public void clickCourseCatelogBtn() {
		this.courseCatelogBtn.click();
	}

	// 2. Enter course name to register in search textbox
	@FindBy(name = "search_term")
	private WebElement searchTextBox;

	public void sendSearch(String searchTextBox) {
		this.searchTextBox.clear();
		this.searchTextBox.sendKeys(searchTextBox);
	}

	// 3. click on search button
	@FindBy(name = "search_term")
	private WebElement searchBtn;

	public void clickSearchBtn() {
		this.searchBtn.click();
	}

	// 4. Click on Subscribe button of the course to get registered
	@FindBy(xpath = "//a[@title='Subscribe']")
	private WebElement subscribeBtn;

	public void clickSubscribeBtn() {
		this.subscribeBtn.click();
	}

	// Click on the subscribed course link
	@FindBy(xpath = "//a[@title='1Selenium14']")
	private WebElement subscribedCourseLink;

	public void clickSubscribedCourseLink() {
		this.subscribedCourseLink.click();
	}

	// 5. Click on Assessment icon - instead click on Test icon
	@FindBy(xpath = "//a[@id='istooldesc_30']")
	private WebElement testLink;

	public void clicktestLink() {
		this.testLink.click();
	}
	
	//6. Click on Test name link
	@FindBy(xpath = "//a[contains(text(),'Rashmi Test one')]")
	private WebElement testNameLink;

	public void clickTestNameLink() {
		this.testNameLink.click();
	}
	
	//7. click on Start Test button
	@FindBy(xpath = "//a[@class='btn btn-success btn-large']")
	private WebElement startTestBtn;

	public void clickStartTestBtn() {
		this.startTestBtn.click();
	}
	
	//8. Answer the 1st questions
	@FindBy(xpath = "//input[@id='choice-6-3']")
	private WebElement questionOneRadioBtn;

	public void clickQuestionOneRadioBtn() {
		this.questionOneRadioBtn.click();
	}
	
	//Saving the 1st question-answer
		@FindBy(xpath = "//button[@name='save_now']")
		private WebElement saveOneBtn;

		public void clickSaveOneBtnBtn() {
			this.saveOneBtn.click();
		}
		
		// Answer the 2nd question - 9. Click on End Test button
		@FindBy(xpath = "//input[@id='choice-7-1']")
		private WebElement questionTwoRadioBtn;

		public void clickQuestionTwoRadioBtn() {
			this.questionTwoRadioBtn.click();
		}
		
		//Saving the 2nd question-answer & clicking 'End Test' button.
			@FindBy(xpath = "//button[@name='save_now']")
			private WebElement saveTwoBtn;

			public void clickSaveTwoBtn() {
				this.saveTwoBtn.click();
			}
}