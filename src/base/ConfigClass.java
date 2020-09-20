package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;


public class ConfigClass {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void browserOn() {

		//SETTING driver property
		System.setProperty("webdriver.chrome.driver", "/Users/a.uzzaman/eclipse-workspace/PageObjectModelFramework/Drivers/chromedriver");
		//Open Browser
		driver =new ChromeDriver();
		//		  Go to the web site
		driver.get("http://automationpractice.com/index.php");
		//		  Maximize screen size
		driver.manage().window().maximize(); 

	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}


}
