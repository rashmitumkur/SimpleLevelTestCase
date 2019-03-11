package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ELTC_031POM {
	private WebDriver driver;

	public ELTC_031POM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// TO verify whether application allows user to get registered as Student
	// 1. Click on Sign Up! link
	@FindBy(xpath = "//a[contains(text(),'Sign up!')]")
	private WebElement signUp;

	public void clicksignUpBtn() {
		this.signUp.click();
	}

	// 2. Enter valid credential in First name textbox
	@FindBy(id = "registration_firstname")
	private WebElement firstName;

	public void sendFirstName(String firstName) {
		this.firstName.clear();
		this.firstName.sendKeys(firstName);
	}

	// 3. Enter valid credential in Last name textbox
	@FindBy(id = "registration_lastname")
	private WebElement lastName;

	public void sendLastName(String lastName) {
		this.lastName.clear();
		this.lastName.sendKeys(lastName);
	}

	// 4. Enter valid credential in e-mail textbox
	@FindBy(id = "registration_email")
	private WebElement email;

	public void sendemail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}

	// 5. Enter valid credential in username textbox
	@FindBy(id = "username")
	private WebElement userName;

	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}

	// 6. Enter valid credential in pass textbox
	@FindBy(id = "pass1")
	private WebElement password;

	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}

	// 7. Enter valid credential in confirm password textbox
	@FindBy(id = "pass2")
	private WebElement password2;

	public void sendPassword2(String password2) {
		this.password2.clear();
		this.password2.sendKeys(password2);
	}

	// 8. Enter valid credential in phone textbox
	@FindBy(id = "registration_phone")
	private WebElement phone;

	public void sendPhone(String phone) {
		this.phone.clear();
		this.phone.sendKeys(phone);
	}

	// 9. Selected Valid credentials from Language list box
	@FindBy(id = "registration_language")
	private WebElement language;

	public void selectLanguageDropDown(String string) {
		Select drop = new Select(language);
		drop.selectByVisibleText(string);
	}

	// 10. Click Student radio button in Profile
	@FindBy(xpath = "//label[contains(text(),'Student (follows courses)')]")
	private WebElement profile;

	public void clickProfileRadioButton() {
		this.profile.click();
	}

	// 11. Click on Register button
	@FindBy(id = "registration_submit")
	private WebElement registrationSubmit;

	public void clickRegistrationSubmitBtn() {
		this.registrationSubmit.click();
	}
	
	
}
