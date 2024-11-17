package testng;

import org.testng.annotations.*;

import static org.testng.Assert.assertTrue;

public class TestNgExampleTest1 {

    @BeforeClass(description = "Pre condition")
    public void beforeClass() {
        System.out.println("Before all");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterClass(description = "Post condition")
    public void afterClass() {
        System.out.println("After all");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before each test");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 1, description = "Тест 1", testName = "We are testing something in test 1", retryAnalyzer = Retry.class)
    public void test1() {
        System.out.println("Test 1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 2, timeOut = 2000, testName = "We are testing something in test 2")
    public void test2() {
        System.out.println("Test 2");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 3, enabled = false, description = "We are testing something in test 3")
    public void test3() {
        System.out.println("Test 3");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 4, dataProvider = "numberProvider", testName = "Parameterized Test")
    public void parameterizedTest(int number) {
        System.out.println("Parameterized test with number: " + number);
        assertTrue(number > 0, "Number should be greater than 0");
    }

    @DataProvider(name = "numberProvider")
    public Object[][] numberProvider() {
        return new Object[][]{
                {1},
                {2},
                {3},
                {4},
                {5}
        };
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After each test");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
