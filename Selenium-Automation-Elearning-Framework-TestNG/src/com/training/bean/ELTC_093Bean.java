package com.training.bean;

public class ELTC_093Bean {
	
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String userNameTwo;
	private String passwordTwo;
	private String language;
	private String profile;
	

	public ELTC_093Bean() {
	}

	public ELTC_093Bean(String firstName, String lastName, String email, String phone, String userNameTwo,
			 String passwordTwo, String language, String profile) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.userNameTwo = userNameTwo;
		this.passwordTwo = passwordTwo;
		this.language = language;
		this.profile = profile;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastname) {
		this.lastName = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getUserNameTwo() {
		return userNameTwo;
	}

	public void setUserNameTwo(String userNameTwo) {
		this.userNameTwo = userNameTwo;
	}
	
	public String getPasswordTwo() {
		return passwordTwo;
	}

	public void setPasswordTwo(String passwordTwo) {
		this.passwordTwo = passwordTwo;
	}
	
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}
	@Override
	public String toString() {
		return "ELTC_093Bean [FirstName=" + firstName + "Lastname="
				+ lastName + ",email=\" + email + \",UserNametwo=" + userNameTwo + "PasswordTwo=" + passwordTwo + ",Phone=" + phone + "]";
	}

}

