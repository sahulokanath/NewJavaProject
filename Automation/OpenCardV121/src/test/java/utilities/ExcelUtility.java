package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.*;

public class ExcelUtility {

    private String path;
    private XSSFWorkbook workbook;

    public ExcelUtility(String path) {
        this.path = path;
    }

    // Get Row Count
    public int getRowCount(String sheetName) throws IOException {
        try (FileInputStream fi = new FileInputStream(path)) {
            workbook = new XSSFWorkbook(fi);
            XSSFSheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                throw new IOException("Sheet " + sheetName + " does not exist in the file: " + path);
            }
            return sheet.getLastRowNum();
        }
    }

    // Get Cell Count
    public int getCellCount(String sheetName, int rowNum) throws IOException {
        try (FileInputStream fi = new FileInputStream(path)) {
            workbook = new XSSFWorkbook(fi);
            XSSFSheet sheet = workbook.getSheet(sheetName);
            if (sheet == null || sheet.getRow(rowNum) == null) {
                throw new IOException("Row " + rowNum + " does not exist in sheet " + sheetName);
            }
            return sheet.getRow(rowNum).getLastCellNum();
        }
    }

    // Get Cell Data
    public String getCellData(String sheetName, int rowNum, int colNum) throws IOException {
        try (FileInputStream fi = new FileInputStream(path)) {
            workbook = new XSSFWorkbook(fi);
            XSSFSheet sheet = workbook.getSheet(sheetName);
            if (sheet == null || sheet.getRow(rowNum) == null || sheet.getRow(rowNum).getCell(colNum) == null) {
                return ""; // Return empty if cell does not exist
            }

            DataFormatter formatter = new DataFormatter();
            return formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
        }
    }

    // Set Cell Data
    public void setCellData(String sheetName, int rowNum, int colNum, String data) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            workbook = new XSSFWorkbook();
        } else {
            try (FileInputStream fi = new FileInputStream(path)) {
                workbook = new XSSFWorkbook(fi);
            }
        }

        XSSFSheet sheet = workbook.getSheet(sheetName);
        if (sheet == null) {
            sheet = workbook.createSheet(sheetName);
        }

        XSSFRow row = sheet.getRow(rowNum);
        if (row == null) {
            row = sheet.createRow(rowNum);
        }

        XSSFCell cell = row.createCell(colNum);
        cell.setCellValue(data);

        try (FileOutputStream fo = new FileOutputStream(path)) {
            workbook.write(fo);
        } finally {
            workbook.close();
        }
    }
}
