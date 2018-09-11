package Tests;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Program_5_JavascriptAlert {
	static WebDriver driver;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\personal\\Automation\\udemy\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.seleniumeasy.com/test/");
		driver.findElement(By.id("btn_basic_example")).click();;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Radio Buttons Demo' and @class='list-group-item']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Radio Buttons Demo' and @class='list-group-item']")));
		wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//a[text()='Radio Buttons Demo' and @class='list-group-item']"))));
		
		WebElement el = driver.findElement(By.xpath("//a[text()='Radio Buttons Demo' and @class='list-group-item']"));
		el.click();
	
//		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Radio Buttons Demo' and @class='list-group-item']")).isDisplayed());
		//Assert.assertTrue(condition);(driver.findElement(By.xpath("//a[text()='Radio Buttons Demo' and @class='list-group-item']"))
		
		int count = driver.findElements(By.xpath("//input[@type='radio' and @name='optradio']")).size();
		
		for(int i = 0; i < count;i++)
		{
			driver.findElements(By.xpath("//input[@type='radio' and @name='optradio']")).get(i).click();
		}
	}

}
