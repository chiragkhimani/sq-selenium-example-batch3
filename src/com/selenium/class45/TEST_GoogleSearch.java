package com.selenium.class45;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Tafseer Haider
 * 05-Feb-2021
 */
public class TEST_GoogleSearch
{

	public static void main (String[] args) throws InterruptedException
	{
		
		// set path for Chromedriver executable/binary 
		System.setProperty ("webdriver.chrome.driver", "resources/webdrivers/chromedriver.exe");
		
		// initialize new WebDriver session with Chrome browser
		WebDriver webDriver = new ChromeDriver();
		
		// open the Chrome browser and navigate to Google website
		webDriver.get ("https://www.google.com");
		
		// maximize the browser window
		webDriver.manage ().window ().maximize ();
		
		// put some sleep wait
		Thread.sleep (5000);
		
		// close the browser
		webDriver.close ();
		webDriver.quit ();

	}

}
