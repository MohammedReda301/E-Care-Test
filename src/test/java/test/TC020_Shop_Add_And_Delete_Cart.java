package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.shaft.tools.io.ReportManager;

import baseClase.BaseTest;

public class TC020_Shop_Add_And_Delete_Cart extends BaseTest {
	//Locators:
	 private final By Shopbtn = By.xpath("//a[@class='ec_headerview_imghover_-+abJJ' and @href='#/shop']");
	 private final By Gaming = By.xpath("//div[contains(text(),'Gaming')]");
	 private final By ItemPlayStation = By.xpath("//div[normalize-space()='Sony PlayStation 5 Standard Edition']");
	 private final By AddItemToCart = By.xpath("//button[@id='offertotalcost_addcartbtn_btn']");
	 private final By Cart = By.xpath("(//div[@class='ant-col ant-col-order-4'])[1]");
	 private final By ALL = By.cssSelector("div[id='cart_chooseall_01'] div span[role='img'] svg");
	 private final By Plus = By.xpath("(//span[@id='plus_cartitem_0'])[1]");
	 private final By Delete = By.xpath("(//button[normalize-space()='Delete'])[1]");
	 private final By Confirm = By.xpath("//div[@id='pc_modal_confirm_confirm_btn']");
	 private final By ShopIsEmpty = By.xpath("(//span[@class='ec-text ec-text-default ec-title-lg-h3 ec-text-truncate ec-block ec_shopping-cart_titleone_4wYxs0'])[1]");


	 @Test
	 public void TC020_Shop_ADD_Products_Delete_From_Cart() {
	     // Navigate to Shop 
	     driver.element().click(Shopbtn);
	     // Navigate to Mobile 
	     driver.element().click(Gaming);
	     driver.element().click(ItemPlayStation);
	     driver.element().click(AddItemToCart);
	     driver.element().click(Cart);
	     driver.element().click(ALL);
	     driver.element().click(Plus);
	     driver.element().click(Plus);
	     driver.element().click(Delete);
	     driver.element().click(Confirm);

	     String ShopMsg = driver.element().getText(ShopIsEmpty);
	     ReportManager.log(ShopMsg);

	    
	 }
}