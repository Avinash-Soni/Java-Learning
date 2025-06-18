import java.util.Scanner;

public class AddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value Of First Number: ");
        int first = input.nextInt();
        System.out.print("Enter Value Of Second Number: ");
        int second = input.nextInt();
        System.out.println("Sum Of Value: "+(first+second));
    }
}
