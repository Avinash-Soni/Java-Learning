import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = input.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        System.out.print("Enter the element to delete: ");
        int elementToDelete = input.nextInt();

        int indexToDelete = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == elementToDelete) {
                indexToDelete = i;
                break;
            }
        }

        if (indexToDelete == -1) {
            System.out.println("Element not found in the array.");
        } else {
            for (int i = indexToDelete; i < size - 1; i++) {
                array[i] = array[i + 1];
            }

            System.out.println("Array after deleting element " + elementToDelete + ":");
            for (int i = 0; i < size - 1; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
