package utilities;

import java.io.IOException;
import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "LoginData")
    public Object[][] getData() throws IOException {
        String path = "./testData/OpenCart.xlsx"; // Relative path to the Excel file
        ExcelUtility xlUtil = new ExcelUtility(path); // Initialize Excel utility

        // Get row and column counts
        int totalRows = xlUtil.getRowCount("Sheet1");
        int totalCols = xlUtil.getCellCount("Sheet1", 1);

        // Create a 2D array to store the data
        Object[][] loginData = new Object[totalRows][totalCols];

        // Loop through rows and columns to populate the array
        for (int i = 1; i <= totalRows; i++) { // Start from 1 to skip the header row
            for (int j = 0; j < totalCols; j++) {
                loginData[i - 1][j] = xlUtil.getCellData("Sheet1", i, j);
            }
        }

        return loginData; // Return the 2D array
    }
}
