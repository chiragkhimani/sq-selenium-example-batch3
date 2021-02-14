package com.selenium.class48;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/books");

		WebElement title = driver.findElement(By.className("main-header"));

		String text = title.getText();

		System.out.println(text);

		WebElement bookLink = driver.findElement(By.cssSelector("#see-book-Git\\ Pocket\\ Guide >a"));
		
		System.out.println(bookLink.getAttribute("href"));
		
		System.out.println(bookLink.getText());

		bookLink.click();

		WebElement description = driver.findElement(By.xpath("//div[@id='description-wrapper']//label[@id='userName-value']"));

		System.out.println(description.getText());
		
		

	}
}
