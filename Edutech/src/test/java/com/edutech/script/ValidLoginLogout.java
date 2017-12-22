package com.edutech.script;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.edutech.pom.OptHomePage;
import com.edutech.pom.OptLoginPage;
import com.edutech.utility.MyUtilis;

public class ValidLoginLogout extends BaseTest {

	@Test
	public void testLoginLogout(){
		OptLoginPage loginpage=new OptLoginPage(driver);
	
		String un = MyUtilis.getDataFromExcel(LOGINCREDENTIALS_EXCEL_PATH,VALID_LOGINCREDENTIALS_EXCEL_SHEET_NAME, 1, 0);
		String pw = MyUtilis.getDataFromExcel(LOGINCREDENTIALS_EXCEL_PATH,VALID_LOGINCREDENTIALS_EXCEL_SHEET_NAME, 1, 1);
		loginpage.getUserName().sendKeys(un);
		log.info("username is entered "+un);
		loginpage.getPassword().sendKeys(pw);
		log.info("password  is entered "+pw);
		loginpage.getLoginBtn().click();
		log.info("login button is cliked");

		OptHomePage homepage=new OptHomePage(driver);
		Assert.assertEquals(homepage.getHomeTab().isDisplayed(), true);
		homepage.getLogout().click();
		log.info("logout button is clicked");
		Assert.assertEquals(loginpage.getPassword().isDisplayed(), true);
	}
}

