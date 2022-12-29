package com.utils;

import com.constants.FrameworkConstants;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.util.HashMap;


public final class ExcelUtils {


    @DataProvider(name = "data" ,parallel = true)
    public static Object[][] excelDataProvider() {
        Object[][]dataObject = null;
        try{
            FileInputStream fis=new FileInputStream(FrameworkConstants.getExcelFilePath());
            XSSFWorkbook workbook=new XSSFWorkbook(fis);
            XSSFSheet sheet=workbook.getSheet("login");
            int rowCount=sheet.getLastRowNum();
            int columnCount=sheet.getRow(0).getLastCellNum();
            dataObject = new Object[rowCount][1];
            for (int row = 0; row < rowCount; row++) {
                HashMap<String, String> data = new HashMap<>();
                for (int col = 0; col < columnCount; col++) {
                    String key = sheet.getRow(0).getCell(col).getStringCellValue();
                    String value = sheet.getRow(row + 1).getCell(col).getStringCellValue();
                    data.put(key, value);
                }
                dataObject[row][0] = data;
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return dataObject;

    }



}
