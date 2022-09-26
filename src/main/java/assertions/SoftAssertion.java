package assertions;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	//Soft assertion: Soft Validation: if a soft asssertion is getting failed - test case will not be marked as passed as well as next lines will be executed
	//asssertAll() - to mark the test case as failed if any soft assertion is getting failed

	@Test
	public void test1() {
		SoftAssert softAssert1 = new SoftAssert();
		System.out.println("Open Browser");
		Assert.assertEquals(true, true);// hard assertion

		System.out.println("enter username");
		System.out.println("enter password");
		System.out.println("click on sign in button");

		Assert.assertEquals(true, true); // hard assertion

		System.out.println("validate home page");
		softAssert1.assertEquals(true, false, "home page title is missing");// soft assertion

		System.out.println("go to deals page");
		System.out.println("create a deal");
		softAssert1.assertEquals(true, false, "not able to create a deal");// soft assertion

		System.out.println("go to contacts page");
		System.out.println("create a contact");
		softAssert1.assertEquals(true, false, "not able to create a contact");// soft assertion

		softAssert1.assertAll();

	}

	@Test
	public void test2() {
		SoftAssert softAssert2 = new SoftAssert();
		System.out.println("logout");
		softAssert2.assertEquals(true, true);
		softAssert2.assertAll();

	}
	
	@AfterClass
	public void tearDown() {
		
	}
}
