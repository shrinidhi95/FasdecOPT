package com.edutech.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(MyUtilis.dateAndTimeStamp());
		/*System.setProperty("webdriver.chrome.driver", "D:\\Browserdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.cricbuzz.com");
		RemoteWebDriver rdriver = (RemoteWebDriver)driver;
		Thread.sleep(2000);
		File sfile = rdriver.getScreenshotAs(OutputType.FILE);
		File dfile=new File(System.getProperty("user.dir")+"\\ScreenShots\\demo1.png");
		try {
			FileUtils.copyFile(sfile, dfile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.close();*/
}
}