package com.apex.ecommerce.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.apex.ecommerce.login.constant.LoginPageConstant;
import com.apex.ecommerce.login.page.LoginPage;

import core.apex.ecommerce.core.ApexBaseTest;

public class LoginPageTest extends ApexBaseTest implements LoginPageConstant {

	@Test
	public void Login() throws InterruptedException {

		LoginPage LoginPage = new LoginPage(driver);
		LoginPage.LogintoEcommerce(EMAIL_ID_DATA, PASSWORD_ID_DATA);

		Assert.assertEquals(LoginPage.getCurrentPageTitle(), PAGE_TITLE);
		Assert.assertTrue(LoginPage.getCurrentPageURL().startsWith("http://ecommerce.saipratap.net/"));
		Assert.assertEquals(LoginPage.getPageMessage(), LOGIN_SUCCESS);
	}
}
