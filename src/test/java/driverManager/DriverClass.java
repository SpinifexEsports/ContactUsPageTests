package driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverClass {
	
	private static WebDriver driver = null;
	
	public static WebDriver getDriver() {
		return driver;
		
	}

public WebDriver openBrowser(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chrome browser launched");
		}
		
		else if(browser.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver","drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Firefox browser launched");
		}
		
		else if(browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			System.out.println("Edge browser launched");
		}
		
		else {
			System.out.println("Driver not supported in framework");
		}
		driver.manage().window().maximize();

	return driver;
}

public void closeWindow() {
	driver.close();
}

public void quitBrowser() {
	driver.quit();
}
}
