import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Element : ");
        int num = input.nextInt();

        int[] array = new int[num];

        for(int i=0;i<num;i++){
            System.out.print("Enter Your "+(i+1)+" element : ");
            array[i]= input.nextInt();
        }
        int min = array[0];
        int max = array[0];

        for(int i=1;i<num;i++){
            if (min > array[i]) {
                min = array[i];
            }
        }
        for(int i=1;i<num;i++){
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Max element of array : "+max);
        System.out.println("Min ele,ent of array : "+min);
    }
}
