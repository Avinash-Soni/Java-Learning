import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your Age : ");
        int age = input.nextInt();

        if(age<=13){
            System.out.println("You are a child");
        } else if (age<=20) {
            System.out.println("You are a Teen");
        } else if (age <=60) {
            System.out.println("You are adult");
        }else {
            System.out.println("You are Senior Citizen");
        }
    }
}
