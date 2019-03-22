package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ELTC_063POM {

	private WebDriver driver;

	public ELTC_063POM(WebDriver driver) {
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

	// 1. click on Reporting tab
	@FindBy(xpath = "//a[@title='Reporting']")
	private WebElement reportingTab;

	public void clickReportingTab() {
		this.reportingTab.click();
	}

	// 2. click on Followed students link
	@FindBy(xpath = "//a[contains(text(),'Followed students')]")
	private WebElement followedStudentsLink;

	public void clickFollowedStudentsLink() {
		this.followedStudentsLink.click();
	}

	// 3. enter student name in keyword textbox
	@FindBy(id = "search_user_keyword")
	private WebElement keyword;

	public void sendkeyword(String keyword) {
		this.keyword.clear();
		this.keyword.sendKeys(keyword);
	}

	// 4. click on search button
	@FindBy(id = "search_user_submit")
	private WebElement searchBtn;

	public void clickSearchBtn() {
		this.searchBtn.click();
	}

	// 5. click on >> icon of the student
	@FindBy(xpath = "//img[@title='2rightarrow.png']")
	private WebElement icon1Btn;

	public void clickicon1Btn() {
		this.icon1Btn.click();
	}

	// 6. click on >> icon of the course
	@FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[7]/a[1]/img[1]")
	private WebElement icon2Btn;

	public void clickicon2Btn() {
		this.icon2Btn.click();
	}

	// 7. click on quiz icon of the test section - There is no quiz icon -Instead
	// click on Access details'
	@FindBy(xpath = "//a[contains(title(),'Access details')]")
	private WebElement accessDetailsIcon;

	public void clickAccessDetailsIcon() {
		this.accessDetailsIcon.click();
	}
}