import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Year : ");
        int Year = input.nextInt();

        if(Year%400 == 0 || (Year%4 == 0 && Year%100 != 0)){
            System.out.println("It is a Leap Year");
        } else {
            System.out.println("It is not a Leap Year");
        }
    }
}
