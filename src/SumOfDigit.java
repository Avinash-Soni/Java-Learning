import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = input.nextInt();

        System.out.println("Sum of digit is : "+digitSum(num));
    }
    public static int digitSum(int a){
        int sum = 0;
        while (a>0){
            sum += a%10;
            a /=10;
        }
       return sum;

    }
}
