import java.util.Scanner;

public class EvenOddByTernary {
    public static void EvenOdd(int number){
        String n;
              n  = (number % 2 == 0) ? "Number is Even":"Number is Odd";
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        EvenOdd(number);
    }
}
