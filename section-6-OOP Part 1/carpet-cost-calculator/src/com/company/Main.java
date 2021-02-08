package com.company;

public class Main {

    public static void main(String[] args) {
	Floor myFloor = new Floor(5,5);
    Carpet myCarpet = new Carpet(2);
	System.out.println(myFloor.getArea());
        System.out.println(myCarpet.getCost());
//	double myArea = (myFloor.getArea());  // Useless as the  method get cost area will get the double thks to the instance method in the class floor
//	double myCost = myCarpet.getCost(); // idem

	Calculator myCalculator = new Calculator(myFloor, myCarpet);
        System.out.println(myCalculator.getTotalCost());
    }
}
