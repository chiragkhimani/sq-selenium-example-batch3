package com.selenium.class54;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/tables");

		List<WebElement> rowList = driver.findElements(By.xpath("//table[@id='table2']/tbody/tr"));
		
		String rowDataXpath = "//table[@id='table2']/tbody/tr[%s]/td[not(./a)]";

		for (int i = 1; i <= rowList.size(); i++) {

			String finalLoc = String.format(rowDataXpath, i);
			List<WebElement> rowDataList = driver.findElements(By.xpath(finalLoc));
			
			for (WebElement data : rowDataList) {
				System.out.print(data.getText()+"    ");
			}
			
			System.out.println();

		}
	}
}
