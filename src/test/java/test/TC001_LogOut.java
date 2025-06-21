package test;

import baseClase.BaseTest;
import com.shaft.tools.io.ReportManager;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC001_LogOut extends BaseTest {

    // Locators for profile and logout elements
    private final By profileButtonLocator = By.xpath("//div[@id='firstHeader']//div//div//div[@class='ant-row ant-row-end ant-row-middle']//div[@class='ant-col']//div[@__self='[object Object]']//div//div//div[@__self='[object Object]']");
    private final By logoutButtonLocator = By.xpath("//div[normalize-space()='Logout']");

    // Locator for a login element to validate logout
    private final By loginElementLocator = By.xpath("//input[@id='login_loginid_input_01']"); // Adjust this based on your actual login field locator

    @Test
    public void TC001_LogOut() {
        // Click the profile button using SHAFT
        driver.element().click(profileButtonLocator);
        ReportManager.log("Clicked profile button.");

        // Click the logout button using SHAFT
        driver.element().click(logoutButtonLocator).captureScreenshot(logoutButtonLocator);
        ReportManager.log("Successfully logged out.");

        // Validate successful logout by checking if the login element is displayed
        boolean isLoginDisplayed = driver.element().isElementDisplayed(loginElementLocator);
        ReportManager.log("Is login element displayed after logout? " + isLoginDisplayed);

        // Log the result of the logout validation
        if (isLoginDisplayed) {
            ReportManager.log("Logout validation successful.");
        } else {
            ReportManager.log("Logout validation failed.");
        }
    }
}
