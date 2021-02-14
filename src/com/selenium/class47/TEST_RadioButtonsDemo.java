/**
 * 
 */
package com.selenium.class47;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Tafseer Haider
 * 07-Feb-2021
 */
public class TEST_RadioButtonsDemo
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
		webDriver.get ("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		
		// maximize the browser window
		webDriver.manage ().window ().maximize ();
		
		//WebElement radoGenderSelection = webDriver.findElement (By.cssSelector ("div.panel-body > label:nth-child(2) > input[type=radio]"));
		WebElement radoGenderSelection = webDriver.findElement (By.xpath ("//input[@name='optradio'][@value='Male']"));
		radoGenderSelection.click ();
		
		WebElement btnGender = webDriver.findElement (By.id ("buttoncheck"));
		btnGender.click ();
		
		WebElement verificationLabel = webDriver.findElement (By.cssSelector ("p.radiobutton"));
		
		assertThat(verificationLabel.getText (), equalTo("Radio button 'Male' is checked"));
		
		assertThat(radoGenderSelection.isSelected (), is(true));
		
		Thread.sleep (5000);
		
	}
	
	@After
	public void tearDown () 
	{
		// quit the browser
		webDriver.quit ();
	}
	
	

}
