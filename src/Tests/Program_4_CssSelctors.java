package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program_4_CssSelctors {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\personal\\Automation\\udemy\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.rediff.com");
		//driver.findElement(By.xpath("//a[contains(@title,'Sign in')]")).click();;
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#login1")).sendKeys("Hii");;
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#passwordhghghhg")).sendKeys("password");;
		//Select select = new Select(element);
		//for class use .classanme in css and # for Id
		//Remember we cant traverse back i.e. we cant traverse back to parent element when you use css selector
	}

}
