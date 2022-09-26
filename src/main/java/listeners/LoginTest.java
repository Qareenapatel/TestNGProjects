package listeners;

import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Test
@Listeners(Listeners1.class)


public class LoginTest {
	
	
	public void loginByEmail()
	{
		System.out.println("Login by Email");
		AssertJUnit.assertEquals("Pavan", "Pavan");
	}
	
	public void loginByFacebook()
	{
		System.out.println("Login by Facebook");
		AssertJUnit.assertEquals("Pavan", "Kumar");
	}
	

}
