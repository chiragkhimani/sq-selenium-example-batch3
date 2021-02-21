package com.selenium.class56;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExample1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");

		driver.findElement(By.cssSelector("#start button")).click();

		WebElement element = driver.findElement(By.cssSelector("#finish h4"));

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(element));

//		int count = 1;
//		while (!element.isDisplayed() && count <= 60) {
//			Thread.sleep(1000);
//			count++;
//		}

		System.out.println(element.getText());

	}
}
