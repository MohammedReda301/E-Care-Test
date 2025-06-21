package test;

import baseClase.BaseTest;
import com.shaft.tools.io.ReportManager;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC002_UsageOverview extends BaseTest{

	//Locators:
	 private final By UsageOverviewSection = By.xpath("//div[@class='ant-row ec_accountoverview_primaryBtn_Qyg-Vp']");
	 private final By UsageDetailsBtn = By.xpath("//span[normalize-space()='Usage Details']");
	 //Locators For usage page:
	 private final By UnitesBtn =By.xpath("(//div[@__self='[object Object]'])[54]");
	 private final By UsageSection = By.xpath("//div[@class='ant-card-body']");
	 
	 
	@Test 
	
	public void TC002_UsageOverview() {
		
		// Chick the Usage over view section:
		driver.element().captureScreenshot(UsageOverviewSection);
		ReportManager.log("Capture UsageOver View Section.");
		// 1) Click on Usage Details:
		driver.element().click(UsageDetailsBtn);
		ReportManager.log("Clicked Usage Details button.");
		
		
		// 3)Check the Minutes Section: 
		driver.element().captureScreenshot(UsageSection);
		
		// 4) Click on mobile Internet button: 
		driver.element().click(UnitesBtn);
		ReportManager.log("Clicked Unites  button.");
		// 5) check the Mobile Internet Usage section: 
		driver.element().captureScreenshot(UsageSection);
		
		
	}
	 
}
