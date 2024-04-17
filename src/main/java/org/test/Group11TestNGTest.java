package org.test;
import org.testng.Assert;
import org.testng.annotations.*;

public class Group11TestNGTest {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    @BeforeSuite
    public void setUp() {
        System.out.println(ANSI_PURPLE + "BeforeSuite - Runs once at the beginning of the test suite." + ANSI_RESET);
    }

    @AfterSuite
    public void tearDown() {
        System.out.println(ANSI_PURPLE + "AfterSuite - Runs once at the end of the test suite." + ANSI_RESET);
    }

    @BeforeMethod
    public void beforeTest() {
        System.out.println(ANSI_YELLOW + "BeforeMethod - Runs before each test." + ANSI_RESET);
    }

    @AfterMethod
    public void afterTest() {
        System.out.println(ANSI_YELLOW + "AfterMethod - Runs after each test." + ANSI_RESET);
    }

    @Test()
    public void checkStringEquals() {
        System.out.println(ANSI_GREEN + "Check that the strings are equal." + ANSI_RESET);
        String x = "testString";
        Assert.assertEquals(x,"testString");
    }

    @Test()
    public void checkStringNotEquals() {
        System.out.println(ANSI_GREEN + "Check that the strings are NOT equal." + ANSI_RESET);
        String x = "testString";
        Assert.assertNotEquals(x,"incorrectString");
    }



}

