package com.saha.test.contants;

import org.openqa.selenium.By;

public interface General_Constants {

	By EMAIL_TEXTBOX = By.id("LoginModel_Email");
	By PASSWORD_TEXTBOX = By.id("LoginModel_Password");

	By FIRSTNAME_TEXTBOX = By.id("RegisterModel_CustomerFirstName");
	By LASTNAME_TEXTBOX = By.id("RegisterModel_CustomerLastName");
	By CUSTOMER_EMAİL_TEXTBOX = By.id("RegisterModel_CustomerEmail");
	By CUSTOMER_MOBILEPHONE_TEXTBOX = By.id("RegisterModel_CustomerMobilePhone");
	By CUSTOMER_BIRTHDATE_DAY_TEXTBOX = By.id("RegisterModel_CustomerBirthDateDay");
	By CUSTOMER_BIRTHDATE_MONTH_TEXTBOX = By.id("RegisterModel_CustomerBirthDateMonth");
	By CUSTOMER_BIRTHDATE_YEAR_TEXTBOX = By.id("RegisterModel_CustomerBirthDateYear");
	By MODEL_GENDER_TEXTBOX = By.xpath("/html//form[@id='RegisterForm']//select[@name='RegisterModel.Gender']");
	By CUSTOMER_PASSWORD_TEXTBOX = By.id("RegisterModel_CustomerPassword");
	By CUSTOMER_PASSWORD_CONFIRM_TEXTBOX = By.id("RegisterModel_CustomerPasswordConfirm");
}
