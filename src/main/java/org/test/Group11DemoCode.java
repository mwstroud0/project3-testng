package org.test;

// --------------------
// GROUP 11 DEMO CODE
// --------------------

public class Group11DemoCode {

    private int count = 50;

    public static int demoReturnSquare(int num){
        return num * num;
    }

    public static String demoMessage(String message){
        return "Hello, " + message;
    }

    public static int squareThreeTimes(int num){
        return demoReturnSquare(demoReturnSquare(demoReturnSquare(num)));
    }

    public static int longRuntime(int num){
        for(int i=0; i < 1000000000; i++){
            num++;
        }
        return 2;
    }

    public void incrementCount(){
        this.count++;
    }

    public int getCount(){
        return this.count;
    }
}
