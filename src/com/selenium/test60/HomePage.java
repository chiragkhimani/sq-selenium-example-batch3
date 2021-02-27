package com.selenium.test60;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void validateHomePage() {
		System.out.println(driver.findElement(By.id("branding")).isDisplayed());
	}

}
