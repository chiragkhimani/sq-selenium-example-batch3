package com.selenium.test58;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTest {

	@BeforeMethod
	public void setUp() {
		System.out.println("Create driver");
		System.out.println("Connect Database");
		System.out.println("Call API to create test data");
	}

	@Test(groups = "chirag")
	public void verifyLoginSuccessfulWithValidCred() {
		System.out.println("User Open website");
		System.out.println("Click on login link");
		System.out.println("Enter valid credential");
		System.out.println("Verify login successful");
	}

	@Test(groups = "Inna")
	public void verifyLoginUnSuccessfulWithInValidCred() {
		System.out.println("User Open website");
		System.out.println("Click on login link");
		System.out.println("Enter Invalid credential");
		System.out.println("Verify login failed");
	}

	@AfterMethod
	public void cleanUp() {
		System.out.println("quit driver");
		System.out.println("disconnect Database");
		System.out.println("erase data");
	}

}
