import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of Element : ");
        int num = input.nextInt();

        int[] array = new int[num];
        int smallest = 0;

        for (int i=0;i<num;i++){
            System.out.print("Enter Your "+(i+1)+" Element : ");
            array[i] = input.nextInt();
             smallest = array[0];
            if(smallest>array[i]){
                smallest=array[i];
            }
        }
        int gcd = 1;

        for (int i = smallest; i >= 1; i--) {
            boolean isGCD = true;
            for (int j = 0; j < num; j++) {
                if (array[j] % i != 0) {
                    isGCD = false;
                    break;
                }
            }
            if (isGCD) {
                gcd = i;
                break;
            }
        }
        System.out.println("GCD = "+gcd);
    }
}
