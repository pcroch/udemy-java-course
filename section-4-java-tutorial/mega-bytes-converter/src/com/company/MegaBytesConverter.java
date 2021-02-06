package com.company;

public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(10995);
        printMegaBytesAndKiloBytes(1024);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megabytes = (kiloBytes/1024);
        int remaining = (kiloBytes%1024);
        System.out.println( megabytes+" = "+megabytes+"MB and "+remaining+"KB" );
//        System.out.println(megabytes);
    }

}

