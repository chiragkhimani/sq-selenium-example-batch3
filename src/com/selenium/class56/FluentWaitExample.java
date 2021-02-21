package com.selenium.class56;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class FluentWaitExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait expWait = new WebDriverWait(driver, 60);

		driver.get("https://www.minted.com/");
		
		driver.manage().window().maximize();
		
		Wait<WebDriver> fWait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(120))
				  .pollingEvery(Duration.ofSeconds(60))
				  .ignoring(NoSuchElementException.class);

		Boolean b = fWait.until(new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.xpath("//input[@placeholder='Email address']")).isDisplayed();
			}
		});

		if(b==true) {
			driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("Test@gmail.com");
		}else {
			System.out.println("element is not displayed");
		}


	}
}
