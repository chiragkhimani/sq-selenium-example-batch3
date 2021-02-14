/**
 * 
 */
package com.selenium.class46;


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
public class TEST_TheInternet
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
	
	@After
	public void tearDown () 
	{
		// quit the browser
		webDriver.quit ();
	}
	
	@Test
	public void clickLink () throws InterruptedException
	{
		// open the Chrome browser and navigate to Google website
		webDriver.get ("http://the-internet.herokuapp.com");
		
		// maximize the browser window
		webDriver.manage ().window ().maximize ();
		
		WebElement lnkInputs = webDriver.findElement (By.linkText ("Inputs"));
		lnkInputs.click ();
		
		WebElement txtNumber = webDriver.findElement (By.cssSelector ("input[type=number]"));
		
		txtNumber.sendKeys ("12462");	
		
		Thread.sleep (5000);
		
	}
}
