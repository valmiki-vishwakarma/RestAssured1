package Stripe;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Testing1 {

	@AfterMethod
	public void loginTest(ITestResult m) {
		System.out.println(m.getName()+" Test is Passed");
		
	}

	@Test
	public void login() {
		System.out.println("238283");
		
	}

}
