package org.testng;

public class Sample extends HelperClass{
public static void main(String[] args) {
	launchBrowser();
	launchUrl("https://www.facebook.com/");
	maximizeWindow();
	System.out.println(getTitle());
	getCurrentUrl();
	FBWithPojo f=new FBWithPojo();
//	f.getEmail().sendKeys("User@123");
//	f.getPass().sendKeys("Qwerty");	
	insert(f.getEmail(), "User@123");
	insert(f.getPass(),"Qwerty");
	click(f.getLogin());
	close();
}
}
