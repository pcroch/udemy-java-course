package com.company;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }


    public double getFirstNumber(){
        return this.firstNumber;
    }

    public double getSecondNumber(){
        return this.secondNumber;
    }

    public double getAdditionResult(){
        double addition =  this.secondNumber + this.firstNumber;
        return addition;
    }

    public double getMultiplicationResult(){
        double multiplication =  this.secondNumber * this.firstNumber;
        return multiplication;
    }

    public double getDivisiontResult(){
        if (this.secondNumber == 0) {
            return 0;
        } else {
            double division = this.firstNumber / this.secondNumber;
            return division;
        }
    }
}
