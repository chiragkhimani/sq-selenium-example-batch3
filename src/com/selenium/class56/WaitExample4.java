package com.selenium.class56;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExample4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 60);

		driver.get("http://demo.automationtesting.in/Loader.html");

		driver.findElement(By.id("loader")).click();

		WebElement ele = driver.findElement(By.xpath("//div[@class='modal-body']/p"));
		
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		System.out.println(ele.getText());

		driver.findElement(By.xpath("//button[text()='Save changes']")).click();

	}
}
