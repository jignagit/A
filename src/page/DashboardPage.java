package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {

	@FindBy(id="welcome")
	private WebElement welcome;
	@FindBy(xpath="//li/a[.='Logout']")
	private WebElement logout;
	public  DashboardPage()
	{
		
	}

}
