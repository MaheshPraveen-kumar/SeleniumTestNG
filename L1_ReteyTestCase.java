package TestNGLearning;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class L1_ReteyTestCase implements IRetryAnalyzer {
	
	int maxcount=3;
	int retryCount=0;
	
	@Override
	public boolean retry(ITestResult result)
	{
		if(!result.isSuccess()&& retryCount<maxcount)
		{
			retryCount++;
			return true;
			
		}
		return false;
	}

}
