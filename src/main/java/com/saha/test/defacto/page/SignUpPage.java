package com.saha.test.defacto.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.saha.test.contants.General_Constants;
import com.saha.test.defacto.util.BasePageUtil;

public class SignUpPage extends BasePageUtil implements General_Constants {

	public SignUpPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void signUp() {
		sendKey(FIRSTNAME_TEXTBOX, "Melih");
		sendKey(LASTNAME_TEXTBOX, "Karaçomak");
		sendKey(CUSTOMER_EMAİL_TEXTBOX, "melihkaracomak91@gmail.com");
		sendKey(CUSTOMER_MOBILEPHONE_TEXTBOX, "5312136991");
		sendKey(CUSTOMER_BIRTHDATE_DAY_TEXTBOX, "13");
		sendKey(CUSTOMER_BIRTHDATE_MONTH_TEXTBOX, "5");
		sendKey(CUSTOMER_BIRTHDATE_YEAR_TEXTBOX, "1991");
		sendKey(MODEL_GENDER_TEXTBOX, "Erkek");
		sendKey(CUSTOMER_PASSWORD_TEXTBOX, "melih1991");
		sendKey(CUSTOMER_PASSWORD_CONFIRM_TEXTBOX, "melih1991");
		click(By.id("RegisterModel_CustomerIsSmsSubscriberAndIsSubscriber"));
		click(By.id("RegisterModel_CustomerIsApprovedContract"));
		click(By.id("RegisterBtn"));
	}
}
