package com.company;
import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        System.out.println(inputThenPrintSumAndAverage());
    }
    public static String inputThenPrintSumAndAverage() {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int i = 0;
        int avg = 0;
        System.out.println("Enter an Integer");
            while(true) {
                boolean isAnInt = input.hasNextInt();
                if (isAnInt){
                    int num = input.nextInt();
                    i++;
                    sum += num;
                    avg = sum / i;
                } else {
                    break;
                }
                input.nextLine();
            }
            input.close();




        return "Sum is"+ sum + "AVG is "+ avg;

    }

}
