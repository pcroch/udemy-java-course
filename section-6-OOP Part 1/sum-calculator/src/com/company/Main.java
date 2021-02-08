package com.company;

public class Main {

    public static void main(String[] args) {
	SimpleCalculator myNumber = new SimpleCalculator();
	myNumber.setFirstNumber(1);
	myNumber.setSecondNumber(93);
		System.out.println(myNumber.getFirstNumber());
		System.out.println(myNumber.getDivisiontResult());
		System.out.println(myNumber.getAdditionResult());
    }
}
