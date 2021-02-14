package com.selenium.class50;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsWithoutAlertOpen {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
			
	
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	
		if(isAlertPresent(driver)) {
			driver.switchTo().alert().accept();
		}

		Thread.sleep(4000);

	}

	public static boolean isAlertPresent(WebDriver driver) {
		try {
			driver.switchTo().alert();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
