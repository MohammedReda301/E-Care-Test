package test;

import baseClase.BaseTest;
import com.shaft.tools.io.ReportManager;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC004_AccountOverView extends BaseTest {
    // Locators
    private final By currentPlan = By.xpath("//span[@title and contains(@style, 'font-family: Rubik-Light')]");
    private final By cstName = By.xpath("//div[contains(@class, 'ant-col') and contains(@style, 'font-weight: 700;') and contains(text(), 'Welcome')]");
    private final By CurrentBalance = By.xpath("(//div)[105]");

    @Test
    public void TC004_AccountOverviewDetails() {
        // Retrieve and log the current plan text
        String currentPlanText = driver.element().getText(currentPlan);
        ReportManager.log("Current Plan: " + currentPlanText);

        // Retrieve and log the customer name text
        String cstNameText = driver.element().getText(cstName);
        ReportManager.log("Customer Name: " + cstNameText);
        
      
    }
}
