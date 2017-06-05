package com.javafortesters.chapnextjunit.examples;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestAppCheckTitle {
	WebDriver driver;
	
	@Before
	public void setUp() { 
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe"); 
		driver = new ChromeDriver(); 
		driver.get("http://www.abv.bg");
		}
	@After 
	public void tearDown() {
		driver.quit();
		}
	@Test
	public void testExamples(){
		assertEquals("Title should match","АБВ Поща", driver.getTitle());
   
	}

}