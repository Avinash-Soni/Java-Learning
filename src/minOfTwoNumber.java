import java.util.Scanner;

public class minOfTwoNumber {
    public static void min(int value1,int value2){
        int value;
        value=(value1>value2)?value2:value1;
        System.out.println("The min value is : "+value);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int value1= input.nextInt();
        System.out.print("Enter second number : ");
        int value2 = input.nextInt();
        min(value1,value2);
    }
}
