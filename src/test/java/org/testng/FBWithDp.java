package org.testng;

import org.testng.annotations.Test;

public class FBWithDp extends HelperClass{
	@Test(dataProvider="rep",dataProviderClass=DPExample.class)
   private void test(String s1,String s2) {
	launchBrowser();
	launchUrl("https://www.facebook.com/");
	maximizeWindow();
	FBWithPojo f=new FBWithPojo();
	insert(f.getEmail(),s1);
	insert(f.getPass(), s2);
	click(f.getLogin());
  }

}
