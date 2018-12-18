package mahram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public static void testlogin1() {
		WebDriver driver=new ChromeDriver();
		driver.get("https:demo.actitime.com/login.do");
		String atitle = driver.getTitle();
		String etitle = "Invalid";
		SoftAssert s=new SoftAssert();
		s.assertEquals(atitle,etitle);
		driver.close();
		s.assertAll();
	}

}
