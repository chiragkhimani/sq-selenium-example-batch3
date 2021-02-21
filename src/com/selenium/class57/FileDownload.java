package com.selenium.class57;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownload {
	public static void main(String[] args) {

		Map<String, String> pref = new HashMap<String, String>();
		pref.put("download.default_directory", "C:\\Users\\khima\\java-training\\SeleniumExamples\\src\\com\\selenium\\class45");
		
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("prefs", pref);

		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://testpages.herokuapp.com/styled/download/download.html");

		driver.findElement(By.id("direct-download")).click();
	}
}
