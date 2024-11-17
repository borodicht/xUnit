package testng;

import org.testng.annotations.Test;

public class TestNGExampleTest3 extends BaseTest {

    @Test (retryAnalyzer = Retry.class)
    public void initializationTest() {
        System.out.println("Initialization completed successfully.");
        assert true;
    }

    @Test(dependsOnMethods = {"initializationTest"})
    public void dependentTest() {
        System.out.println("Executing dependent test after initialization.");
        assert true;
    }

    @Test(expectedExceptions = ArithmeticException.class, invocationCount = 4, threadPoolSize = 2)
    public void testDivisionByZero() {
        System.out.println("Testing division by zero.");
        int result = 10 / 0;
    }
}
