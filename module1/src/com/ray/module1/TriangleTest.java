package com.ray.module1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void getArea() {

        Triangle a = new Triangle(32,32,Colour.NONE);
        double result1 = (double)32*32/2;
        assertEquals(result1,a.getArea(),0);
        Triangle b = new Triangle(0.2,0.45,Colour.NONE);
        double result2 = (double)0.2*0.45/2;
        assertEquals(result2,b.getArea(),0);
        Triangle c = new Triangle(6,6,6);
        double result3 = Math.sqrt((double)9*(9-6)*(9-6)*(9-6));
        assertEquals(result3,c.getArea(),0);


    }
}