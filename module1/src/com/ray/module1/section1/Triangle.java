package com.ray.module1.section1;

public class Triangle extends TwoDShape {
    private double side1;
    private double side2;
    private double side3;
    /**
     * Constructor of the Triangle
     * @param width  > 0
     * @param height > 0
     */
    public Triangle(double width, double height) {
        super(width, height);

    }
    /**
     * Constructor of the triangle
     * @param side1 > 0
     * @param side2 > 0
     * @param side3 > 0
     */
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
    private double getHeronsHeight() {
        double area = getArea();
        return area * 2 / side1;
    }
    /**
     * get the area of the triangle
     * @return area
     */
    @Override
    public double getArea() {
        if (side1 != 0) {
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        } else {
            return super.getArea();
        }
    }
}

