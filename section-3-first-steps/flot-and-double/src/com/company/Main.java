package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        /*not good*/
   /*     float myFloatValue = (float)5.25;*/
        /*good*/
        float myFloatValue = 5 / 3;
        double muDoubleValue = 5.00 / 3.00;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("muDoubleValue = " + muDoubleValue);


        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms = " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}
