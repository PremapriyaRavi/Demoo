package org.testcases;

import org.report.FBWithPojo;
import org.report.ProjectMethods;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginAndLogOut extends ProjectMethods {
	@BeforeTest
	public void setDetails() {
		testName = "LoginFB";
		testDesc = "FaceBook login with invalid data";
		testAuthor = "Prema";
		testCategory = "Smoke";
	}
	@Test(dataProvider="fetchData")
	public void loginlogout(String s1,String s2) {
		FBWithPojo f=new FBWithPojo();
		insert(f.getEmail(),s1);
		insert(f.getPass(), s2);
		click(f.getLogin());
	}
}
