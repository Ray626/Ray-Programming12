package com.ray.module1.section1;

public class TwoDShape {
    private double width;
    private double height;
    /**
     * Constructor of the TwoDShape
     * @param width > 0
     * @param height > 0
     */
    public TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;
    }
    /**
     * Default constructor of TwoDShape
     */
    public TwoDShape() {
        this.width = 0;
        this.height = 0;

    }
    /**
     * Get the area of the 2D shape
     * @return area
     */
    public double getArea(){
        return width *height / 2;
    }

    /**
     * Set the height of the 2D shape
     * @param height  > 0
     */
    public void setHeight(double height) {
        this.height = height;
    }

}
