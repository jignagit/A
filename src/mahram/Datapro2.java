package mahram;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datapro2 {

	@DataProvider
	public String[][] getData(){
	String[][]data=new String[1][1];
	data[0][0]="UserA";
	return data;

}
	@Test(dataProvider="getData")
	public void createUser(String un)
	{
		Reporter.log("Create User:"+un,true);
	}
}
