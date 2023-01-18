package com.april.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDetaProvider {
	XSSFWorkbook wb;      //reference variable
	
	public ExcelDetaProvider() throws IOException {
		String excelpath="C:\\Users\\admin\\eclipse-workspace\\FrameWork\\TestData\\deta.xlsx";
		FileInputStream file=new FileInputStream(excelpath);   //giveng access to the file by path
		wb=new XSSFWorkbook(file);                //to fetch data from excel file	
	}
	public String getStringData(String sheetName, int row, int cell) {      //method will return "value" from excel sheet
		return wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();   //based on row and column(cell) no.
	}
}
