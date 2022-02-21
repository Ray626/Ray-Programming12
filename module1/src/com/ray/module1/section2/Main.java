package com.ray.module1.section2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<TwoDShape> shapes = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            if ((i % 2) == 0){
                Triangle triangle = new Triangle(i+2,i+3,i+4);
                System.out.println(triangle.getArea());
                System.out.println(triangle);
                shapes.add(triangle);
            }else {
                Circle circle = new Circle(i+1);
                System.out.println(circle.getArea());
                System.out.println(circle);
                shapes.add(circle);
            }
        }
    }
}
