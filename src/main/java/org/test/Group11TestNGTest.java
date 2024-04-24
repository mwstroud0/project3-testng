package org.test;
import org.testng.Assert;
import org.testng.annotations.*;


public class Group11TestNGTest {

    Group11DemoCode demoCode = new Group11DemoCode();

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    // ------------------------------
    // BEFORE and AFTER TESTS
    // ------------------------------

    @BeforeSuite
    public void setUp() {System.out.println(ANSI_PURPLE + "BeforeSuite - Runs once at the beginning of the test suite." + ANSI_RESET);}

    @AfterSuite
    public void tearDown() {System.out.println(ANSI_PURPLE + "AfterSuite - Runs once at the end of the test suite." + ANSI_RESET);}

    @BeforeMethod
    public void beforeTest() {
        System.out.println(ANSI_BLUE + "BeforeMethod - Runs before each test." + ANSI_RESET);
    }

    @AfterMethod
    public void afterTest() {
        System.out.println(ANSI_BLUE+ "AfterMethod - Runs after each test." + ANSI_RESET);
    }

    // ------------------------------
    // DATA PROVIDER
    // ------------------------------

    @DataProvider (name = "data")
    public Object[][] dp(){
        return new Object[][] {{"ONE"}, {"TWO"}, {"THREE"}};
    }

    // ------------------------------
    // TEST CASES
    // ------------------------------


    // PASSING
    @Test(priority = 1)
    public void checkStringEquals_PASS() {
        System.out.println(ANSI_GREEN + "Check that the strings are equal." + ANSI_RESET);
        String x = "testString";
        Assert.assertEquals(x,"testString");
    }

    @Test(priority = 1, invocationCount = 5,invocationTimeOut = 100) // IN MILLISECONDS
    public void reliableGetCount_PASS() {
        System.out.println(ANSI_GREEN + "Check that the count always initializes to 50." + ANSI_RESET);
        Assert.assertEquals(demoCode.getCount(),50);
    }

    @Test (priority = 1,dataProvider = "data")
    public void usingDataProvider_PASS (String val) {
        System.out.println(ANSI_GREEN + "USING DATA PROVIDER: " + ANSI_RESET);
        System.out.println("Parameters are : " + val);
    }
    // --------------------------------------------------------------------------------------------------
    // FAILING

    @Test(priority = 2,timeOut= 10) // IN MILLISECONDS
    public void longRuntime_FAIL() {
        System.out.println(ANSI_RED + "FAIL long runtime" + ANSI_RESET);
        Assert.assertNotEquals(Group11DemoCode.longRuntime(1),2);
    }

    @Test(priority = 2) // IN MILLISECONDS
    public void reliableGetCount_FAIL() {
        System.out.println(ANSI_GREEN + "Incrementing the count to 51." + ANSI_RESET);
        demoCode.incrementCount();
        Assert.assertEquals(demoCode.getCount(),50);
    }

    @Test(priority = 2)
    public void checkStringNotEquals_FAIL() {
        System.out.println(ANSI_RED + "Check that the strings are NOT equal." + ANSI_RESET);
        String x = "incorrectString";
        Assert.assertEquals(x,"testString");
    }

    // --------------------------------------------------------------------------------------------------
    // DISABLING TESTS

    @Test(enabled = false)
    public void disabledTest() {
        System.out.println(ANSI_RED + "THIS TEXT SHOULD NOT BE SEEN" + ANSI_RESET);
    }
}

