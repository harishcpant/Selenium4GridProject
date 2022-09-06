package base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Base {
	
	public WebDriver initializeBrowser(String browserName) throws MalformedURLException {
		WebDriver driver;
		DesiredCapabilities dc=new DesiredCapabilities();
		
		if(browserName.equals("chrome")) {
			dc.setBrowserName("chrome");
		} else if (browserName.equals("firefox")) {
			dc.setBrowserName("firefox");
		} else if (browserName.equals("edge")) {
			dc.setBrowserName("MicrosoftEdge");
		}
		
		driver=new RemoteWebDriver(new URL("http://localhost:4444"),dc);
		
		return driver;		
	}

}
