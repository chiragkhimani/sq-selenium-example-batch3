package com.selenium.class57;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://testpages.herokuapp.com/styled/file-upload-test.html");

		WebElement fileInput = driver.findElement(By.id("fileinput"));

		fileInput.sendKeys("C:\\Users\\khima\\java-training\\SeleniumExamples\\Test.txt");

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		System.out.println(driver.findElement(By.id("uploadedfilename")).getText());
	}
}
