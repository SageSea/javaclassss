package com.example.specifier;

public class StaticVariable {

    public static void main(String[] args) {
        StaticExample.name = "Ram";

        StaticExample staticExample = new StaticExample();
        StaticExample.totalObject = StaticExample.totalObject + 1;
        staticExample.count = staticExample.count + 1;
        System.out.println("total object = " + staticExample.totalObject);
        System.out.println("count = " + staticExample.count);

        StaticExample staticExample1 = new StaticExample();
        StaticExample.totalObject = StaticExample.totalObject + 1;
        staticExample1.count = staticExample1.count + 1;
        System.out.println("total object = " + StaticExample.totalObject);
        System.out.println("count = " + staticExample1.count);

        StaticExample staticExample2 = new StaticExample();
        StaticExample.totalObject = StaticExample.totalObject + 1;
        staticExample2.count = staticExample2.count + 1;
        System.out.println("total object = " + StaticExample.totalObject);
        System.out.println("count = " + staticExample2.count);

        StaticExample.takeAverage();
        staticExample1.makeCount();

    }
}

class StaticExample{
    static String name;  //static(class) variable

    String type;     //instance(object) variable

    static int totalObject; // static variable

    int count;

    static {
        System.out.println("Hello this is static block....");
        totalObject = 0;
    }

    void makeCount(){    //instance method


    }

    static void takeAverage(){   //static method


    }



}

