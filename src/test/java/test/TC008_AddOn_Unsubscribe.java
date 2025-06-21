package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.shaft.tools.io.ReportManager;

import baseClase.BaseTest;

public class TC008_AddOn_Unsubscribe extends BaseTest {
	//Locators:
	 private final By MoreDetails = By.xpath("//span[normalize-space()='More Details']");
	 private final By NextDot = By.xpath("(//span[@__self='[object Object]'])[47]");
	 private final By Unsubscribe1 = By.xpath("(//button[@type='button'])[4]");
	 
	 private final By Unsubscribe = By.xpath("//div[@class='slick-slide slick-active slick-current']//div//div[@__self='[object Object]']//div[@class='ant-row']//div[@class='ant-col']//div[@__self='[object Object]']//div//div//span[contains(text(),'Unsubscribe')]");
	 private final By Yes = By.xpath("//span[normalize-space()='Yes']");
	 private final By POPup = By.xpath("(//div[@class='ant-notification-notice ec_theme_pc_custom_message_utils_success_F0SA3Q ant-notification-notice-closable'])[1]");

	 
	 
	 @Test
	 public void TC008_AddOn_Unsubscribe() {
	     // Navigate to the Plans and Services section
	     driver.element().click(MoreDetails);
	     ReportManager.log("Navigated to 'MoreDetails'.");

	     // Check for the specific bundle and click Unsubscribe if found
	     By nitroBundle = By.xpath("(//div[contains(text(),'Nitro Extra Streaming-Monthly')])[1]");
	     By unsubscribeButton = By.xpath("(//button[@type='button'])[4]");

	     // Check if the Nitro Extra Streaming-Monthly bundle is present
	     if (driver.element().isElementDisplayed(nitroBundle)) {
	         // If found, click on the related Unsubscribe button
	         driver.element().click(unsubscribeButton);
	         ReportManager.log("Clicked on Unsubscribe for 'Nitro Extra Streaming-Monthly'.");
	     } else {
	         ReportManager.log("The 'Nitro Extra Streaming-Monthly' bundle is not present.");
	     }
	     driver.element().click(Yes);
	    
	     driver.element().captureScreenshot(POPup);
	 }
}