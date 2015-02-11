package com.CO;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {
			public static String[] readFromExcel(String sSheetName,int iColNum) throws Exception{
	
	File excel = new File("C:\\Selenium\\CharlotteOlympia\\src\\excel\\Input.xlsx");
	FileInputStream fis= new FileInputStream(excel);
	XSSFWorkbook wb= new XSSFWorkbook(fis);
	XSSFSheet sheet = wb.getSheet(sSheetName);
	int rowNum = sheet.getLastRowNum()+1;
	//System.out.println("rowNum : "+rowNum);
	int colNum =sheet.getRow(0).getLastCellNum();
	String[] data = new String[rowNum];
	for(int i=1;i<rowNum;i++){
		XSSFRow row = sheet.getRow(i);
		XSSFCell cell = row.getCell(iColNum);
		//System.out.println(cell);
		//String value = cell.getStringCellValue();
		String value =cell.toString();
		data[i]=value;
		//System.out.println("value is"+value);
		
				
		
	}
	return data;
	
	
	}
}

