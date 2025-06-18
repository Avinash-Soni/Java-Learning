import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = input.nextInt();

        int count = 0;
        int temp = num;

        while(temp%10 !=0){
            count=count+1;
            temp/=10;
        }
        double sum =0;
        temp = num;
        while (temp%10 !=0){
            int digit = temp%10;
            sum = sum + Math.pow(digit , count);
            temp/=10;
        }
        if(num==sum){
            System.out.println("Number is Armstrong");
        }else {
            System.out.println("Number is not Armstrong");
        }
    }
}
