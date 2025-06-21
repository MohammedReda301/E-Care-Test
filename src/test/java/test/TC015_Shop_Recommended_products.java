package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.shaft.tools.io.ReportManager;

import baseClase.BaseTest;

public class TC015_Shop_Recommended_products  extends BaseTest {
	
	//Locators:
	 private final By ShopbtnMAin = By.xpath("//a[@class='ec_headerview_imghover_-+abJJ' and @href='#/shop']");
	 private final By Recomended = By.xpath("//body[1]/div[1]/section[1]/main[1]/div[1]/div[3]/div[2]/div[1]/div[1]");
		 private final By Shopbtn = By.xpath("//span[@id='buyline_category_button_eshop']");
		 private final By PR1MF = By.xpath("//img[@alt='MiFi 4G ZTE MF937']");
		 private final By PR2MF = By.xpath("//img[@alt='MF79U Wingle ']");
		 private final By PR3MF = By.xpath("//img[@alt='MiFi I-Modem 4G MF971']");
		 private final By PR4SW = By.cssSelector("img[alt='Samsung Fit 3 ']");
		 private final By PR5PS = By.xpath("//img[@alt='Sony PlayStation 5 Standard Edition ']");
		 //Samsung Galaxy M33 5G 8/128 GB Blue

		 @Test
		 public void TC015_Recomended_Products() {
			 
		     // Navigate to Shop 
		     driver.element().click(ShopbtnMAin);
		     
		     driver.element().captureScreenshot(Recomended);
		  //Click on PR1
		     driver.element().captureScreenshot(PR1MF).click(PR1MF);
		     driver.element().click(Shopbtn);
		     
		     //Click on PR2 
		     driver.element().captureScreenshot(PR2MF).click(PR2MF);
		     driver.element().click(Shopbtn);
		     
		     
		     //Click on PR3 
		     driver.element().captureScreenshot(PR3MF).click(PR3MF);
		     driver.element().click(Shopbtn);
		     
		     
		     
		     //Click on PS 
		     
		     driver.element().captureScreenshot(PR5PS).click(PR5PS);
		     driver.element().click(Shopbtn);
		     
		     
		    
		    
		    
		 }
	}