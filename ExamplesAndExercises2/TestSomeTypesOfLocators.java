package com.javafortesters.chapnextjunit.examples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSomeTypesOfLocators {
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
		WebElement element = driver.findElement(By.name("username"));
		WebElement element1 = driver.findElement(By.id("loginBut"));
		driver.findElement(By.className("clear"));
		driver.findElement(By.tagName("script"));
			}
	}

