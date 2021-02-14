package com.selenium.class50;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/iframe");
		
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div[@id='page-footer']//a")).click();

		String currentWindow = driver.getWindowHandle();

		Set<String> windowList = driver.getWindowHandles();

		for (String window : windowList) {
			if (!window.equals(currentWindow)) {
				driver.switchTo().window(window);
			}
		}

		System.out.println(driver.findElement(By.xpath("//h2")).getText());

		driver.close();

		driver.switchTo().window(currentWindow);

		driver.findElement(By.xpath("//img[@alt='Fork me on GitHub']")).click();

	}
}
