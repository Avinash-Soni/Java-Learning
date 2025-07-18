import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();

        int absoluteValue;

        absoluteValue = (num==-num)?num:-num;

        System.out.print("Absolute Value is : "+absoluteValue);
    }
}
