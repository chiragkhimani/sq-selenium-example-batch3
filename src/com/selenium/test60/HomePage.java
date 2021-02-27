package com.selenium.test60;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(id = "branding")
	WebElement logo;
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void validateHomePage() {
		System.out.println(logo.isDisplayed());
	}

}
