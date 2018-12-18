package qsp1;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DemoJ {
	

	@Test
	public static void testGrid() throws Exception
	{
		String ip="192.168.43.162";
		String browser="chrome";
		
		URL remoteAddress=new URL("http://"+ip+":4444/wd/hub");
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setBrowserName(browser);
		WebDriver driver=new RemoteWebDriver(remoteAddress, capabilities);
		driver.close();
	}

}
