package com.selenium.class45;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Tafseer Haider
 * 05-Feb-2021
 */
public class TEST_Amazon
{

	public static void main (String[] args)
	{
		// set the path for Firefox binary
		System.setProperty ("webdriver.gecko.driver", "resources/webdrivers/geckodriver.exe");
		
		// initialize new WebDriver session with Firefox
		WebDriver webDriver = new FirefoxDriver();
		
		// open Firefox and navigate to the Amazon website
		webDriver.get ("https://www.amazon.com");
		
		// change the window to full screen mode
		webDriver.manage ().window ().fullscreen ();
		
		// quit the browser
		webDriver.quit ();
	}

}
