import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = input.nextInt();

        int reverse = 0;
        int temp = num;

        while(temp!=0){
            int digit = temp%10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        if(reverse == num){
            System.out.println("Number is Palindrome");
        }else {
            System.out.println("Number is not Palindrome");
        }
    }
}
