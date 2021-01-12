package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import driverManager.DriverClass;

public class Testing {
	
	@Test 
	public void opencheck() {
		DriverClass dc = new DriverClass();
		dc.openBrowser("chrome");
		
	
	}
}
