package com.company;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = width;
        this.length = length;
    }



    public double getArea(){
        double area = width * length;
        return area;
    }

    public double getWidth() {
        if (width <= 0){
            return 0;
        }else{
            return width;
        }

    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        if (length <= 0){
            return 0;
        }else{
            return length;
        }
    }

    public void setLength(double length) {
        this.length = length;
    }
}