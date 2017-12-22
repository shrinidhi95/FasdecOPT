package com.edutech.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OptLoginPage extends BasePage{

	@FindBy(xpath=".//*[@id='text1']")
	private WebElement userName;
	
	@FindBy(id="password1")
	 private WebElement password;
	@FindBy(xpath="//button[.='Login']")
	private WebElement loginBtn;
	@FindBy(xpath="//span[contains(.,'The username/password you entered is incorrect')]")
	private WebElement errorMsg;
	public OptLoginPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUserName(){
		return userName;
	}
	public WebElement getPassword(){
		return password;
	}
	public WebElement getLoginBtn(){
		return loginBtn;
	}
	public WebElement getErrorMsg(){
		return errorMsg;
	}
}
