package qsp1;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoH {
@Parameters({"ip","browser"})
	@Test
	public static void testGrid(String ip,String browser) throws Exception
	{
		
		
		URL remoteAddress=new URL("http://"+ip+":4444/wd/hub");
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setBrowserName(browser);
		WebDriver driver=new RemoteWebDriver(remoteAddress, capabilities);
	}
}
