package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
		@FindBy(id="txusername")
		private WebElement untb;
		@FindBy(name="txtpassword")
		private WebElement pstb;
		@FindBy(id="btnlogin")
		private WebElement loginbtn;
		

		public LoginPage(WebDriver driver){
			PageFactory.initElements(driver, this);
		}
		public void setUserName(String un)
		{
			untb.sendKeys(un);
		}
		public void setPassword(String pw)
		{
			pstb.sendKeys(pw);
		}
		public void clickLogin()
		{
			loginbtn.click();
		}
		

		
	}


