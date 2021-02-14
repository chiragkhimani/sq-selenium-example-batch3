package com.selenium.class51;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		WebElement iframe = driver.findElement(By.xpath("//iframe[contains(@data-src,'photo-manager')]"));

		driver.switchTo().frame(iframe);

		List<WebElement> images = driver.findElements(By.xpath("//ul[@id='gallery']/li/img"));

		WebElement trashArea = driver.findElement(By.id("trash"));

		Actions action = new Actions(driver);

		for (WebElement image : images) {
			action.dragAndDrop(image, trashArea).pause(2000).build().perform();
		}

	}
}
