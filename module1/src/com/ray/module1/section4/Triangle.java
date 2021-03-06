package com.ray.module1.section4;


import java.util.Locale;

public class Triangle extends TwoDShape implements Rotate {
    private double side1;
    private double side2;
    private double side3;
    private Colour colour;
    private boolean check = true;

    /**
     * Constructor of the Triangle
     * @param width > 0
     * @param height > 0
     * @param colour Colour object
     */
    public Triangle(double width, double height, Colour colour) {
        super(width, height,colour);
        check = false;

    }

    /**
     * Constructor of the triangle, the sum of two sides must be greater than
     * the third side
     * @param side1 > 0
     * @param side2 > 0
     * @param side3 > 0
     */
    public Triangle(double side1, double side2, double side3, Colour colour) {

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.colour = colour;
        setHeight(getHeronsHeight());
        setWidth(side1);
    }

    /**
     * The method calculates the height of the triangle
     * @return The Height returns is the height of the side 1
     */
    private double getHeronsHeight(){
        double area = getArea();
        return area * 2 / side1;
    }
    /**
     * get the area of the triangle
     * @return area
     */
    @Override
    public double getArea(){
        if (check){
            double s = (side1 + side2 + side3)/2;
            return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        }else {
            return getWidth()*getHeight()/2;
        }

    }

    /**
     * test version of get heron's height
     * @return heron's height
     */
    public double testGetHeronsHeight(){
        return getHeight();
    }

    /**
     *  Return the String description of this triangle.
     * @return string description
     */
    public String toString(){
        if(check){
            return "Triangle: " + side1 +"x" +side2 + "x" + side3 +". The area of this triangle are " + getArea() + "Colour: " + colour.toString().toLowerCase(Locale.ROOT) ;

        }else {
            return "Triangle has width: " + getWidth() + " and height: " + getHeight() + ". The area of this triangle are " + getArea();
        }
    }

    /**
     * rotate triangle 90 degrees
     */
    @Override
    public void rotate90() {

    }

    /**
     * rotate triangle 180 degrees
     */
    @Override
    public void rotate180() {

    }

    /**
     * retate triangle the input degrees
     * @param degree equals all real numbers
     */
    @Override
    public void rotate(double degree) {

    }
}
