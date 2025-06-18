import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of Element : ");
        int num = input.nextInt();

        int[] array = new int[num];
        int sum = 0;

        for(int i=0;i<num;i++){
            System.out.print("Enter Your "+(i+1)+" Element : ");
            array[i]= input.nextInt();
            sum += array[i];
        }
        System.out.println("Sum of all element : "+sum);
        System.out.println("Average of all element : "+(sum/num));
    }
}
