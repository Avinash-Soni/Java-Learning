package com.example.geometry;

import java.util.Scanner;

public class Circle {
    public float rad;
    public void takeradius() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of Circle : ");
        rad = input.nextFloat();
    }
}
