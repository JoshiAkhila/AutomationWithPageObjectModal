package com.apex.ecommerce.order.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.ecommerce.order.constant.OrderPageConstant;

import core.apex.ecommerce.core.ApexBasePage;

public class OrderPage extends ApexBasePage implements OrderPageConstant {

	@FindBy(xpath = ECOMMERCE_PRODUCT_LOCATOOR)
	private WebElement ProductBtn;

	@FindBy(css = SELECT_PRODUCT_LOCATOR)
	private WebElement selectBtn;

	@FindBy(xpath = ADD_TO_CART_LOCATOR)
	private WebElement AddtoCartBtn;

	@FindBy(xpath = CHECH_OUT_LOCATOR)
	private WebElement CheckoutBtn;

	@FindBy(xpath = END_SHOPING_LOCATOR)
	private WebElement ContinueBtn;

	public OrderPage(WebDriver driver) {
		super.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void OrderProducts() throws InterruptedException {
		ProductBtn.click();
		Thread.sleep(500);

		selectBtn.click();
		Thread.sleep(500);

		AddtoCartBtn.click();
		Thread.sleep(500);

		CheckoutBtn.click();
		Thread.sleep(500);

		ContinueBtn.click();
		Thread.sleep(500);
	}

	public String getPageMessage() {
		// TODO Auto-generated method stub
		return driver.findElement(By.className(ORDER_MESSAGE_LOCATOR)).getText();
	}
}
