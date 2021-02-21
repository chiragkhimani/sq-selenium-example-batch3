package com.selenium.class57;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUpload {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/FileUpload.html");
		
		WebElement fileUploadInput = driver.findElement(By.id("input-4"));
		
		fileUploadInput.sendKeys(System.getProperty("user.dir")+"\\Test.txt");
		
	}
}
