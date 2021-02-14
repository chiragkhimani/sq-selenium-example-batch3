package com.selenium.class49;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://semantic-ui.com/modules/dropdown.html");
		
		driver.findElement(By.xpath("//div[@class='ui fluid dropdown selection multiple']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[contains(@class,'menu transition')]//div[@data-value='angular']")).click();
		
		
		
		
	}
}
