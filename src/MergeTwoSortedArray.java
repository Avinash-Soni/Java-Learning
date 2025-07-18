import java.util.Scanner;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of First Array: ");
        int size1 = input.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter Sorted Array");
        for (int i = 0; i < size1; i++) {
            System.out.print("Enter " + (i + 1) + " element of first array: ");
            array1[i] = input.nextInt();
        }

        System.out.print("Enter the size of Second Array: ");
        int size2 = input.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter Sorted Array");
        for (int i = 0; i < size2; i++) {
            System.out.print("Enter " + (i + 1) + " element of second array: ");
            array2[i] = input.nextInt();
        }

        int[] mergedArray = new int[size1 + size2];
        int i = 0, j = 0, k = 0;

        // Merge arrays
        while (i < size1 && j < size2) {
            if (array1[i] < array2[j]) {
                mergedArray[k] = array1[i];
                i++;
                k++;
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        // Add remaining elements from array1
        while (i < size1) {
            mergedArray[k++] = array1[i++];
        }

        // Add remaining elements from array2
        while (j < size2) {
            mergedArray[k++] = array2[j++];
        }

        // Print merged array
        System.out.println("Merged Sorted Array:");
        for (int x = 0; x < mergedArray.length; x++) {
            System.out.print(mergedArray[x] + " ");
        }
    }
}
