package com.selenium.class51;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveMouse {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/hovers");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement viewProfileImage = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
		
		WebElement viewProfileLink = driver.findElement(By.xpath("(//a[text()='View profile'])[1]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(viewProfileImage).click(viewProfileLink).build().perform();
		
	}
}
