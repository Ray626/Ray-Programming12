package com.ray.module1.section4;


public class Circle extends TwoDShape {
    public final double PI = Math.PI;
    private double radius;
    private Colour colour;

    /**
     * The constructor of the Circle
     * @param radius > 0
     */
    public Circle(double radius,Colour colour) {
        this.radius = radius;
        this.colour = colour;

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
