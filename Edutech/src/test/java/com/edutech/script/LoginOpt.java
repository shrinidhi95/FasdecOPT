package com.edutech.script;

import java.util.Iterator;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.edutech.pom.AccountSelectPage;
import com.edutech.pom.ContactsPage;
import com.edutech.pom.OptHomePage;
import com.edutech.pom.OptLoginPage;

public class LoginOpt extends BaseTest{
	@Test
	public void testLoginOpt(){
		OptLoginPage login=new OptLoginPage(driver);
		login.getUserName().sendKeys("demo");
		login.getPassword().sendKeys("optdemo");
		login.getLoginBtn().click();
		OptHomePage home=new OptHomePage(driver);
		home.getCreateContact().click();
		ContactsPage contact=new ContactsPage(driver);
		contact.getLastName().sendKeys("awadhani");
		contact.getAccountNameSelect().click();
		Iterator<String> itr = driver.getWindowHandles().iterator();
		String parent=itr.next();
		String child=itr.next();
		driver.switchTo().window(child);
		AccountSelectPage account=new AccountSelectPage(driver);
		account.getAccountName().click();
		
		driver.switchTo().window(parent);
		Assert.assertEquals(driver.getTitle(), "Contact | FasDec CRM Solutions");
	}
	
}
