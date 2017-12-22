package com.edutech.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage extends BasePage {
	@FindBy(id="text2")
	private WebElement lastName;
	@FindBy(xpath=".//*[@id='suggest']/button")
	private WebElement accountNameSelect;
	public ContactsPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getLastName(){
		return lastName;
	}
	
	public WebElement getAccountNameSelect(){
		return accountNameSelect;
	}
}
