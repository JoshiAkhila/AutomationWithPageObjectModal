package com.apex.ecommerce.login.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.apex.ecommerce.login.constant.LoginPageConstant;
import core.apex.ecommerce.core.ApexBasePage;
import core.apex.ecommerce.core.ApexCommonConstant;

public class LoginPage extends ApexBasePage implements LoginPageConstant {

	@FindBy(xpath = ApexCommonConstant.ECOMMERCE_ACCOUNT_LOCATOR)
	private WebElement AccountBtnElm;

	// Login
	@FindBy(id = EMAIL_ID_LOCATOR)
	private WebElement EmailIDElm;
	@FindBy(id = PASSWORD_ID_LOCATOR)
	private WebElement PasswordIDElm;
	@FindBy(linkText = LOGIN_LOCATOR)
	private WebElement LoginIDElm;

	public LoginPage(WebDriver driver) {
		super.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setDataEmailID(String emailID) {
		EmailIDElm.sendKeys(emailID);
	}

	public void setDataPassword(String Password) {
		PasswordIDElm.sendKeys(Password);
	}

	public void LogintoEcommerce(String emailID, String Password) throws InterruptedException {
		AccountBtnElm.click();
		Thread.sleep(500);

		setDataEmailID(emailID);
		Thread.sleep(500);

		setDataPassword(Password);
		Thread.sleep(500);

		LoginIDElm.click();
		Thread.sleep(500);
	}

	public String getPageMessage() {
		// TODO Auto-generated method stub
		return driver.findElement(By.className(MESSAGE_ID_LOCATOR)).getText();
	}

}
