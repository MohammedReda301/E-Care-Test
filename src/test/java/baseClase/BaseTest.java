package baseClase;

import com.shaft.driver.SHAFT;
import com.shaft.tools.io.ReportManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.shaft.properties.internal.PropertiesHelper;

import java.time.Duration;

public class BaseTest {
    public SHAFT.GUI.WebDriver driver;

    // Locators for login elements
    private final By loginIdField = By.xpath("(//input[@id='login_loginid_input_01'])[1]");
    private final By passwordField = By.xpath("(//input[@id='login_password_input_01'])[1]");
    private final By loginButton = By.xpath("//button[@id='login-withecare']");
    private final By popUpCloseButton = By.xpath("//div[contains(@class, 'ant-notification-notice')]//a[contains(@class, 'ant-notification-notice-close')]");

    @BeforeClass
    public void setup() {
        // Initialize SHAFT properties

        // Initialize the driver
        driver = new SHAFT.GUI.WebDriver();
        WebDriver seleniumDriver = driver.getDriver(); // Get the raw Selenium WebDriver

        // Configure global implicit wait
        seleniumDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // Set timeout to 5 seconds

        // Navigate to the login page
        driver.browser().navigateToURL("https://ecaretest-my.te.eg/echannel/#/login");
        ReportManager.log("Navigated to login page.");

        // Perform login with error handling
        try {
            performLogin();
        } catch (NoSuchElementException e) {
            handleTestFailure(e, "Login failed due to missing elements.");
        }
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.browser().captureScreenshot();
        driver.quit();
        ReportManager.log("Browser closed.");
    }

    // Helper method to perform login
    private void performLogin() {
        driver.element().type(loginIdField, "#######");
        driver.element().type(passwordField, "#####");
        driver.element().click(loginButton);
        ReportManager.log("Logged in successfully.");
        closePopUpIfPresent();
    }

    // Helper method to close pop-up
    private void closePopUpIfPresent() {
        try {
            if (driver.element().isElementDisplayed(popUpCloseButton)) {
                driver.element().click(popUpCloseButton);
                ReportManager.log("Pop-up closed.");
            } else {
                ReportManager.log("No pop-up to close.");
            }
        } catch (NoSuchElementException e) {
            ReportManager.log("No pop-up element found.");
        }
    }

    // Handle test failures and quit browser
    private void handleTestFailure(Exception e, String errorMessage) {
        ReportManager.log(errorMessage);
        ReportManager.log(e.getMessage());
        driver.browser().captureScreenshot();
        driver.quit(); // Close the browser to move to the next test
        throw new RuntimeException(errorMessage, e); // Mark the test case as failed
    }
}
