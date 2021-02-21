package com.selenium.class57;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");

		List<WebElement> listOfLink = driver.findElements(By.xpath("//a[text() and @href]"));

		checkBrokenLink(listOfLink);
	}
	
	public static void checkBrokenLink(List<WebElement> listOfLink) throws Exception {
		for (WebElement link : listOfLink) {
			String hrefLink = link.getAttribute("href");
			System.out.println(link.getText());

			URL url = new URL(hrefLink);
			HttpURLConnection http = (HttpURLConnection) url.openConnection();

			int respones = http.getResponseCode();

			if (respones >= 399) {
				System.out.println(link.getText()+"   "+hrefLink);
			}
		}
	}
}
