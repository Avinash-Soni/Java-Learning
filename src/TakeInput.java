import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name= input.nextLine();
        System.out.println("Welcome "+name+" In Java World");
    }
}
