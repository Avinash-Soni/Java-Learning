import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = input.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i + 1) + " element of array : ");
            array[i] = input.nextInt();
        }
        System.out.print("Enter number for checking occurrence : ");
        int value = input.nextInt();
        int count = 0;

        //for each loop
        for(int num:array){
            if (num == value){
                count++;
            }
        }
        System.out.println("Occurrence : "+count);
    }
}
