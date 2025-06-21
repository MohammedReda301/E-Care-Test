package test;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.shaft.tools.io.ReportManager;
import baseClase.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC005_Add_ons extends BaseTest {

    // Locators for navigation buttons
    private final By plansAndServices = By.xpath("//span[@id='buyline_category_button_planservices']");
    private final By addOns = By.xpath("//li[normalize-space()='Add-ons']");
    
    // Locator for each package container in the Add-ons section
    private final By packageContainer = By.xpath("(//div[@__self='[object Object]'])[87]");

    @Test
    public void TC005_PackageDetails() {
   

        // Navigate to the Plans and Services section
        driver.element().click(plansAndServices);
        ReportManager.log("Navigated to 'Plans and Services'.");

        // Click on the Add-ons section
        driver.element().click(addOns);
        
        
        ReportManager.log("Navigated to 'Add-ons' section.");
        String packageContainerText = driver.element().getText(packageContainer);

        ReportManager.log("Netro Packages is : " + packageContainerText );
        
    }
}
