package testng;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class TestngTest extends BaseTest {

    @BeforeSuite
    public void test5() {
        System.out.println("BEFORE SUITE");
    }

    @BeforeGroups
    public void test4() {
        System.out.println("BEFORE GROUPS");
    }

    @BeforeTest
    public void test3() {
        System.out.println("BEFORE TEST");
    }

    @BeforeClass
    public void test2() {
        System.out.println("BEFORE CLASS");
    }

    @BeforeClass
    public void test1() {
        System.out.println("BEFORE METHOD");
    }

    @Test
    public void test() {
        System.out.println("TEST");
    }


    public String lesson1(double number) {
        if (number % 15 == 0) {
            return "TMS";
        } else if (number % 3 == 0) {
            return "T";
        } else if (number % 5 == 0) {
            return "M";
        } else {
            return "WTF????";
        }
    }

    @DataProvider(name = "Входящие данные для задачки lesson1")
    public Object[][] inputForITechTask() {
        return new Object[][]{
                {3, "T"},
                {5, "M"},
                {15, "TMS"},
                {6, "T"},
                {10, "M"},
                {30, "TMS"},
                {1, "WTF????"},
                {-1, "WTF????"},
                {1000000000, "M"},
                {3.3, "WTF????"}
        };
    }

    @Test(dataProvider = "Входящие данные для задачки lesson1")
    public void test123(double number, String expectedString) {
        String result = lesson1(number);
        assertEquals(result, expectedString);
    }
}
