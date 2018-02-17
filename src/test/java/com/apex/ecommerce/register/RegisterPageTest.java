package com.apex.ecommerce.register;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.apex.ecommerce.register.constant.RegisterPageConstant;
import com.apex.ecommerce.register.page.RegisterPage;
import core.apex.ecommerce.core.ApexBaseTest;

public class RegisterPageTest extends ApexBaseTest implements RegisterPageConstant {

	@Test
	public void Register() throws InterruptedException {
		RegisterPage RegisterPage = new RegisterPage(driver);
		RegisterPage.RegistertoEcommerce(FNAME_DATA, LNAME_DATA, DATE_DATA, MONTH_DATA, YEAR_DATA, EMAIL_DATA,
				HOUSE_NUM_DATA, STREET_DATA, TOWN_DATA, STATE_DATA, COUNTRY_DATA, POSTCODE_DATA, PHONE_NUM_DATA,
				FAX_DATA, PASSWORD_DATA, PASSWORD_DATA);

		Assert.assertEquals(RegisterPage.getCurrentPageTitle(), REGISTER_PAGE_TITLE);
		Assert.assertTrue(RegisterPage.getCurrentPageURL().startsWith("http://ecommerce.saipratap.net/"));
		Assert.assertEquals(RegisterPage.getPageMessage(), REGISTER_CONFIRMATION);
	}
}