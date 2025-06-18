import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of Base : ");
        float base = input.nextFloat();
        System.out.print("Enter height of triangle : ");
        float height = input.nextFloat();

        System.out.println("Area of triangle : "+((base*height)/2));
    }
}
