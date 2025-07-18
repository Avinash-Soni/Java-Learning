package ChallengeOfAbstract;

import java.util.Scanner;

public class Square extends Shape{
    //now we are using getter and setter
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double shapeArea() {
        return Math.pow(side,2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side of square : ");
        float side = input.nextFloat();

        Square obj = new Square();
        obj.setSide(side);

        System.out.println("Side of Square = "+obj.getSide());
        System.out.println("Area of square = "+obj.shapeArea());
    }
}
