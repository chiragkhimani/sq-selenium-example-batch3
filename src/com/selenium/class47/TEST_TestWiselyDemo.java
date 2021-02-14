package com.selenium.class47;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

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
 * 08-Feb-2021
 */
public class TEST_TestWiselyDemo
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
	public void testWisely () throws InterruptedException
	{
		webDriver.get ("http://testwisely.com/demo/survey");
		webDriver.manage ().window ().maximize ();
		
		List<WebElement> allPercentageOptions = webDriver.findElements (By.xpath ("//*[@id='body']/div/p[2]/input"));
		
		for (WebElement option : allPercentageOptions)
		{
			if (option.getAttribute ("value").contains ("50%"))
			{
				option.click ();
				assertThat(option.isSelected (), is(true));
			}
			
		}
		
		Thread.sleep(5000);
	}
	
	@After
	public void tearDown () 
	{
		// quit the browser
		webDriver.quit ();
	}
}
