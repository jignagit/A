package qsp1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class TestLogin {

	@Test
	public static void testGrid() throws Exception
	{
		Properties p=new Properties();
		p.load(new FileInputStream("./input/data.properties"));
		String v = p.getProperty("city");
		System.out.println(v);
	}
}
