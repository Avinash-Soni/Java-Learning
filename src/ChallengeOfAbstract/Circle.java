package ChallengeOfAbstract;

import java.util.Scanner;

public class Circle extends Shape {

    static float rad ;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
        Circle.rad = input.nextFloat();
        Circle obj = new Circle();
        double area = obj.shapeArea();
        System.out.println("Area of Circle is : "+area);

    }

    @Override
    public double shapeArea() {
        return Math.PI*Math.pow(rad,2);
    }
}
