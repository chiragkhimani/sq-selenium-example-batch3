package com.selenium.class57;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkUI {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://www.minted.com/");

		List<WebElement> listOfLink = driver.findElements(By.xpath("//a[text() and @href]"));

		for (WebElement link : listOfLink) {
			System.out.println(link.getText());
			link.click();
			if (!driver.findElement(By.xpath("//img[@class='logo img-responsive']")).isDisplayed()) {
				System.out.println(link.getText() + " " + link.getAttribute("href"));
			}
			driver.navigate().back();
			listOfLink = driver.findElements(By.xpath("//a[text() and @href]"));
		}
	}
}
