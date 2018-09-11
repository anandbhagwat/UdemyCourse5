package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Program_2_Locaters {
	static WebDriver driver;
public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver", "D:\\personal\\Automation\\udemy\\chromedriver\\chromedriver.exe");
	//System.setProperty("webdriver.gecko.driver", "D:\\personal\\Automation\\udemy\\geckodriver\\geckodriver.exe");
	//FirefoxOptions options = new FirefoxOptions();
	//options.setCapability("marionette", false);
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.salesforce.com/");
	driver.findElement(By.xpath("//a[@class='dropdown-toggle disabled invocaTelLink' and @href='https://login.salesforce.com/']")).click();
	
	driver.findElement(By.cssSelector(".input.r4.wide.mb16.mt8.username")).sendKeys("123");;
	
	//driver.findElement(By.className("username")).sendKeys("123");;//compound class names not permitted
	//driver.findElement(By.className("username")).sendKeys("123");;//works
	
	
	
//	
//	DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//	capabilities.setCapability("marionette", false);
//	WebDriver driver = new FirefoxDriver(capabilities);
//	//WebDriver driver = new FirefoxDriver(options);
//	driver.get("https://www.salesforce.com/");
//	
}
}
