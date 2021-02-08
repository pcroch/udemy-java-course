package com.company;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        if (cost <= 0){
            return 0;
        }else{
            return cost;
        }
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
