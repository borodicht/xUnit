package junit5;

import org.junit.jupiter.api.*;

public class Junit5ExampleBaseTest extends Junit5BaseTest {

    /**
     * BEFORE ALL ИЗ РОДИТЕЛЯ
     * BEFORE ALL ИЗ НАСЛЕДНИКА
     * BEFORE EACH ИЗ РОДИТЕЛЯ
     * BEFORE EACH ИЗ НАСЛЕДНИКА
     * METHOD
     * AFTER EACH ИЗ НАСЛЕДНИКА
     * AFTER EACH из РОДИТЕЛЯ
     * AFTER ALL ИЗ НАСЛЕДНИКА
     * AFTER ALL ИЗ РОДИТЕЛЯ
     */

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After all");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before each test");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(1)
    public void test1() {
        System.out.println("Test 1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(2)
    public void test2() {
        System.out.println("Test 2");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(3)
    public void test3() {
        System.out.println("Test 3");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After each test");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
