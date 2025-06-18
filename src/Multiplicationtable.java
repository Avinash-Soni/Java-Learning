import java.util.Scanner;

public class Multiplicationtable {
    public static void main(String[] args) {
        float number = getNumber();
        Print(number);

    }

    public static float  getNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        return input.nextFloat();
    }

    public static void Print(float num){
        System.out.println("Your Multiplication Table is : ");
        for(int i=1;i<=10;i++) {
            System.out.println(num+" X " +i+" = "+(num*i));
        }
    }
}
