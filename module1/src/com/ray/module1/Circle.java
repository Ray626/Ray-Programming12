package com.ray.module1;

public class Circle extends TwoDShape{
    public final double PI = Math.PI;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.pow(radius,2) * PI;
    }

    public String toString(){
        return "Circle: radius " + radius + ". This circle's area are " + getArea();
    }

}
