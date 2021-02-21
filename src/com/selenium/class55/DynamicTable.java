package com.selenium.class55;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://datatables.net/");

		Thread.sleep(3000);

		List<WebElement> rowList = driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));

		String rowDataXpath = "//table[@id='example']/tbody/tr[%s]/td[not(contains(@style,'none'))]";

		for (int i = 1; i <= rowList.size(); i++) {
			String finalLoc = String.format(rowDataXpath, i);
			List<WebElement> rowDataList = driver.findElements(By.xpath(finalLoc));

			for (WebElement data : rowDataList) {
				System.out.print(data.getText() + "    ");
			}
			System.out.println();
		}
	}
}
