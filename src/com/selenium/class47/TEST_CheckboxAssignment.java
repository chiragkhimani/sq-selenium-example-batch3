/**
 * 
 */
package com.selenium.class47;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

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
public class TEST_CheckboxAssignment
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
	public void clickLink () throws InterruptedException
	{
		// open the Chrome browser and navigate to website
		webDriver.get ("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		
		// maximize the browser window
		webDriver.manage ().window ().maximize ();
		
		WebElement chkOption3 = webDriver.findElement (By.cssSelector ("div.panel-body > div:nth-child(5) > label > input"));
		chkOption3.click ();
		
		assertThat(chkOption3.isSelected (), is(true));
		
		Thread.sleep (5000);
		
	}
	
	@After
	public void tearDown () 
	{
		// quit the browser
		webDriver.quit ();
	}
}
