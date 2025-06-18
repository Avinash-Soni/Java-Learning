import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle Amount : ");
        float p = input.nextFloat();
        System.out.print("Enter Time in month : ");
        float t = input.nextFloat();
        System.out.print("Enter Rate of interest : ");
        float r = input.nextFloat();

        double Interest = p*Math.pow((1+r/100),t);

        System.out.println("Compound Interest : "+Interest);
    }
}
