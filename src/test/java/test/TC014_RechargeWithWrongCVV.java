package test;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.shaft.driver.SHAFT;
import com.shaft.tools.io.ReportManager;

import baseClase.BaseTest;

public class TC014_RechargeWithWrongCVV  extends BaseTest{
	//Locators:
	 // Locators
    private final By RechargeAndPayPills = By.xpath("//p[normalize-space()='Recharge / Pay Bill']");
    private final By MobileDone = By.xpath("//input[@value='2']");
    private final By Continue = By.xpath("//div[normalize-space()='Continue']");
    private final By MobileInputField = By.xpath("(//input[@id='verify_mobilenum_input_01'])[1]");
    private final By VerifyBtn = By.xpath("//div[normalize-space()='Verify Number']");
    private final By BankCardDot = By.xpath("//input[@value='2']");
    private final By Amountinput = By.xpath("(//input[@id='topup_feeAmount_input_01'])[1]");
    private final By Paybtn = By.xpath("//div[normalize-space()='Pay']");
    private final By YesBtn = By.xpath("//span[normalize-space()='Yes']");
    
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

    
    @BeforeClass
    @Override
    public void setup() {
        driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("https://ecaretest-my.te.eg/echannel/#/home"); // Replace with the actual URL for this test
        ReportManager.log("Navigated to the target page for anonymous payment.");
    }
    
    @Test
    public void TC014__Recharge_With_Wrong_Cvv() {
        // Navigate to BalanceAndRecharge section
        driver.element().click(RechargeAndPayPills);
        driver.element().click(MobileDone);
        driver.element().click(Continue);
        driver.element().type(MobileInputField, "01555901654").captureScreenshot(MobileInputField);
        driver.element().click(VerifyBtn);
        driver.element().click(BankCardDot);
        driver.element().type(Amountinput, "10").captureScreenshot(Amountinput);
        driver.element().click(Paybtn);
        driver.element().click(YesBtn);

        
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
        driver.element().type(InputfeildCVV, "12");
        driver.element().switchToDefaultContent();

        // Click on Pay Now
        driver.element().click(PayNow);
        driver.browser().captureScreenshot();
        
        
        //
        driver.element().click(Submet);

        // Success Payment Section Validation
        driver.element().captureScreenshot(SuccessfulPayment);
        String SuccessfulPayment1 = driver.element().getText(SuccessfulPayment);
        ReportManager.log("Success Msg Details: " + SuccessfulPayment1);
    }
}
