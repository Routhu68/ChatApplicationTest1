package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageTest {
	
	WebDriver driver;
	
	@Test
	public void ValidateHomePage() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://13.218.153.64:8088/");
		driver.manage().window().maximize();
		
		String Header = driver.findElement(By.tagName("h1")).getText();
		AssertJUnit.assertEquals(Header, "Type your Name Here");
			
	}
	
	@AfterMethod
	public void AfterTest() {
		driver.quit();
	}

}
