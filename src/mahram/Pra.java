package mahram;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Pra {
	
	
	@DataProvider
	public Object[][]getData()
	{
		Object[][]data=new Object[2][2];
		data[0][0]="usera";
		data[0][1]=123;
		data[1][0]="userb";
		data[1][1]=456;
		return data;
	}
	@Test(dataProvider="getData")
	public void createUsre(String un,int pw)
	{
		Reporter.log("createUser:"+un+""+"pdw:"+pw, true);
	}

	
	
	
}
