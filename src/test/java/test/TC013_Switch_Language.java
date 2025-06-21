package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.shaft.tools.io.ReportManager;

import baseClase.BaseTest;

public class TC013_Switch_Language extends BaseTest {
	
	//Locators:
	 private final By ArabicBtn = By.xpath("//div[text()='العربية']");
	 private final By Balancesection = By.xpath("(//div[@class='ant-card-body'])[2]");

	 
	 
	 @Test
	 public void TC013_SwitchToArabic_FromMainPage() {
	     // Click on العربية
	     driver.element().click(ArabicBtn);
	  // Navigate to BalanceAndRecharge section
	     driver.element().getText(Balancesection);
	  
	     
	   
	    
	 }
}