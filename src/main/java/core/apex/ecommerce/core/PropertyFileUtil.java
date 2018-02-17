package core.apex.ecommerce.core;

import java.util.ResourceBundle;

public class PropertyFileUtil {

	static ResourceBundle setupbundle = ResourceBundle.getBundle("setup");

	// Get the browser
	public static String getBrowsername() {
		return setupbundle.getString("browser");
	}

	// Get the website name
	
	public static String getPageTitle() {
		return setupbundle.getString("PageURl");
	}
}
