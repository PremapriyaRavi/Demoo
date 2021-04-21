package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(FailedShot.class)
public class TKforFB extends HelperClass{
	@Test
	private void test(){
		launchBrowser();
		launchUrl("https://www.facebook.com/");
		maximizeWindow();
		System.out.println(getTitle());
		getCurrentUrl();
		WebElement txtEmail = driver.findElement(By.id("email"));	
		txtEmail.sendKeys("User@123");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("Qwerty&1");
		Assert.assertTrue(false);
	}
}
