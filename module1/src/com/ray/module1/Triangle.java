package com.ray.module1;

public class Triangle extends TwoDShape implements Rotate{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double width, double height,Colour colour) {
        super(width, height,colour);

    }

    public Triangle(double side1, double side2, double side3) {

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setHeight(getHeronsHeight());
    }

    /**
     * The method calculates the height of the triangle
     * @return The Height returns is the height of the side 1
     */
    private double getHeronsHeight(){
        double area = getArea();
        return area * 2 / side1;
    }

    @Override
    public double getArea(){
        double s = (side1 + side2 + side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    public String toString(){
        return "Triangle: " + side1 +"x" +side2 + "x" + side3 +". The area of this triangle are " + getArea();
    }

    @Override
    public void rotate90() {

    }

    @Override
    public void rotate180() {

    }

    @Override
    public void rotate(double degree) {

    }
}
