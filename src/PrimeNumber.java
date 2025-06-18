import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = input.nextInt();
        boolean isPrime=true;


            for(int i=2;i<num;i++){
                if(num%i==0){
                    System.out.println("Number is not Prime");
                    isPrime=false;
                    break;
                }
            }

        if (isPrime) {
            System.out.println("Number is Prime");
        }
    }
}
