package com.selenium.class46;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Tafseer Haider
 * 06-Feb-2021
 */
public class TEST_GoogleSearchRedo
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
	public void searchGoogle () throws InterruptedException
	{
		// open the Chrome browser and navigate to Google website
		webDriver.get ("https://www.google.com");
		
		// maximize the browser window
		webDriver.manage ().window ().maximize ();
		
		// locate search box web element
		WebElement txtSearchBox = webDriver.findElement (By.name ("q"));
		txtSearchBox.sendKeys ("Inna Ananyeva");
		txtSearchBox.submit ();		
		
		// put some sleep wait
		Thread.sleep (5000);	
		
	}
	
	@After
	public void tearDown () 
	{
		// quit the browser
		webDriver.quit ();
	}
}
