package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ELTC_034POM {
	private WebDriver driver;

	public ELTC_034POM(WebDriver driver) {
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

	// 3. click on Add classes icon
	@FindBy(xpath = "//img[@title='Add classes']")
	private WebElement addClasses;

	public void clickAddClassesBtn() {
		this.addClasses.click();
	}

	// 4. Enter valid credentials in Name textbox
	@FindBy(id = "usergroup_name")
	private WebElement name;

	public void sendname(String sendname) {
		this.name.clear();
		this.name.sendKeys(sendname);
	}

	// 5. Enter valid credentials in Description textbox
	@FindBy(id = "usergroup_description")
	private WebElement description;

	public void senddescription(String senddescription) {
		this.description.clear();
		this.description.sendKeys(senddescription);
	}

//6. Select valid credentials in Group permissions list box
	@FindBy(id = "usergroup_visibility")
	private WebElement groupPermissions;

	public void selectGroupPermissions(String string) {
		Select drop = new Select(groupPermissions);
		drop.selectByValue(string);
	}

	// 7. Click on Add button
	@FindBy(id = "usergroup_submit")
	private WebElement add;

	public void clickaddBtn() {
		this.add.click();
	}
}
