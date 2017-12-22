package com.edutech.script;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.edutech.utility.CustomListeners;
@Listeners(CustomListeners.class)
public abstract class BaseTest implements AutomationConstant {
 
	public Logger log=Logger.getLogger(this.getClass().getName());
	
	public static WebDriver driver;
	@Parameters("browserName")
	@BeforeMethod
	public void setUp(@Optional("chrome")  String browserName){
		System.out.println(browserName);
		if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\Browserdriver\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();	
			log.info("chrome browser is launched");
		}
		else if(browserName.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "D:\\Browserdriver\\IEDriverServer_x64_3.8.0\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			log.info("ie browser is launched");
		}
		else{
			System.setProperty("webdriver.gecko.driver", "D:\\Browserdriver\\geckodriver-v0.19.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			log.warn("Please specify the correct browser name");
			log.info("firefox browser is launched");
		}
		driver.get("http://www.opt.fasdec.org/opt/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void tearDown(){
		driver.close();
		log.info("browser is closed");
	}
}
