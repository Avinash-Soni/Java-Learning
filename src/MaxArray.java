import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = input.nextInt();

        int [] array = new int[size];

        for (int i = 0;i<size;i++){
            System.out.print("Enter the "+(i+1)+" element of array : ");
            array[i]= input.nextInt();
        }
        int max = Integer.MIN_VALUE;

        //using for each loop
        for (int num:array){
            if (num>max){
                max = num;
            }
        }
        System.out.println("Max number is : "+max);
    }
}
