package com.benjaminbroad;

public class Main {

    public static void main(String[] args) {
        // Width of 32 (4 bytes)
        int myIntValue = 5 / 3;
        // Width of 32
        float myFloatValue = 5f / 3f;
        // Width of 64
        double myDoubleValue = 5d / 3d;

        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);


        int pounds = 170;
        double conversion = 0.45359237d;
        double weightInKilograms = pounds * conversion;
        System.out.println(weightInKilograms);

    }
}
