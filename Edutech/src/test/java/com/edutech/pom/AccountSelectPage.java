package com.edutech.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSelectPage extends BasePage{

	@FindBy(xpath="//a[.='478']")
	private WebElement selectAccount;
	
	public AccountSelectPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getAccountName(){
		return selectAccount;
	}
	
}
