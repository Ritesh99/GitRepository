package com.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.Pages.LoginPage;

import Helper.BrowserFactory;

public class VerifyValidLogin 
{
	
	@Test
	public void checkValidUser()
	{
	WebDriver driver=BrowserFactory.startBrowser("firefox", "http://demosite.center/wordpress/wp-login.php");
	
	LoginPage login_page=PageFactory.initElements(driver, LoginPage.class);
	
	login_page.login_wordpress("admin","demo123");
	
	driver.close();
	
	}

}
