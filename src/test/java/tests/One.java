package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;

public class One extends Base {
	
	public WebDriver driver;

	@Test
	public void testOne() {
		driver.get("https://the-internet.herokuapp.com/");
		System.out.println(driver.getTitle()+ " From Chrome");
	}
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		driver=initializeBrowser("chrome");
	}
	
	@AfterMethod
	public void testDown() {
		driver.quit();
	}
		
}
