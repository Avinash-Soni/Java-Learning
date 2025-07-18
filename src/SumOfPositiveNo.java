import java.util.Scanner;

public class SumOfPositiveNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = input.nextInt();

        int[] array = new int[size];

        for(int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " element of array : ");
            array[i] = input.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < size; i++) {
            if(array[i] < 0) {
                continue;  // Skip negative numbers
            }
            sum += array[i]; // Only positive and zero values are added
        }

        System.out.println("Sum of all positive numbers is : " + sum);
        input.close();
    }
}
