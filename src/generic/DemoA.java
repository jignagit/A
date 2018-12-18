package generic;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Result.class)
public class DemoA {

	@Test
	public void createCustomer()
	{
		Reporter.log("create a customer", true);
		
	}
	@Test
	public void deleteCustomer()
	{
		Reporter.log("delete a customer", true);
		
	}

}
