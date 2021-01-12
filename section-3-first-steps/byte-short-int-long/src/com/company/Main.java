package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 1000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        /*Overflow*/
        System.out.println("Busted Max value = " + (myMaxIntValue + 1));
        /*Underflow*/
        System.out.println("Busted Min value = " + (myMinIntValue - 1));
        /*Number too large if adding 1*/
        int myMqxIntTest = 2_147_483_647;
    }
}
