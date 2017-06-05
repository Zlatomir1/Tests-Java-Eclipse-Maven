package com.javafortesters.chapjunit.examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;
import org.openqa.selenium.firefox.*;

public class TestCaseExampleLocateElement {
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
	//We can add one more element to be sure there are a "log in" form in www.abv.bg
	WebElement element1 = driver.findElement(By.name("password"));
		}
}