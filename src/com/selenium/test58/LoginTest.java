package com.selenium.test58;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;

	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "resources//webdrivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void cleanCookie() {
		driver.manage().deleteAllCookies();
	}

	@Test(groups = { "smoke", "chirag" })
	public void verifyLoginSuccessfulWithValidCred() {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println(driver.findElement(By.id("branding")).isDisplayed());
	}

	@Test(groups = { "regression", "yusuf" })
	public void verifyLoginUnSuccessfulWithInValidCred() {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		driver.findElement(By.id("txtUsername")).sendKeys("admin1234");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println(driver.findElement(By.id("spanMessage")).isDisplayed());
	}

	@Test(groups = { "regression", "chirag" })
	public void verifyLoginUnSuccessfulWithBlankCred() {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println(driver.findElement(By.id("spanMessage")).isDisplayed());
	}

	@AfterSuite
	public void cleanUp() {
		driver.quit();
	}
}
