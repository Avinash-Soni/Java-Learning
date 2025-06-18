import java.util.Scanner;

public class GradesOnMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Marks : ");
        float Marks = input.nextFloat();

        if (Marks >= 90){
            System.out.println("Grade : A");
        } else if (Marks>=75) {
            System.out.println("Grade : B");
        } else if (Marks>=60) {
            System.out.println("Grade : C");
        } else if (Marks>=30) {
            System.out.println("Grade : D");
        } else {
            System.out.println("Grade : E");
        }
    }
}
