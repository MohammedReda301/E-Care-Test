package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseClase.BaseTest;

public class TC017_Shop_Add_Proudct_To_Wishlist  extends BaseTest {
	//Locators:
		 private final By Shopbtn = By.xpath("//a[@class='ec_headerview_imghover_-+abJJ' and @href='#/shop']");
		 private final By Mobiles = By.xpath("//div[contains(text(),'Mobiles')]");
		 private final By Somemobile = By.xpath("//span[normalize-space()='11111 EGP']");
		 private final By WishlistStar = By.xpath("(//*[name()='svg'])[20]");
		 private final By Container = By.xpath("//span[@id='portal-mine']//span[contains(@role,'img')]//*[name()='svg']");
		 private final By WishListBtn = By.xpath("//div[@id='submenu_myfavorites']");
		 private final By SomeItem = By.xpath("//div[contains(@class,'wishlist lazy-load')]");
		 private final By Delete = By.xpath("//body//div[@id='root']//main[contains(@class,'ant-layout-content')]//div[contains(@__self,'[object Object]')]//div[contains(@__self,'[object Object]')]//div[contains(@__self,'[object Object]')]//div//div[2]");
		 private final By Confirm = By.xpath("//div[@id='pc_modal_confirm_confirm_btn']");

		 @Test
		 public void TC017_ADD_Products_To_Wishlist() {
		     // Navigate to Shop 
		     driver.element().click(Shopbtn);
		     // Navigate to Mobile 
		     driver.element().click(Mobiles);
		     driver.element().click(Somemobile);
		     driver.element().click(WishlistStar);
		     driver.element().click(Container);
		     driver.element().click(WishListBtn);
		     driver.element().captureScreenshot(SomeItem);
		     driver.element().click(Delete);
		     driver.element().click(Confirm);
		 
		    
		 }
	}