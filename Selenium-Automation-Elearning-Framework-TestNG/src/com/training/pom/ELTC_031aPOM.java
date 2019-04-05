package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ELTC_031aPOM {

	private WebDriver driver;

	public ELTC_031aPOM(WebDriver driver) {
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
	
	//Click on 'Add User'
			@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[2]/a[1]")
			private WebElement addUserLink;
			
			public void clickAddUserLink() {
				this.addUserLink.click();
			}

		// 2. Enter valid credential in First name textbox
		@FindBy(id = "firstname")
		private WebElement firstName;

		public void sendFirstName(String firstName) {
			this.firstName.clear();
			this.firstName.sendKeys(firstName);
		}

		// 3. Enter valid credential in Last name textbox
		@FindBy(id = "lastname")
		private WebElement lastName;

		public void sendLastName(String lastName) {
			this.lastName.clear();
			this.lastName.sendKeys(lastName);
		}

		// 4. Enter valid credential in e-mail textbox
		@FindBy(id = "email")
		private WebElement email;

		public void sendemail(String email) {
			this.email.clear();
			this.email.sendKeys(email);
		}

		// 5. Enter valid credential in username textbox
		@FindBy(id = "username")
		private WebElement userNameTwo;

		public void sendUserNameTwo(String userNameTwo) {
			this.userNameTwo.clear();
			this.userNameTwo.sendKeys(userNameTwo);
		}

		// 6. Enter valid credential in pass textbox
		@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/section[1]/form[1]/fieldset[1]/div[9]/div[1]/div[2]/label[1]/input[1]")
		private WebElement selectPasswordRadioBtn;

		public void clickSelectPasswordRadioBtn() {
			this.selectPasswordRadioBtn.click();
		}
		
		@FindBy(id = "password")
		private WebElement passwordTwo;

		public void sendPasswordTwo(String passwordTwo) {
			this.passwordTwo.clear();
			this.passwordTwo.sendKeys(passwordTwo);
		}

		/* 7. Enter valid credential in confirm password textbox - this is removed in the new webpage
		@FindBy(id = "pass2")
		private WebElement password2;

		public void sendPassword2(String password2) {
			this.password2.clear();
			this.password2.sendKeys(password2);
		}*/

		// 8. Enter valid credential in phone textbox
		@FindBy(id = "phone")
		private WebElement phone;

		public void sendPhone(String phone) {
			this.phone.clear();
			this.phone.sendKeys(phone);
		}

		// 9. Selected Valid credentials from Language list box
		@FindBy(id = "user_add_language")
		private WebElement language;

		public void selectLanguageDropDown(String string) {
			Select drop = new Select(language);
			drop.selectByVisibleText(string);
		}

		// 10. Click Student radio button in Profile
		@FindBy(id = "status_select")
		private WebElement profile;

		public void selectProfile(String string) {
			Select drop = new Select(profile);
			drop.selectByVisibleText(string);
		}

		// 11. Click on Register button
		@FindBy(xpath = "//button[@name='submit']")
		private WebElement registrationSubmit;

		public void clickRegistrationSubmitBtn() {
			this.registrationSubmit.click();
		}
		
		
}