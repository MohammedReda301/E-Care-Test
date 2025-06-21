package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseClase.BaseTest;

public class TC018_Shop_Add_Delivery_Adress extends BaseTest {
	
	//Locators:
	 private final By Shopbtn = By.xpath("//a[@class='ec_headerview_imghover_-+abJJ' and @href='#/shop']");
	 private final By MyOrders = By.xpath("//span[@id='buyline_category_button_service']");
	 private final By Me = By.xpath("//div[@id='menu_mine']");
	 private final By AdressBook = By.xpath("//div[@id='submenu_addressmanagement']");
	 private final By AddAdress = By.xpath("//span[contains(text(),'Add Address')]");
	 //Locator For Adress Form:
	 private final By FiresttName = By.xpath("//input[@id='first_name_input']");
	 private final By LasttName = By.xpath("//input[@id='last_name_input']");
	 private final By MobileNumber = By.xpath("//input[@id='mobile_phone_input']");
	 //Locators for the adress
	 private final By Adress = By.xpath("//input[@id='address_input']");
	 private final By Cairo = By.xpath("//div[normalize-space()='Cairo']");
	 private final By Mokkatam = By.xpath("//div[normalize-space()='Mokatam']");
	 private final By DetailsAdress = By.xpath("//input[@id='address_detail_input']");
	 
	 private final By SetDefult = By.xpath("//button[@role='switch']");
	 private final By Confirm = By.xpath("//span[normalize-space()='Confirm']");
	 private final By FinalAdress = By.xpath("(//div[contains(@class,'ant-row')])[11]");
	 
	 private final By Pinbtn = By.xpath("(//*[name()='svg'])[11]");
	 private final By DeleteAdress = By.xpath("//div[@id='delete_button']");
	 private final By ConfirmPOP = By.xpath("//div[@id='pc_modal_confirm_confirm_btn']");
//
	 @Test
	 public void TC018_Shop_ADD_Adress_And_Delete_Adress() {
	     // Navigate to Shop 
	     driver.element().click(Shopbtn);
	     // Navigate to Mobile 
	     driver.element().click(MyOrders);
	     driver.element().click(Me);
	     driver.element().click(AdressBook);
	     driver.element().click(AddAdress);
	     driver.element().click(AddAdress);
	     //ACtion on ADress Form
	     driver.element().type(FiresttName, "Redaa");
	     driver.element().type(LasttName, "Reda");
	     driver.element().type(MobileNumber, "01551000635");
	     
	     driver.element().click(Adress);
	     driver.element().click(Cairo);
	     driver.element().click(Mokkatam);
	   
	     driver.element().type(DetailsAdress, "Test B7");
	     driver.element().click(DetailsAdress);
	     driver.element().click(Confirm);
	   
	     driver.element().captureScreenshot(FinalAdress);
	     driver.browser().captureScreenshot();
	    //Cleansing
	     driver.element().click(Pinbtn);
	     driver.element().click(DeleteAdress);
	     //ConfirmPOP
	     driver.element().click(ConfirmPOP);
	 }
}