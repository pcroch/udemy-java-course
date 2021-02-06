package com.company;

public class BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp( false,  5);
    }

    public static void shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 && hourOfDay > 23) {
            barking = false;
            System.out.print(barking);
        } else if (hourOfDay < 8 && hourOfDay > 22) {
            barking = true;
            System.out.print(barking);
        } else {}
        barking = false;
        System.out.print(barking);
    }


}
