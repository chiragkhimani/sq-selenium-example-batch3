package com.selenium.class47;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Tafseer Haider
 * 07-Feb-2021
 */
public class TEST_FindElementsDemo
{
WebDriver webDriver;
	
	@Before
	public void setUp ()
	{
		// set path for Chromedriver executable/binary 
		System.setProperty ("webdriver.chrome.driver", "resources/webdrivers/chromedriver.exe");
				
		// initialize new WebDriver session with Chrome browser
		webDriver = new ChromeDriver();
	}
	
	@Test
	public void searchGoogle ()
	{
		// open the Chrome browser and navigate to Google website
		webDriver.get ("https://www.google.com");
		
		// maximize the browser window
		webDriver.manage ().window ().maximize ();
		
		// locate search box web element
		List<WebElement> inputs = webDriver.findElements (By.tagName ("input"));
		System.out.println (inputs.size ());			
	
	}
	
	
	@After
	public void tearDown () 
	{
		// quit the browser
		webDriver.quit ();
	}

}
