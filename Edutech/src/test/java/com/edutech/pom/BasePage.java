package com.edutech.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

	@FindBy(xpath="//a[.='logout']")
	private WebElement logout;
	
	public BasePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public WebElement getLogout(){
		return logout;
	}
}
