package com.selenium.class57;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExample {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://www.ebay.com/");

		WebElement searchBox = driver.findElement(By.id("gh-ac"));
		highlightElement(searchBox, driver);
		searchBox.sendKeys("TV");

		WebElement searchBtn = driver.findElement(By.id("gh-btn"));
		highlightElement(searchBtn, driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", searchBtn);
		
		String url = "https://www.google.com/";
		openURLInNewTab(url, driver);
		
	}

	public static void highlightElement(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	public static void openURLInNewTab(String url, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open(arguments[0]);",url);
	}
}
