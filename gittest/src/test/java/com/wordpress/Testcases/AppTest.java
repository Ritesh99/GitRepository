package com.wordpress.Testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AppTest {		
    private WebDriver driver;		
	@Test				
	public void testEasy() {	
		driver.get("https://www.google.co.in/");  
		String title = driver.getTitle();				 
		AssertJUnit.assertTrue(title.contains("Google")); 		
	}	
	@BeforeTest
	public void beforeTest() {	
	    driver = new FirefoxDriver();  
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}		
}	