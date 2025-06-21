package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseClase.BaseTest;

public class TC019_Shop_Compare_products  extends BaseTest {
	
	//Locators:
		 private final By Shopbtn = By.xpath("//a[@class='ec_headerview_imghover_-+abJJ' and @href='#/shop']");
		 private final By Mobile = By.xpath("//div[contains(text(),'Mobiles')]");
		 
		 private final By Compare1 = By.xpath("(//div[@__self='[object Object]'])[121]");
		 private final By Compare2 = By.xpath("(//div[@__self='[object Object]'])[128]");
		 private final By Compare3 = By.xpath("(//div[@__self='[object Object]'])[135]");
		
		 private final By CompareBtn = By.xpath("//button[@id='salescategory_compare_btn']");
		 //Locator to add one of them to the wishlist:
		 private final By Compare1ToWishlist = By.xpath("(//*[name()='svg'])[12]");
		 //Locator close 2 compare
		 
		 private final By Closecompare2 = By.xpath("(//*[name()='svg'])[14]");
		 private final By Closecompare3 = By.xpath("(//*[name()='svg'])[17]");
		 private final By Closecompare1 = By.xpath("(//*[name()='svg'])[11]");
		 

	//
		 @Test
		 public void TC019_Shop_Compare_3_Devices() {
		     // Navigate to Shop 
		     driver.element().click(Shopbtn);
		     // Navigate to Mobile 
		     driver.element().click(Mobile);
		     driver.browser().waitForLazyLoading();
		     driver.element().click(Compare1);
		     driver.element().click(Compare2);
		     driver.element().click(Compare3);
		     driver.element().click(CompareBtn);
		   
		    
		     
		     driver.element().click(Compare1ToWishlist);
		     
		     driver.element().click(Closecompare2);
		     
		     driver.element().click(Compare1ToWishlist);
		     
		     driver.element().click(Closecompare3);
		     driver.element().click(Closecompare1);
		 
		    driver.browser().waitForLazyLoading();
		 }
	}