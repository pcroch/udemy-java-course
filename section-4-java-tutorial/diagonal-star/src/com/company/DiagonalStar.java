package com.company;

public class DiagonalStar {
    public static void main(String[] args) {
        System.out.println(printSquareStar(5));
        System.out.println(printSquareStar(2));
        System.out.println(printSquareStar(8));
    }
    private static String printSquareStar(int n) {
        if (n < 5){
            return "invalid input";
        }
//        i = row
//        j = col
        for(int i=1; i <= n; i ++ ) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || j == i
                        || j == n - i + 1 || j == n || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



//return x;
        return "end of process";
    }

}
