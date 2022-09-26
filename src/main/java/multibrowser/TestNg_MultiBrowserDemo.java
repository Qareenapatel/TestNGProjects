package multibrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg_MultiBrowserDemo {

	WebDriver driver = null;

	@Parameters("browsername")
	@BeforeTest
	public void setup(String browsername) {
		System.out.println("Browser name is: " + browsername);
		System.out.println("Thread id: "+ Thread.currentThread().getId());

		if (browsername.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/Users/patel/Webdriver/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\patel\\eclipse-workspace\\SeleniumFirefoxProject\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("Browser has no value");
		}
	}	

	@Test
	public void test1() {
		driver.get("http://google.com");
	}

	@AfterTest
	public void teardown() {
		driver.quit();
		System.out.println("Test completed successfully");
	}

}
