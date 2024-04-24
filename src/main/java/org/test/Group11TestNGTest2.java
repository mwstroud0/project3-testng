package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Group11TestNGTest2 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";

    @Test(priority = 3)
    public void checkStringEquals_PASS() {
        System.out.println(ANSI_GREEN + "TEST CLASS 2: Check that the strings are equal." + ANSI_RESET);
        String x = "testString";
        Assert.assertEquals(x,"testString");
    }
}
