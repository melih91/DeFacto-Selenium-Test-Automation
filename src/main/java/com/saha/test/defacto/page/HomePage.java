package com.saha.test.defacto.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends com.saha.test.defacto.util.BasePageUtil {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public LoginPage callLoginPage() {
		// thread(2);
		// clickElement(By.className("sp-fancybox-skin"));
		click(By.xpath(
				"/html/body//section[@class='nav-group']/nav[@role='navigation']//div[@role='toolbar']/div[4]/a[@href='/Login']"));
		Assert.assertTrue("Giris sayfasi acilamadi", getTitle().contains("DeFacto ile Kadın ve Erkek Giyimde Akdeniz Modası"));
		System.out.println("Login sayfası yüklendi.");
		return new LoginPage(driver);
	}

	public SignUpPage callSignUpPage() {
		click(By.xpath(
				"/html/body//section[@class='nav-group']/nav[@role='navigation']//div[@role='toolbar']//a[@href='/Login/Register']"));
		Assert.assertTrue("Üye kaydi yapilamadi", getTitle().contains("DeFacto ile Kadın ve Erkek Giyimde Akdeniz Modası"));
        System.out.println("Üye kaydi basarili.");
		
		return new SignUpPage(driver);
	}

	public SearchPage callSearching() {

		return new SearchPage(driver);
	}
}
