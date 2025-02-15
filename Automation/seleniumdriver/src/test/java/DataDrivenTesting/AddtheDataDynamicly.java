package DataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AddtheDataDynamicly {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("DynamicData");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number Of rows?");

		int noOFrows = sc.nextInt();

		System.out.println("Enter number of cells?");

		int noOFcells = sc.nextInt();

		for (int r = 0; r <= noOFrows; r++) {
			XSSFRow currentrow = sheet.createRow(r);

			for (int c = 0; c < noOFcells; c++) {
				XSSFCell currentcell = currentrow.createCell(c);

				currentcell.setCellValue(sc.next());
			}
		}

		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "/testdata/dynamic.xlsx");

		workbook.write(file);

		workbook.close();
		file.close();

		System.out.println("Sheet Created Succfully");
	}

}
