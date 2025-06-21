package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.shaft.tools.io.ReportManager;

import baseClase.BaseTest;

public class TC009_RechargeWithSavedCard extends BaseTest {
	//Locators:
		 private final By BalanceAndRecharge = By.xpath("//span[@id='buyline_category_button_balanceservices']");
		 private final By Rechargebtn = By.xpath("//li[normalize-space()='Recharge & Payment']");
		 private final By CurrentNumber = By.xpath("//input[@value='currentNumber']");
		 private final By Next = By.xpath("//span[normalize-space()='Next']");
		 private final By BankCarddot = By.xpath("//input[@value='2']");
		 private final By CCVinput = By.xpath("//input[starts-with(@id, 'control-ref-') and contains(@id, '_cvvNumber') and @placeholder='CVV']");
		 private final By AmoutInput= By.xpath("//input[starts-with(@id, 'control-ref-') and contains(@id, '_amountAfterTax') and @placeholder='Amount to Recharge']");
		 private final By Rechargebtn2 = By.xpath("//button[normalize-space()='Recharge']");
		 private final By ConfirmOk = By.xpath("//button[@class='ant-btn ant-btn-primary modal-ok-btn']");
		 private final By SuccPOP = By.xpath("//div[@class='ant-notification-notice-description']");
		
		 @Test
		 public void TC009_Recharcge10LE() {
		     // Navigate to BalanceAndRecharge section
		     driver.element().click(BalanceAndRecharge);
		  // Navigate to BalanceAndRecharge section
		     driver.element().click(Rechargebtn);
		     ReportManager.log("Navigated to 'Rechargebtn'.");

		     // Click on CurrentNumber section
		     driver.element().click(CurrentNumber);
		     
		     // Click on Next
		     driver.element().click(Next);
		     
		     // Click on Next
		     driver.element().click(BankCarddot);
		     
		  // Type the CCV
		     driver.element().type(CCVinput, "100");
		     //Clear the amount 
		     driver.element().clear(AmoutInput);
		     driver.element().type(AmoutInput, "10").captureScreenshot(AmoutInput);
		     
		     //Click on Recharge
		     
		     // Click on Next
		     driver.element().click(Rechargebtn2);
		     
		     //Click on confirm pop ok 
		     
		     driver.element().click(ConfirmOk);
		     
		     
		     driver.element().captureScreenshot(SuccPOP);

		     
		    
		    
		 }
	}