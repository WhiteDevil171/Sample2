package org.login;

import org.testng.annotations.*;
import org.testng.annotations.BeforeSuite;

public class Testng {
	
	
	@BeforeSuite
	private void tc0() {
		System.out.println("@BeforeSuite");

	}
	@BeforeTest
	private void tc1() {
		System.out.println("@BeforeTest");
		
	}
	@BeforeClass
	private void tc2() {
		System.out.println("@BeforeClass");

	}
	@BeforeMethod
	private void tc3() {
		System.out.println("@BeforeMethod");

	}
	@Test
	private void tc4() {
		System.out.println("@Test");

	}
	@AfterMethod
	private void tc5() {
		System.out.println("@AfterMethod");

	}
	@AfterClass
	private void tc6() {
		System.out.println("@AfterClass");

	}
	@AfterTest
	private void tc7() {
		System.out.println("@AfterTest");

	}
	@AfterSuite
	private void tc8() {
		System.out.println("@AfterSuite");

	}
	

}
