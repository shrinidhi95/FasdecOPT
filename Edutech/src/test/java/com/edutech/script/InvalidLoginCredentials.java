package com.edutech.script;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.edutech.pom.OptLoginPage;
import com.edutech.utility.MyUtilis;

public class InvalidLoginCredentials extends BaseTest {
	@Test
	public void testInvalidLoginCredentials() throws InterruptedException{
		
		int rowCount = MyUtilis.getExcelRowCount(LOGINCREDENTIALS_EXCEL_PATH, INVALID_LOGINCREDENTIALS_EXCEL_SHEET_NAME);
		System.out.println("no of rows="+rowCount);
	
		for(int i=1;i<=rowCount;i++){
			
				OptLoginPage loginpage=new OptLoginPage(driver);
				loginpage.getUserName().sendKeys(MyUtilis.getDataFromExcel(LOGINCREDENTIALS_EXCEL_PATH, INVALID_LOGINCREDENTIALS_EXCEL_SHEET_NAME, i,0 ));
				loginpage.getPassword().sendKeys(MyUtilis.getDataFromExcel(LOGINCREDENTIALS_EXCEL_PATH,INVALID_LOGINCREDENTIALS_EXCEL_SHEET_NAME , i,1));
				loginpage.getLoginBtn().click();
				Thread.sleep(6000);
				
				Assert.assertEquals(loginpage.getErrorMsg().isDisplayed(), true);
		
	
		}
		
	}
}
