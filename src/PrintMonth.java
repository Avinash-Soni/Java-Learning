import java.util.Scanner;

public class PrintMonth {
    public static void main(String[] args) {
        int loop = 0;
        while (loop == 0) {
        Scanner input =  new Scanner(System.in);
            System.out.print("Enter any of the number : ");
            int month = input.nextInt();

            String monthname = switch (month) {
                case 1 -> "January";
                case 2 -> "February";
                case 3 -> "March";
                case 4 -> "April";
                case 5 -> "May";
                case 6 -> "June";
                case 7 -> "July";
                case 8 -> "August";
                case 9 -> "September";
                case 10 -> "October";
                case 11 -> "November";
                case 12 -> "December";
                default -> "Invalid Number";
            };
            System.out.println("Month : " + monthname);
        }
    }
}
