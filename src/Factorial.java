import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact = getNumber();
        System.out.println("factorial of "+fact+" is "+factorial(fact));

    }
    public static int getNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your number : ");
        int num = input.nextInt();
        return num;
    }

    public static int factorial(int num){
        if(num==0 || num==1){
            return num = 1;
        }else{
            return num * factorial(num-1);
        }
    }
}
