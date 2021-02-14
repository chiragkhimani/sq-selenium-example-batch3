package com.selenium.class49;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://support.wix.com/en/article/wix-editor-using-iframes-to-display-visible-content-on-your-site");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='iframe-wrapper']/iframe")));
		
		driver.findElement(By.id("userIn")).sendKeys("This is text area");

	}
}
