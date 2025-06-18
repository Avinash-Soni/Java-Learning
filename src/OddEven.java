import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, Enter a number : ");
        float num = input.nextFloat();

        float check = num % 2;

        if(check == 0){
            System.out.println("Your number is Even");
        }else {
            System.out.println("Your Number is Odd");
        }
    }
}
