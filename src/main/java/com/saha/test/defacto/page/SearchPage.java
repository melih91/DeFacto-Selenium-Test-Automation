package com.saha.test.defacto.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.saha.test.defacto.util.BasePageUtil;

public class SearchPage extends BasePageUtil {

	public SearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void search() {
		click(By.xpath("//div[@id='navbar-collapse-grid']/ul[@class='nav navbar-nav']//span[.='ERKEK']"));
		click(By.xpath(
				"//div[@id='facetAccordion']/div[2]/div[2]/div/div/div/div[1]/div[@id='boutique-category']/ul[@class='navbar-default']//gt[.='Giyim']"));

		if (getTitle().contains("Erkek Giyim"))
			System.out.println("Erkek Giyim sayfasina giris yapildi.");

		click(By.xpath(
				"//div[@id='facetAccordion']/div[3]/div[2]/div/div/div/div[@class='mCSB_container']/div[@id='boutique-category']/ul[@class='navbar-default']//gt[.='Gömlek']"));
		
		if (getTitle().contains("DeFacto Erkek Gömlek"))
			System.out.println("DeFacto Erkek Gömlek sayfasina giris yapildi.");
		
		((JavascriptExecutor) driver).executeScript("scroll(0,300)");
		click(By.xpath("/html//div[@id='facetAccordion']//a[@href='#fx_c']"));
		click(By.xpath(
				"//div[@id='fx_c']/div/div/div/div[@class='mCSB_container']/div[@id='boutique-category']/ul[@class='navbar-default']//gt[.='Çivit Mavisi']"));
		((JavascriptExecutor) driver).executeScript("scroll(0,300)");
		click(By.xpath(
				"//div[@id='fx_c']/div/div/div/div[@class='mCSB_container']/div[@id='boutique-category']/ul[@class='navbar-default']//gt[.='Gri']"));
		click(By.xpath(
				"//div[@id='morebtn']/a[@href='https://www.defacto.com.tr/erkek/giyim-gomlek-civit-mavisi?fx_c1=1&fx_c2=1413&fx_c3=70&fx_c=9609-9607&page=2']//img[@alt='Sonraki Sayfaya Geçmek İçin Tıklayınız']"));
		thread(2);
		click(By.xpath(
				"/html//section[@id='fixed']//a[@href='/tek-cep-gomlek-758074']/figure//div[@class='prc-name']"));
		click(By.xpath(
				"/html//section[@id='fixed']/div[5]/div/div//ul[@class='productSizes productWidthHeight top15']//a[@href='javascript:;']/span[.='L']"));
		click(By.id("addToCart"));
		thread(5);
		driver.findElement(By.id("popupBasket_ComplateShopping")).click();
		// click(By.id("popupBasket_ComplateShopping"));
		click(By.id("ComplateShoppingDown"));
		sendKey(By.id("LoginModel_Email"), "melihkaracomak91@gmail.com");
		sendKey(By.id("LoginModel_Password"), "melih1991");
		click(By.id("LoginBtn"));

		// burada ilk olarak adres bilgisi olmadığı için istemedi fakat sonraki
		// testlerde adres çıktığı için buraları yorum satırına aldım.
		// sendKey(By.id("Address_AddressTypeId"), "ev");
		// sendKey(By.id("Address_AddressCityId"), "İstanbul");
		// sendKey(By.id("Address_AddressCountyId"), "Kağıthane");
		// sendKey(By.id("Address_AddressPostalCode"), "34403");
		// sendKey(By.id("Address_AddressText"), "***** mahallesi **** sokak no:**");
		// sendKey(By.id("Address_AddressFirstName"), "melih");
		// sendKey(By.id("Address_AddressLastName"), "k*******k");
		// sendKey(By.id("Address_AddressMobilePhone"), "53121*****");
		// sendKey(By.id("Address_AddressIdentityNumber"), "226********");
		// click(By.xpath("/html//form[@id='AddressForm']/div[@class='form-group row
		// top15']//input[@value='Kaydet']"));
		click(By.xpath("/html/body/section/div[2]/div[1]/div[@class='cursor-pointer']//b[.='Adrese Teslimat']"));
		click(By.name("ClickCollectID"));
		// click(By.id("MasterPassIsOkBtn"));
		sendKey(By.id("Payment_CardNumber1"), "4532486438426702");
		sendKey(By.id("Payment_ExpireMonth"), "10");
		sendKey(By.id("Payment_ExpireYear"), "2018");
		sendKey(By.id("Payment_SecurityCode"), "123");
		System.out.println("Ödeme alindi.");
	}
}
