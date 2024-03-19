package l21_junit;

import org.junit.jupiter.api.*;

public class OrderExampleTest {
    int expected;
    static int expected2;

    @BeforeAll
    public static void setUpClass() {
        System.out.println("setUpClass()");
        expected2 = 5;
    }

    @BeforeEach
    public void setUp() {
        System.out.println("setUpC()");
        this.expected = 5;
    }

    @Test
    public void testX() {
        System.out.println("testX()");
        int value = 2 + 2;
        int expected = 4;
        Assertions.assertEquals(expected, value, "Ложь - это правда");
    }

    @Test
    public void testY() {
        System.out.println("testY()");
    }

    @Test
    public void testZ() {
        System.out.println("testZ)");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("tearDown()");
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("tearDownClass()");
    }
}