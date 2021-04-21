package org.testng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class FailedWithTrasformer implements IAnnotationTransformer{

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		IRetryAnalyzer result = annotation.getRetryAnalyzer();
		if(result== null) {
			annotation.setRetryAnalyzer(FailedWithIRetry.class);
		}
		
	}

}
