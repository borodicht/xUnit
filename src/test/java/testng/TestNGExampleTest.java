package testng;

import org.testng.annotations.*;

public class TestNGExampleTest {

    @BeforeClass(groups = {"Писал Юра", "slow"})
    public void beforeClass() {
        System.out.println("Before class");
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @BeforeTest(groups = {"Писал Юра", "slow"})
    public void beforeTest() {
        System.out.println("Before Test");
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @BeforeMethod(groups = {"Писал Юра", "slow"})
    public void beforeMethod() {
        System.out.println("Before Method");
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(retryAnalyzer = Retry.class, description = "description", enabled = false, timeOut = 2, groups = {"Писал Юра", "slow"})
    public void test2() {

    }

    @Test(description = "description", enabled = false, timeOut = 2, groups = {"Писал Юра", "slow"})
    public void test3() {

    }

    @Parameters({"email", "password"})
    @Test(groups = {"slow"})
    public void test4(@Optional("1")
                          String p1,
                      @Optional("string")
                          String p2) {
        System.out.println(p1 + " " + p2);
    }

    @Test(dataProvider = "asd")
    public void test5(String email, String password, boolean validLogin) {
        System.out.println("Instance DataProvider Example: Data(" + email + ", " + password + " " + validLogin + ")");

    }

    @DataProvider
    public Object[][] asd() {
        return new Object[][]{
                {"email1@mailinator.com", "password01", true},
                {"email2@mailinator.com", "password01", false},
                {"email3@mailinator.com", "password01", false}
        };
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After test");
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After method");
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before suite");
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite");
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @BeforeGroups(groups = "slow")
    public void beforeGroups() {
        System.out.println("Before groups");
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterGroups(groups = "slow")
    public void afterGroups() {
        System.out.println("After groups");
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
