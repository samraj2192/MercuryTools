package com.qa.mercuryTool.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Utils {
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;
	
	public static String TESTDATA_SHEET_PATH = "C:/Users/sabhowmi/workspace"
			+ "/MercuryTools/src/main/java/com/qa/mercuryTool/testdata/TestData.xlsx";

	static XSSFWorkbook book;
	static XSSFSheet sheet;

	public static Object[][] getTestData(String sheetName) {
//		FileInputStream file = null;
//		try {
//			file = new FileInputStream(TESTDATA_SHEET_PATH);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		sheet = book.getSheet(sheetName);
//		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
//		for (int i = 0; i < sheet.getLastRowNum(); i++) {
//			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
//				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
//			}
//		}
//		return data;
		File file = null;
		try{
			file = new File(TESTDATA_SHEET_PATH);
			FileInputStream fis = new FileInputStream(file);
			Workbook book = new XSSFWorkbook(fis);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		Sheet sheet = book.getSheet("NewRegistration");
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0; i<sheet.getLastRowNum(); i++){
			for(int k = 0; k < sheet.getRow(0).getLastCellNum(); k++){
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
			}
		}
		return data;
	}
	

}
