package com.example.utils;

import com.example.geometry.*;

public class Calculator {
    Circle obj = new Circle();
    Rectangle obj2 = new Rectangle();

    public void circleArea() {
        double area = Math.PI*Math.pow(obj.rad,2);
        System.out.println("Area of rectangle : "+area);
    }
    public void rectangleArea() {
        double area = obj2.length*obj2.width;
        System.out.println("Area of rectangle : "+area);
    }

    public static void main(String[] args) {
        Calculator obj3 = new Calculator();

        obj3.obj.takeradius();
        obj3.circleArea();
        obj3.obj2.takesize();
        obj3.rectangleArea();
    }
}
