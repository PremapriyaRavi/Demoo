package org.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelperClass{
	 public static WebDriver driver;
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Maven_ExtraTask\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	}
	public static void launchUrl(String s) {
		driver.get(s);
	}
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	public static void getCurrentUrl() {
		String url= driver.getCurrentUrl();
		System.out.println(url);
	}
	public static void close() {
		driver.close();	
	}
	public static void insert(WebElement e,String s) {
		e.sendKeys(s);
	}
public static void click(WebElement e) {
	e.click();
}
}
