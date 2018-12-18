package qsp1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestLogin2 {

	

	public static void main(String[] args) throws Exception{
		//Read
		 Workbook w = WorkbookFactory.create(new FileInputStream("./input/Book1.xlsx"));
		 String v = w.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		 System.out.println(v);
		 //write
		w.getSheet("Sheet1").getRow(0).getCell(0).setCellValue("aarav");
		w.write(new FileOutputStream("./input/Book2.xlsx"));//diff path->SvaeAs
		w.close();
		
	}

	

}
