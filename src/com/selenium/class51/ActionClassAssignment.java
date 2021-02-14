package com.selenium.class51;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassAssignment {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");

		// 1. Open url
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		// 2. Open new window
		WebElement forgetPassLink = driver.findElement(By.xpath("//div[@id='forgotPasswordLink']/a"));
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(forgetPassLink).keyUp(Keys.CONTROL).build().perform();

		// 3. Open google into new window
		String currentWindow = driver.getWindowHandle();
		switchToNewWindow(driver, currentWindow);
		driver.get("https://www.google.com");

		// 4. Close new window
		driver.close();

		// 5. Login into orange hrm
		driver.switchTo().window(currentWindow);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

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
