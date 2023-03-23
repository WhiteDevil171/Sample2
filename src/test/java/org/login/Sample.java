package org.login;

import org.testng.annotations.Test;

public class Sample {
	
	@Test(priority=2, invocationCount=5)
	private void tc1() {
		System.out.println("TC1");

	}
	@Test(priority=3)
	private void tc2() {
		System.out.println("TC2");

	}
	@Test(priority=1, enabled=false)
	private void tc3() {
		System.out.println("TC3");

	}

}
