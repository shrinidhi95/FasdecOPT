package com.edutech.script;

public interface AutomationConstant {

	String LOGINCREDENTIALS_EXCEL_PATH=System.getProperty("user.dir")+"\\testData\\loginCredentials.xlsx";
	String VALID_LOGINCREDENTIALS_EXCEL_SHEET_NAME="loginData";
	String INVALID_LOGINCREDENTIALS_EXCEL_SHEET_NAME="invalidLoginData";
	String SCREEN_SHOT_PATH=System.getProperty("user.dir")+"\\ScreenShots\\";
}
