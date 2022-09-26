package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {

	//Hard Assertion: hard assertion validation: if a hard assertion is getting failed - immediately test case will be marked as failed and test case will be terminated.
	@Test
	public void test() {
		System.out.println("Open Browser");
		Assert.assertEquals(true,true);//hard assertion
		
		System.out.println("enter username");
		System.out.println("enter password");
		System.out.println("click on sign in button");

		Assert.assertEquals(true, true); //hard assertion
		System.out.println("validate home page");

		Assert.assertEquals(true, false);// hard assertion


		System.out.println("go to deals page");
		System.out.println("create a deal");
		
		System.out.println("go to contacts page");
		System.out.println("create a contact");

		
		
		
		
		
		
	}
}
