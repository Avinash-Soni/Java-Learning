import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int in ;
        System.out.println("Welcome to the Number Guessing Game!");

        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Guess a number between 0 and 9 : ");
            in = input.nextInt();
        }while (!guessing(in));
    }

    public static boolean guessing(int in) {
        int num = (int) (Math.random()*10);
        if (in == num ) {
            System.out.println("You are the winner!");
            return true;
        } else {
            System.out.println("Wrong guess. Try again!");
            System.out.println("Number was : "+num);
            return false;
        }
    }
}
