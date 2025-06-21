package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.shaft.tools.io.ReportManager;

import baseClase.BaseTest;

public class TC012_Submit_Request extends BaseTest {
	 // Locators
	private final By NeedHelp = By.xpath("//div[@id='need-help-div']");
    private final By ComplainAndRequest = By.xpath("//div[@id='need-help-div']//div[text()='Complaints & Requests']");
    
    private final By SubmitRequest = By.xpath("//h2[text()='Submit Request']");
    private final By RequestType = By.xpath("//span[@class='ant-select-selection-search']");
    private final By Suggestion = By.xpath("(//span[text()='Suggestion'])[1]");
    private final By EmailInput = By.xpath("//input[@id='basic_contactEmail']");
    private final By Contactnumber = By.xpath("//input[@id='basic_contactNumber']");
    private final By description = By.xpath("//textarea[@id='basic_requestDescription']");
    private final By Send = By.xpath("(//button[@class='ant-btn ant-btn-default ec_creatett_sendBtn_f8bEXm'])[1]");
    private final By RequestDetailsSection = By.xpath("//div[@style='border-radius: 0.35rem; margin-bottom: 1rem; margin-top: 1rem; background-color: rgb(255, 255, 255); padding: 2.375rem;']");
    @Test
    public void TC012_SubmitRequest() {
        // Click on NeedHelp
    	 driver.element().click(NeedHelp);
        driver.element().click(ComplainAndRequest);
        driver.element().click(SubmitRequest);
        driver.element().click(RequestType);
        driver.element().click(Suggestion);
        driver.element().type(EmailInput , "Mohamed.R.Abdalaziz1@te.eg");
        driver.element().type(Contactnumber , "01551000635");
        driver.element().type(description , "The automation test suite is only as good as the tester who's running it!!");
        driver.element().click(Send);
        
        String RequestDetails = driver.element().getText(RequestDetailsSection);
        driver.element().captureScreenshot(RequestDetailsSection);
        ReportManager.log("the RequestDetails is " + RequestDetails);

       
    }
}