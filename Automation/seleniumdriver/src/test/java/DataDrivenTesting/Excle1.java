package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excle1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream file =new FileInputStream(System.getProperty("user.dir")+"/testdata/selenium.xlsx");
		
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		
		XSSFSheet sheet =workbook.getSheet("workout");
		
		int totalnumberofrows=sheet.getLastRowNum();
		
		int totalnumberofcells=sheet.getRow(1).getLastCellNum();
		
		System.out.println("Total Rows::"+totalnumberofrows);
		System.out.println("Total Cells::"+totalnumberofcells);
		
		
		for(int r=0 ;r<=totalnumberofrows;r++)
		{
			

			XSSFRow currentrow = sheet.getRow(r);
			
			for(int c=0;c<totalnumberofcells;c++)
			{
				XSSFCell currentcell = currentrow.getCell(c);
				System.out.print(currentcell.toString()+"\t");
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
	}

}
