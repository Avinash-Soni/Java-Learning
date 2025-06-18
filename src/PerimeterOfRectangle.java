import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter all side of rectangle : ");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        float d = input.nextFloat();

        System.out.println("Perimeter of Rectangle : "+(a+b+c+d));
    }
}
