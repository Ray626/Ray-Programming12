package com.ray.module1;

public abstract class TwoDShape {
    private double width;
    private double height;
    private Colour colour;

    public TwoDShape(double width, double height,Colour colour) {
        this.width = width;
        this.height = height;
        this.colour = colour;

    }

    public TwoDShape() {
        this.width = 0;
        this.height = 0;
        this.colour = Colour.NONE;
    }
    public double getArea(){
        return width *height / 2;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

}
