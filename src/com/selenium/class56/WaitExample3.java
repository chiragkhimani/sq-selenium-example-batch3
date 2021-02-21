package com.selenium.class56;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExample3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html");
		
		WebElement startBtn = driver.findElement(By.id("button00"));
		WebElement btnOne = driver.findElement(By.id("button01"));
		WebElement btnTwo = driver.findElement(By.id("button02"));
		WebElement btnThree = driver.findElement(By.id("button03"));

		System.out.println(startBtn.isDisplayed());
		startBtn.click();
		System.out.println("Start button clicked");

		System.out.println(btnOne.isDisplayed());
		btnOne.click();
		System.out.println("First button clicked");

		System.out.println(btnTwo.isDisplayed());
		btnTwo.click();
		System.out.println("Second button clicked");

		System.out.println(btnThree.isDisplayed());
		btnThree.click();
		System.out.println("Third button clicked");

		WebElement message = driver.findElement(By.id("buttonmessage"));
		System.out.println(message.getText());
	}
}
