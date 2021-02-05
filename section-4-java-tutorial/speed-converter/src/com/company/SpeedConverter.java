package com.company;


public class SpeedConverter {

    public static void main(String[] args) {
        toMilesPerHour(15);
        toMilesPerHour(-2);
    }

    public static void toMilesPerHour(double kilometersPerHour) {

        if(kilometersPerHour < 0) {
            System.out.println(-1);
//            return "-1";
        } else {
        long milesPerHour = Math.round(kilometersPerHour / 1.609);
        System.out.println(milesPerHour);
//
    }}

}
// Why not working with return ???