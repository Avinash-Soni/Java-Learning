import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value of a : ");
        int a = input.nextInt();
        System.out.print("Enter Value of b : ");
        int b = input.nextInt();

        System.out.println("Sum of a and b = "+(a+b));
        System.out.println("Difference of a and b : "+(a-b));
        System.out.println("Multiplication of a and b : "+(a*b));
        System.out.println("Division of a and b : "+(a/b));
        System.out.println("Modulo of a and b : "+(a%b));
    }
}
