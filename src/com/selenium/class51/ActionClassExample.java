package com.selenium.class51;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExample {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/login");

		Actions action = new Actions(driver);

		WebElement userNameInput = driver.findElement(By.id("username"));
		WebElement passwordInput = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));

		action.click(userNameInput).pause(2000).sendKeys("tomsmith").build().perform();
		action.click(passwordInput).sendKeys("SuperSecretPassword!").build().perform();
		loginBtn.click();

		System.out.println(driver.findElement(By.xpath("//div[@id='flash']")).getText());

		action.click(driver.findElement(By.xpath("//i[contains(text(),'Logout')]"))).perform();

	}
}
