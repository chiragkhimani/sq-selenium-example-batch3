package com.selenium.test60;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test(groups = { "smoke", "chirag" })
	public void verifyLoginSuccessfulWithValidCred() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openWebsite();
		loginPage.doLogin("admin", "admin123");

		HomePage homePage = new HomePage(driver);
		homePage.validateHomePage();
	}

	@Test(groups = { "regression", "yusuf" })
	public void verifyLoginUnSuccessfulWithInValidCred() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openWebsite();
		loginPage.doLogin("admin123", "addd");
		loginPage.validateLoginErrorMsg();
	}

	@Test(groups = { "regression", "chirag" })
	public void verifyLoginUnSuccessfulWithBlankCred() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openWebsite();
		loginPage.doLogin("", "");
		loginPage.validateLoginErrorMsg();
	}

}
