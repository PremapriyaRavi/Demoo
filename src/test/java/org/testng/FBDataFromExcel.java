package org.testng;

import org.testng.annotations.Test;

public class FBDataFromExcel extends HelperClass{
	@Test(dataProvider="rep",dataProviderClass=ExcelBaseClassWithDP.class)
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