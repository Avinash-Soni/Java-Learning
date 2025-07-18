import java.util.Scanner;

public class SearchElementIn2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of row in array : ");
        int row= input.nextInt();
        System.out.print("Enter the number of column in array : ");
        int column = input.nextInt();

        int[][] array = new int[row][column];

        for (int i= 0 ; i<row ; i++){
            for (int j=0;j<column;j++){
                System.out.print("Enter ["+i+"]["+j+"] element of the array : ");
                array[i][j]= input.nextInt();
            }
        }
        System.out.print("Enter search element : ");
        int search = input.nextInt();

        boolean isFound = false;

        for (int i= 0 ; i<row ; i++){
            for (int j=0;j<column;j++){
               if (search == array[i][j] ){
                   System.out.println("Element Found.");
                   isFound = true;
                   break;
               }
            }
        }
        if (!isFound){
            System.out.println("Element is not found.");
        }
    }
}
