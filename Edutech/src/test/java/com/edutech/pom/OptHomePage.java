package com.edutech.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OptHomePage extends BasePage{
	
	@FindBy(xpath="//a[.='Create Contact']")
	private WebElement createContact;
	@FindBy(xpath="//span[.='Home']")
	private WebElement homeTab;
	
	public OptHomePage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCreateContact(){
		return createContact;
	}
	public WebElement getHomeTab(){
		return homeTab;
	}
}
