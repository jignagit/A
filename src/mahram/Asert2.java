package mahram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asert2 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
    @Test
	public void testlogin2() {
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://demo.actitime.com/login.do");
    	String atitle = driver.getTitle();
    	Assert.assertEquals(atitle, "Invalid");
    	driver.close();
    
  
		
	}

}
