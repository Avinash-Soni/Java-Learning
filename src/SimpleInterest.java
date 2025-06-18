import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principle amount : ");
        float p = input.nextFloat();
        System.out.print("Enter time in month : ");
        float t = input.nextFloat();
        System.out.print("Enter rate of intrest per month ; ");
        float r = input.nextFloat();

        System.out.println("Simple interest : "+((p*r*t)/100));
    }
}
