package com.selenium.class50;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Windows.html");

		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();

		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		String currentWindow = driver.getWindowHandle();

		switchToNewWindow(driver, currentWindow);

		System.out.println(driver.findElement(By.xpath("//div[@id='banner-blm']//strong")).getText());

		driver.close();

		driver.switchTo().window(currentWindow);

		System.out.println(driver.findElement(By.xpath("//header//h1")).getText());

	}

	public static void switchToNewWindow(WebDriver driver, String currentWindow) {
		Set<String> windowList = driver.getWindowHandles();

		for (String window : windowList) {
			if (!window.equals(currentWindow)) {
				driver.switchTo().window(window);
			}
		}
	}
}
