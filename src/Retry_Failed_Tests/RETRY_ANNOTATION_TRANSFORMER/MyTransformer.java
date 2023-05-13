package Retry_Failed_Tests.RETRY_ANNOTATION_TRANSFORMER;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import Retry_Failed_Tests.RETRY_ANALYZER.RetryAnayzer;



public class MyTransformer implements IAnnotationTransformer {
	
	public void transform(ITestAnnotation annotation, Class testclass, Constructor testconstructor, Method testMethod)
	{
	
		annotation.setRetryAnalyzer(RetryAnayzer.class);
		
		
	}

}
