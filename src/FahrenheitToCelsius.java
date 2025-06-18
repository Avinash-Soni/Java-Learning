import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter  Temperature in Fahrenheit : ");
        float F = input.nextFloat();

       // float C = ((F-32)*5)/9;

        float C = ((F-32)*5f/9f);

        System.out.println("Temperature in Celsius : "+C);
    }
}
