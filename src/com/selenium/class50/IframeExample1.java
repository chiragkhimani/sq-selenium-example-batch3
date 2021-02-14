package com.selenium.class50;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/iframe");
		
		Thread.sleep(2000);

		// Print Title into the console
		WebElement title = driver.findElement(By.xpath("//h3"));
		System.out.println(title.getText());

		Thread.sleep(2000);
		
		// Switching to the iFrame
		WebElement iFrame = driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(iFrame);

		WebElement editBox = driver.findElement(By.xpath("//body[@id='tinymce']/p"));
		System.out.println(editBox.getAttribute("value"));

		Thread.sleep(2000);
		
		editBox.clear();
		
		Thread.sleep(2000);
		editBox.sendKeys("This is our input");
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();

		WebElement elementalLink = driver.findElement(By.xpath("//div[@id='page-footer']//a"));
		elementalLink.click();

	}
}
