package com.selenium.class49;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");
		
		WebElement dropdown = driver.findElement(By.id("gh-cat"));

		Select catDropdown = new Select(dropdown);
		
		catDropdown.selectByIndex(4);
		
		catDropdown.selectByVisibleText("Consumer Electronics");
		
		catDropdown.selectByValue("619");
		
		System.out.println(catDropdown.isMultiple());
		
		List<WebElement> listOfOption = catDropdown.getOptions();
		
		for (WebElement option : listOfOption) {
			System.out.println(option.getText());
		}
		
	}
}
