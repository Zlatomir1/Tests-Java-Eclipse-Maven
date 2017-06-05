package com.javafortesters.chapnextjunit.examples;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTitleCorrectOnApp {
	
	WebDriver driver;
	@Test
	public void checkTitleCorrectOnApp(){
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe"); 
		driver = new ChromeDriver(); 
		driver.get("http://www.google.bg");
	
	driver.get("http:\\www.abv.bg");
	String username = "username";
	assertEquals("title shoud match","username",username,driver.findElement(By.name("username")));
	}
	private void assertEquals(String string, String string2, String username, WebElement findElement){
		
		
	}
	@After 
	public void tearDown() {
		driver.quit();
		}
	 
}
