package core.apex.ecommerce.core;

import org.openqa.selenium.WebDriver;

public class ApexBasePage {

	protected WebDriver driver = null;

	public String getCurrentPageURL() {
		return driver.getCurrentUrl();
	}

	public String getCurrentPageTitle() {
		return driver.getTitle();
	}

}
