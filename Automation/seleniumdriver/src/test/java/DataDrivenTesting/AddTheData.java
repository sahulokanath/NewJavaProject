package DataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AddTheData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		XSSFWorkbook workbook =new XSSFWorkbook();
		
		XSSFSheet data = workbook.createSheet();
		
		XSSFRow row1 = data.createRow(0);
		
		row1.createCell(0).setCellValue("Java");
		row1.createCell(1).setCellValue(19);
		row1.createCell(2).setCellValue("Automation");
		
		
		XSSFRow row2 = data.createRow(1);
		
		row2.createCell(0).setCellValue("Python");
		row2.createCell(1).setCellValue(5);
		row2.createCell(2).setCellValue("Automation");
		
		XSSFRow row3 = data.createRow(2);
		
		row3.createCell(0).setCellValue("C#");
		row3.createCell(1).setCellValue(12);
		row3.createCell(2).setCellValue("Automation");
		
		FileOutputStream file =new FileOutputStream(System.getProperty("user.dir")+"/testdata/new.xlsx");
		
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("Sheet Created Succfully");
	}
	

}
