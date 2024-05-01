package org.test;

import java.util.concurrent.TimeUnit;

// --------------------
// GROUP 11 DEMO CODE
// --------------------

public class Group11DemoCode {

    private int count = 50;
    private String message = "Goodbye World";

    public static int longRuntime(int num) throws InterruptedException {
        System.out.println("LONG RUNTIME");
        TimeUnit.SECONDS.sleep(2);
        return num;
    }

    public int getCount(){
        return this.count;
    }

    public String getMessage(){
        return this.message;
    }
}
