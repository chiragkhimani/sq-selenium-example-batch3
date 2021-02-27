package com.selenium.test60;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id = "txtUsername")
	WebElement userNameInput;

	@FindBy(id = "spanMessage")
	WebElement loginErrorMsg;

	@FindBy(id = "txtPassword")
	WebElement passwordInput;

	@FindBy(id = "btnLogin")
	WebElement loginBtn;

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void validateLoginErrorMsg() {
		System.out.println(loginErrorMsg.isDisplayed());
	}

	public void openWebsite() {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	}

	public void doLogin(String usernmae, String password) {
		userNameInput.sendKeys(usernmae);
		passwordInput.sendKeys(password);
		loginBtn.click();
	}

}
