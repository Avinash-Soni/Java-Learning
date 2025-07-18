import java.util.Scanner;

public class ScoreRanking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Marks : ");
        int marks = input.nextInt();

        String Rank;

        Rank = marks > 80?"High": (marks > 50)?"Moderate":"Low";

        System.out.println("Your Rank is : "+Rank);
    }
}
