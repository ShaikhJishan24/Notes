package mypack3;

import org.junit.runner.RunWith;

import org.junit.runners.Suite;


@RunWith(Suite.class) // target class
@Suite.SuiteClasses({ TestTarget1.class, TestTarget2.class })
public class JUnitTestSuite {
}
