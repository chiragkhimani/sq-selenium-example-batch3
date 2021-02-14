package com.selenium.class50;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

		driver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();

		Thread.sleep(4000);

		Alert myAlert = driver.switchTo().alert();
		System.out.println(myAlert.getText());
		myAlert.sendKeys("Test Input");
		Thread.sleep(4000);
		myAlert.accept();

	}
}
