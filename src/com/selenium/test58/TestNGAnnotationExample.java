package com.selenium.test58;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationExample {

	@BeforeMethod
	public void setUp() {
		System.out.println("1. Create driver");
	}

	@Test(groups = { "smoke", "regression" })
	public void verifyLoginSuccessfulWithValidCred() {
		System.out.println("2. User Open website");
	}

	@Test(groups = "chirag")
	public void verifyLoginSuccessfulWithValidCred1() {
		System.out.println("5. User Open website");
	}

	@Test(groups = "Inna")
	public void verifyLoginUnSuccessfulWithInValidCred() {
		System.out.println("3. User Open website");
	}

	@AfterMethod
	public void cleanUp() {
		System.out.println("4. Clean up");
	}

}
