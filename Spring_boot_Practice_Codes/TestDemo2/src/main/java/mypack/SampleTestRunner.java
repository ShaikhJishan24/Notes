package mypack;

import org.apache.log4j.Logger;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class SampleTestRunner {
	
	private static Logger logger = Logger.getLogger(SampleTestRunner.class);

	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(SampleTest.class); // it allows you to run the Test classess
		for (Failure failure : result.getFailures()) {
			logger.error(failure.toString());

		}
		if (result.wasSuccessful())
			logger.info("it was successful");
	}

}

// it is a class that Going to test the Sample class using sampleTest  