import java.util.Scanner;

public class AreaAndCircumference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
        float rad = input.nextFloat();

        double area = (Math.PI*rad*rad);
        double circumference = 2*Math.PI*rad;

        System.out.printf("Area of circle is %f and circumference is %f",area,circumference);
    }
}
