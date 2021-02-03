package TestNGLearning;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class L3_IannotationRetry implements IAnnotationTransformer{
	
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {


		annotation.setRetryAnalyzer(TestNGLearning.L1_ReteyTestCase.class);
		
	}
	

}
