package com.selenium.class50;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://support.wix.com/en/article/wix-editor-using-iframes-to-display-visible-content-on-your-site");

		
		WebElement iframeEle = driver.findElement(By.xpath("//div[@class='iframe-wrapper']/iframe"));
		driver.switchTo().frame(iframeEle);
		
		
		WebElement textBox = driver.findElement(By.id("userIn"));
		textBox.sendKeys("This is the demo text");
		
		driver.switchTo().defaultContent();
		
		WebElement title = driver.findElement(By.xpath("//header[@class='article-header']/h1"));
		System.out.println(title.getText());
		
	}
}
