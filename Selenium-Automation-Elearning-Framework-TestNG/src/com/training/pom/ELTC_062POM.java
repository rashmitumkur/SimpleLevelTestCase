package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ELTC_062POM {

	private WebDriver driver;

	public ELTC_062POM(WebDriver driver) {
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

	@FindBy(xpath = "//a[@title='My courses']")
	private WebElement myCoursesTab;

	public void clickMyCoursesTab() {
		this.myCoursesTab.click();
	}

	@FindBy(xpath = "//a[contains(text(),'Rashminewcourse1g')]")
	private WebElement courseLink;

	public void clickCourseLink() {
		this.courseLink.click();
	}

	// 1. Click on Tests icon
	@FindBy(xpath = "//a[@id='istooldesc_1158']")
	private WebElement testsLink;

	public void clickTestsLink() {
		this.testsLink.click();
	}

	// 2. Click on Create a new test button
	@FindBy(xpath = "//img[@title='Create a new test']")
	private WebElement newTest;

	public void clickNewTestBtn() {
		this.newTest.click();
	}
	
	//3. Enter valid credentials in Test name textbox
	@FindBy(id = "exercise_title")
	private WebElement testName;

	public void sendTestName(String testName) {
		this.testName.clear();
		this.testName.sendKeys(testName);
	}
		// 4. click on advanced setting button
		@FindBy(id = "advanced_params")
		private WebElement advancedsettings;

		public void clickAdvancedSettingsBtn() {
			this.advancedsettings.click();
		}	
			// 5. enter valid credentials in Give a context to the test textbox
		@FindBy(xpath = "//body/p")
		private WebElement iframeOne;

		public void sendIframeOne(String string) throws InterruptedException {

			int iframeOne = driver.findElements(By.tagName("iframeOne")).size();
			System.out.println(iframeOne);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(0);

			Thread.sleep(3000);
			this.iframeOne.click();
			Thread.sleep(3000);
			driver.switchTo().activeElement().sendKeys("Selenium testing");
			System.out.println("Is editable??= " + this.iframeOne.isEnabled());
			driver.switchTo().defaultContent();
		}
		
		//6. click on At end of test radio button in Feedback section
		@FindBy(xpath = "//input[@id='exerciseType_0']")
		private WebElement feedback;

		public void clickfeedbackRadioBtn() {
			this.feedback.click();
		}	
		
		
		//7. click on Enable start time checkbox. 8. Select valid credentials in time sections
		@FindBy(name = "activate_start_date_check")
		private WebElement enableStartTime;

		public void clickEnableStartTimeCheckBox() {
			this.enableStartTime.click();
		}
		
		//9. Enter valid credentials in Pass percentage textbox
		@FindBy(id = "pass_percentage")
		private WebElement passPercentage;

		public void sendPassPercentage(String passPercentage) {
			this.passPercentage.clear();
			this.passPercentage.sendKeys(passPercentage);
		}
		
		//10. Click on Proceed to questions button
		@FindBy(id = "exercise_admin_submitExercise")
		private WebElement proceedToQuestions;

		public void clickproceedToQuestions() {
			this.proceedToQuestions.click();
		}
		
		//11. Click on Multiple Choice icon
		@FindBy(xpath = "//img[@title='Multiple choice']")
		private WebElement multipleChoice;

		public void clickMultipleChoice() {
			this.multipleChoice.click();
}
		
		//12. Enter valid credentials in Questions textbox
		@FindBy(id = "question_admin_form_questionName")
		private WebElement questionName;

		public void sendQuestionName(String questionName) {
			this.questionName.clear();
			this.questionName.sendKeys(questionName);
		}
		
		//13. enter valid credentials in first option textbox
		@FindBy(xpath = "//body/p")
		private WebElement iframeTwo;

		public void sendIframeTwo(String string) throws InterruptedException {

			int iframeTwo = driver.findElements(By.tagName("iframeTwo")).size();
			System.out.println(iframeTwo);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(1);

			Thread.sleep(3000);
			this.iframeTwo.click();
			Thread.sleep(3000);
			driver.switchTo().activeElement().sendKeys("QTP");
			System.out.println("Is editable??= " + this.iframeTwo.isEnabled());
			driver.switchTo().defaultContent();
		}
		
		//14. enter valid credentials in second option textbox
		@FindBy(xpath = "//body/p")
		private WebElement iframeThree;

		public void sendIframeThree(String string) throws InterruptedException {

			//int iframeThree = driver.findElements(By.tagName("iframeThree")).size();
			System.out.println(iframeThree);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(3);

			Thread.sleep(3000);
			this.iframeThree.click();
			Thread.sleep(3000);
			driver.switchTo().activeElement().sendKeys("Selenium testing");
			System.out.println("Is editable??= " + this.iframeThree.isEnabled());
			driver.switchTo().defaultContent();
		}
		
		//15. enter valid credentials in third option textbox
		@FindBy(xpath = "//body/p")
		private WebElement iframeFour;

		public void sendIframeFour(String string) throws InterruptedException {

			//int iframeThree = driver.findElements(By.tagName("iframeThree")).size();
			System.out.println(iframeFour);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(5);

			Thread.sleep(3000);
			this.iframeThree.click();
			Thread.sleep(3000);
			driver.switchTo().activeElement().sendKeys("Java");
			System.out.println("Is editable??= " + this.iframeThree.isEnabled());
			driver.switchTo().defaultContent();
		}
		
		//16. enter valid credentials in forth option textbox
		@FindBy(xpath = "//body/p")
		private WebElement iframeFive;

		public void sendIframeFive(String string) throws InterruptedException {

			//int iframeThree = driver.findElements(By.tagName("iframeThree")).size();
			System.out.println(iframeFive);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(7);

			Thread.sleep(3000);
			this.iframeThree.click();
			Thread.sleep(3000);
			driver.switchTo().activeElement().sendKeys("C");
			System.out.println("Is editable??= " + this.iframeFive.isEnabled());
			driver.switchTo().defaultContent();
		}
		
		//17. click second option radio button
		@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/form[1]/fieldset[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]")
		private WebElement correctAnswerOne;

		public void clickCorrectAnswerOneRadioBtn() {
			this.correctAnswerOne.click();
		}	
		
		//18. click on Add this question to the test
		@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/form[1]/fieldset[1]/div[4]/div[1]/button[3]")
		private WebElement addQuestionOne;

		public void clickAddQuestionOneBtn() {
			this.addQuestionOne.click();
		}
		
		//19. Click on Multiple Choice icon
		@FindBy(xpath = "//img[@title='Multiple choice']")
		private WebElement multipleChoice2;

		public void clickMultipleChoice2() {
			this.multipleChoice2.click();
}
		
		//20. Enter valid credentials in Questions textbox
		@FindBy(id = "question_admin_form_questionName")
		private WebElement questionNameTwo;

		public void sendQuestionNameTwo(String questionNameTwo) {
			this.questionNameTwo.clear();
			this.questionNameTwo.sendKeys(questionNameTwo);
		}
		
		//21. enter valid credentials in first option textbox
		@FindBy(xpath = "//body/p")
		private WebElement iframeSix;

		public void sendIframeSix(String string) throws InterruptedException {

			int iframeThree = driver.findElements(By.tagName("iframeSix")).size();
			System.out.println(iframeSix);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(1);

			Thread.sleep(3000);
			this.iframeSix.click();
			Thread.sleep(3000);
			driver.switchTo().activeElement().sendKeys("Python");
			System.out.println("Is editable??= " + this.iframeSix.isEnabled());
			driver.switchTo().defaultContent();
		}
		
		//22. enter valid credentials in second option textbox
		@FindBy(xpath = "//body/p")
		private WebElement iframeSeven;

		public void sendIframeSeven(String string) throws InterruptedException {

			//int iframeThree = driver.findElements(By.tagName("iframeThree")).size();
			System.out.println(iframeSeven);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(3);

			Thread.sleep(3000);
			this.iframeSeven.click();
			Thread.sleep(3000);
			driver.switchTo().activeElement().sendKeys("Java");
			System.out.println("Is editable??= " + this.iframeSeven.isEnabled());
			driver.switchTo().defaultContent();
		}
		
		//23. enter valid credentials in third option textbox
		@FindBy(xpath = "//body/p")
		private WebElement iframeEight;

		public void sendIframeEight(String string) throws InterruptedException {

			//int iframeThree = driver.findElements(By.tagName("iframeThree")).size();
			System.out.println(iframeEight);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(5);

			Thread.sleep(3000);
			this.iframeEight.click();
			Thread.sleep(3000);
			driver.switchTo().activeElement().sendKeys("C");
			System.out.println("Is editable??= " + this.iframeEight.isEnabled());
			driver.switchTo().defaultContent();
		}
		
		//24. enter valid credentials in forth option textbox
		@FindBy(xpath = "//body/p")
		private WebElement iframeNine;

		public void sendIframeNine(String string) throws InterruptedException {

			//int iframeThree = driver.findElements(By.tagName("iframeThree")).size();
			System.out.println(iframeNine);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(7);

			Thread.sleep(3000);
			this.iframeNine.click();
			Thread.sleep(3000);
			driver.switchTo().activeElement().sendKeys("C#");
			System.out.println("Is editable??= " + this.iframeNine.isEnabled());
			driver.switchTo().defaultContent();
		}
		
		//25. click second option radio button
		@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/form[1]/fieldset[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]")
		private WebElement correctAnswerTwo;

		public void clickCorrectAnswerTwoRadioBtn() {
			this.correctAnswerTwo.click();
		}	
		
		//26. click on Add this question to the test
		@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/form[1]/fieldset[1]/div[4]/div[1]/button[3]")
		private WebElement addQuestionTwo;

		public void clickAddQuestionTwoBtn() {
			this.addQuestionTwo.click();
		}
		
		//27. click on preview icon
		@FindBy(xpath = "//img[@title='Preview']")
		private WebElement previewIcon;

		public void clickPreviewIcon() {
			this.previewIcon.click();
		}
		
		//28. Click on Start test button
		@FindBy(xpath = "//a[@class='btn btn-success btn-large']")
		private WebElement previewStartBtn;

		public void clickPreviewStartBtn() {
			this.previewStartBtn.click();
		}
		
		//29. answer the question radio button
		@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[3]/form[1]/div[1]/div[2]/label[2]/input[1]")
		private WebElement previewQuestionOne;

		public void clickPreviewQuestionOne() {
			this.previewQuestionOne.click();
		}
		
		//30. click on Next Question button
		@FindBy(xpath = "//button[@name='save_now']")
		private WebElement saveOne;

		public void clickSaveOne() {
			this.saveOne.click();
		}
		
		//31. answer the question radio button
		@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[3]/form[1]/div[1]/div[2]/label[2]/input[1]")
		private WebElement previewQuestionTwo;

		public void clickPreviewQuestionTwo() {
			this.previewQuestionTwo.click();
		}
		
		//32. Click on End Test button
		@FindBy(xpath = "//button[@name='save_now']")
		private WebElement saveTwo;

		public void clickSaveTwo() {
			this.saveTwo.click();
		}
}
