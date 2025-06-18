import java.util.Scanner;
public class SwapNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value of a : ");
        int a = input.nextInt();
        System.out.print("Enter Value of b : ");
        int b = input.nextInt();
        System.out.println("Value of a = "+a+" b = "+b);


        System.out.println("After Swap");
        //without using third variable
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a = "+a+" b = "+b);

    }
}
