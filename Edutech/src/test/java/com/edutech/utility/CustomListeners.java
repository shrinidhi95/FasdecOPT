package com.edutech.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.edutech.script.AutomationConstant;
import com.edutech.script.BaseTest;
import com.edutech.script.ValidLoginLogout;

public class CustomListeners extends BaseTest implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String screenShotPath=AutomationConstant.SCREEN_SHOT_PATH+result.getName()+MyUtilis.dateAndTimeStamp()+".png";
		System.out.println(screenShotPath);
		MyUtilis.takeScreenShot(driver, screenShotPath);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
