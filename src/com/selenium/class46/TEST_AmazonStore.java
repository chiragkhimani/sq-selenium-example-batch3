/**
 * 
 */
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
 * 07-Feb-2021
 */
public class TEST_AmazonStore
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
	public void searchProduct () throws InterruptedException
	{
		// open the Chrome browser and navigate to Google website
		webDriver.get ("https://www.amazon.com");
		
		// maximize the browser window
		webDriver.manage ().window ().maximize ();
		
		WebElement txtSearchBox = webDriver.findElement (By.id ("twotabsearchtextbox"));
		txtSearchBox.sendKeys ("Iphone 12");
		
		WebElement btnSearch = webDriver.findElement (By.id ("nav-search-submit-button"));
		
		btnSearch.submit ();	
		
		Thread.sleep (5000);
		
	}

}
