package com.company;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(4,5));
        System.out.println(area(4,-1.0));
        System.out.println(area(-1));
    }

        private static String area ( double radius){
            if (radius < 0) {
                return "-1";
            } else {
                return "area";
            }
        }

    private static String area ( double x, double y ) {
        if ((x < 0) || (y < 0)) {
            return "-1";
        } else {
            double r = x*y;
//            return "area rectangle";
            return area (r);
        }

    }
}