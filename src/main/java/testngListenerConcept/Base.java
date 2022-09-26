package testngListenerConcept;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

public class Base {

	public static WebDriver driver;
	
	public static void initialization() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		driver = new ChromeDriver();

		
		driver.get("https://www.google.com");

	
	}
	
	public void failed(String testMethodName){
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("C:\\Users\\patel\\eclipse-workspace\\TestNGProject\\ScreenShots\\"+testMethodName+"_"+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	}


