package core.apex.ecommerce.core;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ApexBaseTest {
	protected WebDriver driver = null;

	@BeforeClass
	public void beforeTest() {

		String Browsername = PropertyFileUtil.getBrowsername();
		driver = BrowserFactory.getDriver(Browsername);
		driver.manage().window().maximize();
		driver.get(PropertyFileUtil.getPageTitle());
	}

	@AfterClass
	public void afterTest() {
		driver.quit();
	}
}
