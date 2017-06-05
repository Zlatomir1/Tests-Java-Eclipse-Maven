package com.javafortesters.chap007basicsofjavarevisited.examples;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise15SomeTestsWithAsserts {
	ChromeDriver driver;
	@Before
	public void setUp(){
	System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.abv.bg");
	}
	@After
	public void uDown(){
	driver.quit();
	}
	@Test
	public void uTest(){
	WebElement element= driver.findElement(By.name("username"));
	assertEquals("Expected result is username","username","username");
	
	}
	@Test
	public void secondTest(){
	WebElement element1	= driver.findElement(By.name("password"));
	assertEquals("Expected result is password","password","password");
	}
	@Test
	public void trirdTest(){
	WebElement element2	= driver.findElement(By.id("loginBut"));
	assertEquals("Expected result is loginBut","loginBut","loginBut");
	}
	@Test
	public void forthTest(){
	WebElement element3	= driver.findElement(By.className("clear"));
	assertEquals("Expected result is clear as a classname","clear","clear");
	}
	@Test
	public void fiftTest(){
		String aString = "loginBut";
	WebElement element4	= driver.findElement(By.name("loginBut"));
	assertEquals("Expected result is loginBut","loginBut","loginBut");
	assertEquals(8, aString.length());
	assertTrue(aString.compareToIgnoreCase("loginBut")==0);
	assertTrue(aString.contains("But"));
	assertTrue(aString.startsWith("login"));
	}
}	