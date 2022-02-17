package com.ray.module1.section3;



public class Circle extends TwoDShape {
    public final double PI = Math.PI;
    private double radius;

    /**
     * The constructor of the Circle
     * @param radius > 0
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Get the area of the circle
     * @return area
     */
    @Override
    public double getArea(){
        return Math.pow(radius,2) * PI;
    }

    /**
     * Return the string description of this circle
     * @return string description
     */
    public String toString(){
        return "Circle: radius " + radius + ". This circle's area are " + getArea();
    }

}
