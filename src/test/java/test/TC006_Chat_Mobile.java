package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.shaft.tools.io.ReportManager;

import baseClase.BaseTest;

public class TC006_Chat_Mobile extends BaseTest{
	 // Locators for navigation buttons
    private final By Chatbtn = By.xpath("//button[@class='open-chat']");
    private final By LetsChatbtn = By.xpath("//button[@id='start-chat-landing']");
    private final By Mobilebtn = By.xpath("(//button[normalize-space()='Mobile'])[1]");
    private final By Balancebtn = By.xpath("(//button[normalize-space()='Know your mobile balance'])[1]");
    private final By WelcomeMsg = By.xpath("//div[contains(text(), 'Welcome') and contains(text(), 'WE Customer Care')]");
    private final By BalanceInfo = By.xpath("//div[contains(@class, 'msg-content') and contains(text(), 'Your mobile balance is') and contains(text(), 'LE')]");
    private final By Closebtn = By.xpath("//button[@class='close-chat']//img");
    private final By confirmClose = By.xpath("//button[@id='confirmButton']");
    private final By Packgebtn = By.xpath("(//button[normalize-space()='Know your current packages'])[1]");
    private final By PackgeDetails = By.xpath("//div[@id='chatbot']//div[4]//div[1]//div[1]");
    @Test
    public void TC006_Chatbot_BalanceDetails() {
   

        // Navigate to the Plans and Services section
        driver.element().click(Chatbtn).captureScreenshot(Chatbtn);
        ReportManager.log("Click on the Chat btn");

        // Click on LetsChatbtn section
        driver.element().click(LetsChatbtn);
        ReportManager.log("Click on Lets Chat");
        
        String WelcomeMsgText = driver.element().getText(WelcomeMsg);
        ReportManager.log("The Welcome Msg Is : " + WelcomeMsgText );
        
     // Click on mobile section
       // driver.element().click(Mobilebtn).captureScreenshot(Mobilebtn);
      //  ReportManager.log("Click on Mobilebtn");
        
        
        // Click on know your balance section
           driver.element().click(Balancebtn);
           ReportManager.log("Click on Balancebtn");
        
    
      
        
        String BalanceInfoText = driver.element().getText(BalanceInfo);
        ReportManager.log("The Welcome Msg Is : " + BalanceInfoText );
        
        
        // Click on Closebtn
        driver.element().click(Closebtn);
        ReportManager.log("Click on Closebtn");
        
        // Click on Confirm
        driver.element().click(confirmClose);
        ReportManager.log("Click on Yes");
     
    }

   
}

