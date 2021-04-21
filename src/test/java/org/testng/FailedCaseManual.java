package org.testng;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FailedCaseManual {
	@Test
	private void test1() {
		System.out.println("hello");
	}
	@Test
	private void test2() {
		Assert.assertTrue(true);
		System.out.println(true);
		SoftAssert s=new SoftAssert();
		s.assertEquals("Priya","priya");
		System.out.println("hello");
		s.assertAll();
	}
}