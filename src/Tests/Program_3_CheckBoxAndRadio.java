package Tests;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program_3_CheckBoxAndRadio {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\personal\\Automation\\udemy\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.spicejet.com");
		WebElement CurrencySelectDropdwon= driver.findElement(By.xpath("//select[contains(@name,'Currency')]"));
		
		Select select = new Select(CurrencySelectDropdwon);
		select.selectByVisibleText("INR");
		driver.findElement(By.xpath("(//input[contains(@id,'originStation1')])[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Goa')]")).click();
	}

}
