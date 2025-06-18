import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter first Number : ");
        float first = input.nextFloat();
        System.out.print("Please Enter second Number : ");
        float second = input.nextFloat();
        System.out.print("Please Enter third number : ");
        float third = input.nextFloat();

        if(first >= second && first >= third){
            System.out.println("The greatest number is : "+first);
        } else if (second >= first && second >= third ) {
            System.out.println("The greatest number is : "+second);
        }else {
            System.out.println("The greatest number is : "+third);
        }
    }
}
