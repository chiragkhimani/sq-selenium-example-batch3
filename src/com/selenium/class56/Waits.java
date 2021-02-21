package com.selenium.class56;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.minted.com/");
		
		driver.findElement(By.id("bx-element-1303201-Gu64MsV-input")).sendKeys("test@gmail.com");
	}
}
