package org.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPExample {
	@DataProvider(name="rep")
	private String[][] data() {
		return new String[][] {{"pinky","Qwerty"},
			{"shobi","Qwerty"},
		};
	}
	@Test(dataProvider="rep")
	private void test(String s1,String s2) {
		System.out.println(s1);
		System.out.println(s2);
	}
}