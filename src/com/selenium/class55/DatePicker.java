package com.selenium.class55;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	public static void main(String[] args) throws InterruptedException {
		String date = "12 December 2021";

		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/datepicker/");

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

		driver.findElement(By.id("datepicker")).click();

		Thread.sleep(3000);

		String day = date.split(" ")[0];
		String month = date.split(" ")[1];
		String year = date.split(" ")[2];

		WebElement nextBtn = driver.findElement(By.xpath("//a[@title='Next']"));
		WebElement calMonthValue = driver.findElement(By.cssSelector(".ui-datepicker-month"));
		WebElement calYearValue = driver.findElement(By.cssSelector(".ui-datepicker-year"));

		while (!(calMonthValue.getText().equals(month) && calYearValue.getText().equals(year))) {
			nextBtn.click();
			calMonthValue = driver.findElement(By.cssSelector(".ui-datepicker-month"));
			calYearValue = driver.findElement(By.cssSelector(".ui-datepicker-year"));
			nextBtn = driver.findElement(By.xpath("//a[@title='Next']"));
		}

		String dateLoc = "//table[@class='ui-datepicker-calendar']/tbody/tr/td/a[text()='%s']";
		driver.findElement(By.xpath(String.format(dateLoc, day))).click();

	}
}
