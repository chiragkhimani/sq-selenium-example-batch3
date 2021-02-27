package com.selenium.test60;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPasswordPage {

	@FindBy(id = "securityAuthentication_userName")
	WebElement userNameInput;

	@FindBy(id = "btnSearchValues")
	WebElement resetPassBtn;

	WebDriver driver;

	public ForgetPasswordPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterUsername(String username) {
		userNameInput.sendKeys(username);
	}

	public void clickOnResetPasswordBtn() {
		resetPassBtn.click();
	}

}
