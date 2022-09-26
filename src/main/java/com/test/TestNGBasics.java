package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	//pre-conditions annotations - starting with@Before
	
	@BeforeSuite
	public void setUP() {
		System.out.println("@BeforeSuite----setup system property for chrome");
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("@BeforeTest----launch the browser");
	}
	
	@BeforeClass
	public void login() {
		System.out.println("@BeforeClass-----login to app");
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("@BeforeMethod----enter URL");
	}
	
	
	
	//test cases - starting with @Test
	@Test
	public void googleTitleTest() {
		System.out.println("@Test-----Google Title Test");
	}
	
	@Test
	public void searchTest() {
		System.out.println("@Test-----search test");
	}
	
	@Test
	public void googleLogoTest() {
		System.out.println("@Test------google logo test");
	}
	
	//post-condition - starting with @After
	@AfterMethod
	public void logOut() {
		System.out.println("@AfterMethod-----logout from app");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("@AfterClass-----close browser");
	}
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("@AfterTest------deleteAllCookies");
	}
	
	
		

}

