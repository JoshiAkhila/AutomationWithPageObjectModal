package com.apex.ecommerce.order.constant;

import core.apex.ecommerce.core.ApexCommonConstant;

public interface OrderPageConstant extends ApexCommonConstant {

	// locators
	String SELECT_PRODUCT_LOCATOR = "#rightcontent > p.byline > a > img";
	String ADD_TO_CART_LOCATOR = "//*[@value='Add to Cart']";
	String END_SHOPING_LOCATOR = "//a[@href='checkoutshiping.php']";
	String CHECH_OUT_LOCATOR = "//*[@class='continue']//*[text()='Checkout']";
	String ORDER_MESSAGE_LOCATOR = "msg1";

	// Validation
	String ORDER_PAGE_TITLE = "Ez Shop Online";
	String CONFIRM_ORDER = "Continue to confirm this order.";

}
