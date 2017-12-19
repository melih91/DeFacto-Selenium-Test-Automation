package com.saha.test.defacto.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.saha.test.contants.General_Constants;
import com.saha.test.defacto.util.BasePageUtil;

public class LoginPage extends BasePageUtil implements General_Constants {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void login(String email, String password) {
		sendKey(EMAIL_TEXTBOX, email);
		sendKey(PASSWORD_TEXTBOX, password);
		click(By.id("LoginBtn"));
	}
}
