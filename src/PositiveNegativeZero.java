import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please,Enter a number : ");
        float num = input.nextFloat();

        if (num < 0){
            System.out.println("Input number is Negative");
        } else if (num > 0) {
            System.out.println("Input number is Positive");
        }else {
            System.out.println("Input number is Zero");
        }
    }
}
