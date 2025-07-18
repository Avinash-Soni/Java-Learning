import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value Of a : ");
        float a = input.nextFloat();
        System.out.print("Enter Operator (+,-,/,X) : ");
        String operator = input.next();
        System.out.print("Enter Value Of b : ");
        float b = input.nextFloat();

        switch (operator) {
            case "+":
                System.out.println("Result: " + (a + b));
                break;
            case "-":
                System.out.println("Result: " + (a - b));
                break;
            case "X":
            case "x":
            case "*":
                System.out.println("Result: " + (a * b));
                break;
            case "/":
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }

        input.close();
    }
}
