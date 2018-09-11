package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_1 {
	static WebDriver driver;
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\personal\\Automation\\udemy\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.google.com");
	System.out.println("*********************Page Initiate**********************************");
	System.out.println("Page Title:"+driver.getTitle());
	System.out.println("Page Current URL: "+driver.getCurrentUrl());
	//System.out.println("Page Source: "+driver.getPageSource());
	System.out.println("Page gewindhandle: "+driver.getWindowHandle());
	System.out.println("Page hashcode : "+driver.hashCode());
	System.out.println("Page tostring: "+driver.toString());
	
	//System.out.println("Page Current URL: "+driver.equals(obj));
	
	//System.out.println("Page Current URL: "+driver.findElement(arg0));
	//System.out.println("Page Current URL: "+driver.findElements(arg0));
	System.out.println("Page getclass: "+driver.getClass());
	System.out.println("Page getwindowhandles: "+driver.getWindowHandles());
	System.out.println("Page manage: "+driver.manage());
	System.out.println("Page navigate: "+driver.navigate());
	System.out.println("Page switchto: "+driver.switchTo());
	
//	System.out.println("Page Current URL: "+driver.notify());
//	System.out.println("Page Current URL: "+driver.notifyAll());
//	System.out.println("Page Current URL: "+driver.wait());
//	System.out.println("Page Current URL: "+driver.wait(timeout));
//	System.out.println("Page Current URL: "+driver.wait(timeout, nanos));
//	System.out.println("Page Current URL: "+driver.close());
//	System.out.println("Page Current URL: "+driver.quit());
	
	System.out.println("*******************************************************");
	
	System.out.println("***********************Page back and forward********************************");
	driver.get("http://yahoo.com");
	driver.navigate().back();
	driver .navigate().forward();
	System.out.println("*******************************************************");
	
	
	
	
	
	
}
}
