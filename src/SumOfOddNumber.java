import java.util.Scanner;

public class SumOfOddNumber {
    public static void main(String[] args) {
        int first = getNumber();
        int second = getNumber();
        sumOfOdd(first,second);

    }

    public static int getNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        return input.nextInt();
    }

    public static void sumOfOdd(int first, int second) {
        int sum = 0;
        for (int i = first; i <= second; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Sum of Odd number between "+first+" to "+second+" is "+sum);
    }

}
