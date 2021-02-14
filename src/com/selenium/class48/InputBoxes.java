package com.selenium.class48;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxes {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/automation-practice-form");

		WebElement firstName = driver.findElement(By.id("//tagName [@attribute='Value']"));

		firstName.clear();

		firstName.sendKeys("Chirag");

		System.out.println(firstName.getAttribute("value"));

		System.out.println(!firstName.isEnabled());

		firstName.sendKeys(Keys.ENTER);

	}
}
