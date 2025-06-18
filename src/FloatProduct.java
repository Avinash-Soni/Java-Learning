import java.util.Scanner;

public class FloatProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first float value : ");
        float a = input.nextFloat();
        System.out.print("Enter second float value : ");
        float b = input.nextFloat();

        System.out.println("Product of float value : "+(a*b));
    }
}
