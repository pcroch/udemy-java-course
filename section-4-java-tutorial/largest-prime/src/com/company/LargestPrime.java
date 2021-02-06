package com.company;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(-2));
        System.out.println(getLargestPrime(100));
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(30));
    }

    private static int getLargestPrime(int number) {
        if (number <= 0){
            return -1;
        }
        int i = 2;
        while (number > 1)
            if (number % i == 0) {
                number = number / i;
            } else {
                i ++;
            }
        return i;
    }
}
