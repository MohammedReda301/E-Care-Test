package test;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.Browser;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.browser.internal.BrowserActionsHelper;
import com.shaft.tools.io.ReportManager;

import baseClase.BaseTest;

public class TC010_RechargeWithNewCard extends BaseTest {

    // Locators
    private final By BalanceAndRecharge = By.xpath("//span[@id='buyline_category_button_balanceservices']");
    private final By RechargeAndPayment = By.xpath("//li[normalize-space()='Recharge & Payment']");
    private final By CurruntNumberDot = By.xpath("//input[@value='currentNumber']");
    private final By Next = By.xpath("//span[normalize-space()='Next']");
    private final By BankCarddot = By.xpath("//input[@value='2']");
    private final By AmoutInput = By.xpath("//input[starts-with(@id, 'control-ref-') and contains(@id, '_amountAfterTax') and @placeholder='Amount to Recharge']");
    private final By RechargeWithAnotherCard = By.xpath("//span[normalize-space()='Recharge with another Bank Card']");
    private final By ConfirmOk = By.xpath("//button[@class='ant-btn ant-btn-primary modal-ok-btn']");

    private final By CardholderNameIframe = By.xpath("//iframe[contains(@src, 'role/nameOnCard/inputField.do')]");
    private final By InputFilesGenral = By.id("nameOnCard");

    private final By CardNumberIframe = By.cssSelector("iframe.gw-proxy-number");
    private final By InputfeildCardNumber = By.id("number");

    private final By ExpirymonthIframe = By.cssSelector("iframe.gw-proxy-expiryMonth");
    private final By InputfeildExpiryMonth = By.id("expiryMonth");

    private final By ExpiryYearIframe = By.cssSelector("iframe.gw-proxy-expiryYear");
    private final By InputfeildExpiryYear = By.id("expiryYear");

    private final By CVVIframe = By.cssSelector("iframe.gw-proxy-securityCode");
    private final By InputfeildCVV = By.id("securityCode");

    private final By PayNow = By.cssSelector("button[id='pay'] container-element span");
    private final By Submet = By.xpath("//input[@id='acssubmit']");

    private final By SuccessfulPayment = By.xpath("//div[@style='background-color: rgb(255, 255, 255); box-shadow: rgba(0, 0, 0, 0.08) 0px 4px 16px 0px; border-radius: 0.625rem; width: 100%; padding: 2rem 1.25rem 1.25rem;' and .//img[starts-with(@src, 'data:image/png;base64,')]]");
    private final By ErrorPOP = By.xpath("//div[@class='ant-notification-notice ec_theme_pc_custom_message_utils_error_QEEohz ant-notification-notice-closable']");

    @Test
    public void TC010_RecharcgeWithNewCard() {
    
            // Navigate to BalanceAndRecharge section
            driver.element().click(BalanceAndRecharge);
            driver.element().click(RechargeAndPayment);
            driver.element().click(CurruntNumberDot);
            driver.element().click(Next);
            
            // Attempt to click BankCarddot
            driver.element().click(BankCarddot);
            
        ///////////////////////////ERORR
            // If error occurs, capture screenshot and fail the test
         //   driver.element().captureScreenshot(ErrorPOP);
          //  ReportManager.log("Error encountered after clicking BankCarddot. Test failed.");
        //    Assert.fail("Test stopped due to an error after clicking BankCarddot.");
        //    driver.quit();
        //////////////////////////ERORR
        
        // Proceeding actions (executed only if no error occurs)
        driver.element().clear(AmoutInput);
        driver.element().type(AmoutInput, "10");
        driver.element().click(RechargeWithAnotherCard);
        driver.element().click(ConfirmOk);

       

        // CardHolder Name
        driver.element().switchToIframe(CardholderNameIframe);
        driver.element().type(InputFilesGenral, "Reda");
        driver.element().switchToDefaultContent();

        // Card Number
        driver.element().switchToIframe(CardNumberIframe);
        driver.element().type(InputfeildCardNumber, "2223000000000007");
        driver.element().switchToDefaultContent();

        // Expiry Month
        driver.element().switchToIframe(ExpirymonthIframe);
        driver.element().type(InputfeildExpiryMonth, "01");
        driver.element().switchToDefaultContent();

        // Expiry Year
        driver.element().switchToIframe(ExpiryYearIframe);
        driver.element().type(InputfeildExpiryYear, "39");
        driver.element().switchToDefaultContent();

        // CVV Number
        driver.element().switchToIframe(CVVIframe);
        driver.element().type(InputfeildCVV, "100");
        driver.element().switchToDefaultContent();

        // Click on Pay Now
        driver.element().click(PayNow);
        
        //////////////////////////////////////////////////////////////
        
       //  driver.element().click(Submet);

        // Success Payment Section Validation
     //    driver.element().captureScreenshot(SuccessfulPayment);
     //   String SuccessfulPayment1 = driver.element().getText(SuccessfulPayment);
     //   ReportManager.log("Success Msg Details: " + SuccessfulPayment1);
    
    }
}
