package test;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.shaft.tools.io.ReportManager;
import baseClase.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.shaft.tools.io.ReportManager;

public class TC007_AddOn_Subscribe extends BaseTest {
	 // Locators for navigation buttons
	 private final By plansAndServices = By.xpath("//span[@id='buyline_category_button_planservices']");
	 private final By addOns = By.xpath("//li[normalize-space()='Add-ons']");
	 private final By VideoPackges = By.xpath("//div[contains(text(),'Video Packages')]");
	 private final By AutoRenewal = By.xpath("//div[contains(text(),'Auto Renewal')]");
	 // Locator For Nitro Extra Streaming-Weekly-One time Subscribe btn
	 private final By Subscribe = By.xpath("(//button[@type='button'])[1]");
	 private final By Confirm = By.xpath("//button[@class='ant-btn ant-btn-primary modal-ok-btn']");
	 private final By POPupSucc = By.xpath("(//div[@class='ant-notification-notice ec_theme_pc_custom_message_utils_success_F0SA3Q ant-notification-notice-closable'])[1]");
	 //Missing pop up succs
	 // (//div[@class='ant-notification-notice ec_theme_pc_custom_message_utils_success_F0SA3Q ant-notification-notice-closable'])[1]
	 
	 @Test
	    public void TC007_AddOn_Subscribe() {
	   

	        // Navigate to the Plans and Services section
	        driver.element().click(plansAndServices);
	        ReportManager.log("Navigated to 'Plans and Services'.");

	        // Click on the Add-ons section
	        driver.element().click(addOns);
	        
	        // Click on VideoPackges
	        driver.element().click(VideoPackges);
	        
	     // Click on AutoRenewal
	        driver.element().click(AutoRenewal).captureScreenshot(AutoRenewal);
	        
	        // Click on Subscribe for: Nitro Extra Streaming-Monthly
	        driver.element().click(Subscribe).captureScreenshot(Subscribe);
	       
	        // Click on Confirm for: Nitro Extra Streaming-Monthly
	        driver.element().click(Confirm).captureScreenshot(Confirm);
	        
	     // Click on Confirm for: Nitro Extra Streaming-Monthly
	        driver.element().captureScreenshot(POPupSucc);
	        
	        
	  }
	       
	        
	    

}
