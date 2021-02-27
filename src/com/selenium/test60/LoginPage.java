package com.selenium.test60;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void validateLoginErrorMsg() {
		System.out.println(driver.findElement(By.id("spanMessage")).isDisplayed());
	}

	public void openWebsite() {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	}

	public void doLogin(String usernmae, String password) {
		driver.findElement(By.id("txtUsername")).sendKeys(usernmae);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
	}

}
