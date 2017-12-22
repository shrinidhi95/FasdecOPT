package com.edutech.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MyUtilis {
	
	public static String dateAndTimeStamp(){
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-YY-hh-mm-ss");
		return sdf.format(new Date());
	}
	public static String getDataFromExcel(String excelPath,String sheetName,int rowNum,int cellNum){
		String value="";
		try{
			FileInputStream fis=new FileInputStream(excelPath);
			value= WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNum).getCell(cellNum).toString();
		}
		catch(Exception e){
			//e.printStackTrace();
		}
		return value;
	}
	
	public static int getExcelRowCount(String excelPath,String sheetName){
		int rowNum=0;
		try{
			FileInputStream fis=new FileInputStream(excelPath);
			rowNum= WorkbookFactory.create(fis).getSheet(sheetName).getLastRowNum();
		}
		catch(Exception e){
			//e.printStackTrace();
		}
		return rowNum;
	}
	public static int getExcelCellCount(String excelPath,String sheetName,int rownum){
		int cellNum=0;
		try{
			FileInputStream fis=new FileInputStream(excelPath);
			cellNum= WorkbookFactory.create(fis).getSheet(sheetName).getRow(rownum).getLastCellNum();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return cellNum;
	}
	public static void takeScreenShot(WebDriver driver,String screenShotPath){
		File srcfile = ((RemoteWebDriver)driver).getScreenshotAs(OutputType.FILE);
		File desfile=new File(screenShotPath);
		try {
			FileUtils.copyFile(srcfile, desfile);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
}
