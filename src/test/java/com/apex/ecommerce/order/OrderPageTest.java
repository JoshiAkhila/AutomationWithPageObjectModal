package com.apex.ecommerce.order;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.apex.ecommerce.login.LoginPageTest;
import com.apex.ecommerce.order.constant.OrderPageConstant;
import com.apex.ecommerce.order.page.OrderPage;

import core.apex.ecommerce.core.ApexBaseTest;

public class OrderPageTest extends LoginPageTest implements OrderPageConstant {

	@Test
	public void Order() throws InterruptedException {

		OrderPage OrderPage = new OrderPage(driver);
		OrderPage.OrderProducts();
		Assert.assertEquals(OrderPage.getCurrentPageTitle(), ORDER_PAGE_TITLE);
		Assert.assertTrue(OrderPage.getCurrentPageURL().startsWith("http://ecommerce.saipratap.net/"));
		Assert.assertEquals(OrderPage.getPageMessage(), CONFIRM_ORDER);
	}
}
