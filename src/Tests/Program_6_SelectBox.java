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



public class Program_6_SelectBox {
	static WebDriver driver;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\personal\\Automation\\udemy\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://www.seleniumeasy.com/test/");
		driver.findElement(By.id("btn_basic_example")).click();;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Javascript Alerts' and @class='list-group-item']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Javascript Alerts' and @class='list-group-item']")));
		wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//a[text()='Javascript Alerts' and @class='list-group-item']"))));
	
		WebElement el = driver.findElement(By.xpath("//a[text()='Javascript Alerts' and @class='list-group-item']"));
		el.click();
		driver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
		driver.switchTo().alert().sendKeys("Anand");
		driver.switchTo().alert().accept();
//		driver.navigate().to(url);
//		driver.get(url);
		
	}

}
