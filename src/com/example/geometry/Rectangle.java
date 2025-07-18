package com.example.geometry;

import java.util.Scanner;

public class Rectangle {
    public float length;
    public float width;
        public void takesize() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter length of rectangle : ");
            length = input.nextFloat();
        System.out.print("Enter width of rectangle : ");
        width = input.nextFloat();
    }

}
