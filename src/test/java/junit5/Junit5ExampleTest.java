package junit5;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(CustomTestWatcher.class)
public class Junit5ExampleTest {

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
    @Tag("Smoke")
    @DisplayName("We are testing something in test 1")
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
    @Tag("Regression")
    @Timeout(2000)
    @DisplayName("We are testing something in test 2")
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
    @Tag("Regression")
    @Disabled
    @DisplayName("We are testing something in test 3")
    public void test3() {
        System.out.println("Test 3");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    @Order(4)
    @DisplayName("Parameterized test with numbers")
    public void parameterizedTest(int number) {
        System.out.println("Parameterized test with number: " + number);
        assertTrue(number > 0, "Number should be greater than 0");
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
