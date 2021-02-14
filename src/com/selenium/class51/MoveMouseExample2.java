package com.selenium.class51;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveMouseExample2 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");

		WebElement headerLink = driver
				.findElement(By.xpath("//li[contains(@class,'hl-cat-nav__js-tab')]/a[text()='Motors']"));

		WebElement subMenuLink = driver.findElement(By.xpath("//a[text()='Cars & Trucks']"));

		Actions action = new Actions(driver);
		action.moveToElement(headerLink).pause(2000).click(subMenuLink).build().perform();

	}
}
