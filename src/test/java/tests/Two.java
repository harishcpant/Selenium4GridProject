package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;

public class Two extends Base {
	public WebDriver driver;

	@Test
	public void testTwo() {
		driver.get("https://the-internet.herokuapp.com/");
		System.out.println(driver.getTitle()+ " From firefox");
	}
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		driver=initializeBrowser("firefox");
	}
	
	@AfterMethod
	public void testDown() {
		driver.quit();
	}

}
