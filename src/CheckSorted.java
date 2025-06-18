import java.util.Scanner;

public class CheckSorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int num = input.nextInt();

        int[] array = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < num - 1; i++) {
            if (array[i] > array[i + 1]) {
                isAscending = false;
            }
            if (array[i] < array[i + 1]) {
                isDescending = false;
            }
        }

        if (isAscending) {
            System.out.println("Array is sorted in ascending order.");
        } else if (isDescending) {
            System.out.println("Array is sorted in descending order.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }
}
