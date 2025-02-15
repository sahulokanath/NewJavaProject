package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	// Required For Open the file Reading propose
	public static FileInputStream fi;

	// Required For Open the file warting propose
	public static FileOutputStream fo;

	public static XSSFWorkbook wb;

	public static XSSFSheet ws;

	public static XSSFRow wr;

	public static XSSFCell wc;

	public static CellStyle style;

	// To Count the number of Row in Excel Sheet
	// File path and Sheet name
	public static int getRowCout(String xlfile, String xlsheet) throws IOException {
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		int rowcount = ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;
	}

	// To Count the number of cell in Excel Sheet

	public static int getCellcout(String xlfile, String xlsheet, int rownum) throws IOException {
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		XSSFRow row = ws.getRow(rownum);
		int cellount = row.getLastCellNum();
		wb.close();
		fi.close();
		return cellount;
	}

	//To Get Cell Data 
	public static String getCellData(String xlfile, String xlsheet, int rownum, int colnum) throws IOException {
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		XSSFRow row = ws.getRow(rownum);
		XSSFCell cell = row.getCell(colnum);
		wb.close();
		fi.close();
		
		String data;
		try
		{
			data=cell.toString();
			DataFormatter formatter =new DataFormatter();
			data =formatter.formatCellValue(cell); //Retunes the value of a cell as a string range 
		}
		catch(Exception e)
		{
		  data ="";	
		}
		
		wb.close();
		fi.close();
		return data;
		
	}
	
	

	// To set The Data in Cell
	public static void setCellData(String xlfile,String xlsheet ,String data,int rownum,int colnum) throws IOException
	{
		//Reading the Data [If At time if we want be update and open the file]
		fi =new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		XSSFRow row = ws.getRow(rownum);
		XSSFCell cell = row.createCell(colnum);
		
		//Writing The Data
		cell.setCellValue(data);
		fo=new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();	
		
	}
	
	public static void fileGreenColor(String xlfile ,String xlsheet ,int rownum ,int colnum) throws IOException
	{
		fi =new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		XSSFRow row = ws.getRow(rownum);
		XSSFCell cell = row.createCell(colnum);
		
		style =wb.createCellStyle();
		style.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		fo=new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	}
	
	public static void fileRedColor(String xlfile ,String xlsheet ,int rownum ,int colnum) throws IOException
	{
		fi =new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		XSSFRow row = ws.getRow(rownum);
		XSSFCell cell = row.createCell(colnum);
		
		style =wb.createCellStyle();
		style.setFillBackgroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		fo=new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	}
}
