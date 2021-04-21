package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Sample_Facebook extends HelperClass {
public static void main(String[] args) {
	launchBrowser();
	launchUrl("https://www.facebook.com/");
	maximizeWindow();
	System.out.println(getTitle());
	getCurrentUrl();
	WebElement txtEmail = driver.findElement(By.id("email"));	
	txtEmail.sendKeys("User@123");
	WebElement txtPass = driver.findElement(By.id("pass"));
	txtPass.sendKeys("Qwerty&1");
	close();
}
}