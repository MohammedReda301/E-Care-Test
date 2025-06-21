package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseClase.BaseTest;

public class TC016_Shop_Search_For_a_proudct  extends BaseTest {
	//Locators:
	 private final By Shopbtn = By.xpath("//a[@class='ec_headerview_imghover_-+abJJ' and @href='#/shop']");
	 private final By SearchInbut = By.xpath("//input[@placeholder='Search in We store']");
	 private final By SearchBtn = By.xpath("(//*[name()='svg'])[7]");
	 private final By PlayStaionElement = By.xpath("//div[contains(@style, 'box-shadow') and .//div[text()='Sony PlayStation 5 Standard Edition']]");
	 private final By OraimoElement = By.xpath("//div[contains(@style, 'box-shadow') and .//div[text()='Oraimo X92 Type-C Lighting']]");

	 @Test
	 public void TC016_Shop_Search_Products() {
	     // Navigate to Shop 
	     driver.element().click(Shopbtn);
	  
	    //Search for a play station
	     driver.element().clear(SearchInbut);
	     driver.element().type(SearchInbut, "play station");
	     driver.element().click(SearchBtn);
	     
	     //PlayStaion element
	     driver.element().captureScreenshot(PlayStaionElement);
	     
	     //Search again for "Oraimo X92 Type-C Lighting"
	     driver.element().clear(SearchInbut);
	     driver.element().type(SearchInbut, "Oraimo X92 Type-C Lighting");
	     driver.element().click(SearchBtn);
	     
	     
	   //Oraimo element
	     driver.element().captureScreenshot(OraimoElement);
	    
	    
	 }
}