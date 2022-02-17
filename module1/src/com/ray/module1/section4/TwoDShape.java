package com.ray.module1.section4;


public abstract class TwoDShape {
    private double width;
    private double height;
    private Colour colour;

    /**
     * Constructor of the TwoDShape
     * @param width > 0
     * @param height > 0
     * @param colour Colour object
     */
    public TwoDShape(double width, double height, Colour colour) {
        this.width = width;
        this.height = height;
        this.colour = colour;

    }

    /**
     * Default constructor of TwoDShape
     */
    public TwoDShape() {
        this.width = 0;
        this.height = 0;
        this.colour = Colour.NONE;
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

    /**
     * Get the Width of the 2D shape
     * @return width
     */
    public double getWidth() {
        return width;
    }
    /**
     * Set the Width of the 2D shape
     * @param  width > 0
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Get the height of the 2D shape
     * @return height
     */
    public double getHeight() {
        return height;
    }

}
