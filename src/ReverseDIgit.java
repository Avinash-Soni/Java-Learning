import java.util.Scanner;

public class ReverseDIgit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = input.nextInt();

        int reverse = 0;

        while(num!=0){
            int digit = num%10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number = " + reverse);
    }
}
