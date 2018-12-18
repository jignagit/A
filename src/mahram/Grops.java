package mahram;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Grops {
	@BeforeClass(alwaysRun=true)
	public void login()
	{
		Reporter.log("login",true);
	}
	@Test(priority=1,groups= {"user","smoke"})
	public void createUser()
	{
		Reporter.log("createUser",true);
	}
	@Test(priority=2,groups= {"user"},enabled=false)
	public void edtitUser()
	{
		Reporter.log("editUser",true);
	}
	@Test(priority=3,groups= {"user"})
	public void deleteUser()
	{
		Reporter.log("deleteUser",true);
	}
	@Test(priority=4,groups= {"product","smoke"})
	public void createProduct()
	{
		Reporter.log("editProduct",true);
	}
	@Test(priority=5,groups= {"product"})
	public void deleteProduct()
	{
		Reporter.log("deleteProduct",true);
	}


	


	
}

	

	


