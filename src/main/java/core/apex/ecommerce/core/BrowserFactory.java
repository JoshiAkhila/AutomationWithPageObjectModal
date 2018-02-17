package core.apex.ecommerce.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {
	// Different Browser info
	
	public static WebDriver getDriver(String browsername) {
		// TODO Auto-generated method stub
		if (browsername.equals("firefox")) {
			return new FirefoxDriver();
		} else if (browsername.equals("chrome")) {
			// special setup
			WebDriver driver = new ChromeDriver();
			return driver;
		} else if (browsername.equals("Safari")) {
			// special setup
			WebDriver driver = new SafariDriver();
			return driver;
		}
		throw new RuntimeException("Driver not found");
	}

}
