package com.CO;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelRead {
	public static void main(String[] args) throws Exception {
		File excel = new File("C:\\Selenium\\CharlotteOlympia\\src\\excel\\Data.xlsx");
		FileInputStream fis = new FileInputStream(excel);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheet("Input");
		
		int rowNum = ws.getLastRowNum()+1;
		int colNum = ws.getRow(0).getLastCellNum();
		System.out.println(colNum);
		String[][] data = new String[rowNum][colNum];
		for(int i=0;i<rowNum;i++){
			XSSFRow row = ws.getRow(i);
			for (int j=0;j<colNum;j++){
				XSSFCell cell =row.getCell(j);
				
				String value = cell.getStringCellValue();
				
				data[i][j] = value;
				System.out.println("the value is"+value);
			}
			
		}
		
	}

}
