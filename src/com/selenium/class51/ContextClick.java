package com.selenium.class51;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;

public class ContextClick {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.ebay.com/");

		Thread.sleep(2000);

		WebElement registerLink = driver.findElement(By.xpath("//a[text()='register']"));

		Actions action = new Actions(driver);

//		action.contextClick(registerLink).moveByOffset(300, 0).sendKeys(Keys.RETURN).build().perform();

		action.sendKeys(Keys.CONTROL + "t").build().perform();

		Thread.sleep(2000);

	}
}
