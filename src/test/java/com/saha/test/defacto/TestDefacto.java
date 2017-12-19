package com.saha.test.defacto;

import org.junit.Test;

import com.saha.test.defacto.base.BaseTest;
import com.saha.test.defacto.page.HomePage;

public class TestDefacto extends BaseTest {

	@Test
	public void successLogin() {
		new HomePage(driver).callLoginPage().login("melihkaracomak91@gmail.com", "melih1991");
	}

	@Test
	public void successSignUp() {
		new HomePage(driver).callSignUpPage().signUp();
	}

	@Test
	public void searching() throws InterruptedException {
		new HomePage(driver).callSearching().search();
	}
}