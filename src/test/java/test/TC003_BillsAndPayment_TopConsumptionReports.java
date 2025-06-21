package test;
import baseClase.BaseTest;
import com.shaft.tools.io.ReportManager;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.shaft.properties.internal.PropertiesHelper;
import baseClase.BaseTest;
public class TC003_BillsAndPayment_TopConsumptionReports extends BaseTest {
	
	//Locators:
	private final By BillsPaymentsBtn = By.xpath("//span[@id='buyline_category_button_billspayments']");
	private final By TopConsReport = By.xpath("//li[normalize-space()='Top Consumption Report']");
	private final By ReportSection = By.xpath("//div[@class='ant-row']");
	private final By Durationbtn = By.xpath("//input[@value='DURATION']");
	private final By CostBtn = By.xpath("//input[@value='COST']");
	
	
	@Test 
	
	public void TC003_Top_Consumption() {
		//1)Click on Bills&Payments button.
		driver.element().click(BillsPaymentsBtn);
		ReportManager.log("Clicked Bills&Payments button.");
		
		//2) Click on Top Consumption Report:
		driver.element().click(TopConsReport);
		driver.browser().captureScreenshot();
		ReportManager.log("Clicked TopConsReport button.");
		//Taking a screenshot of No. of calls Report Section 
		driver.element().captureScreenshot(ReportSection);
		
		// 2) Click on Duration:
		driver.element().click(Durationbtn);
		ReportManager.log("Clicked Duration button.");
		driver.browser().captureScreenshot();
		
		//3) Click on Cost:
		driver.element().click(CostBtn);
		ReportManager.log("Clicked Cost button.");
		driver.browser().captureScreenshot();
		
	}
	
}
