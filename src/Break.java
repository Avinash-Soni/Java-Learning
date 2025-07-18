import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        String key;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter any Key : ");
            key = input.next();
            if (key.equals("exit")) {
                break;
            }
        }
        input.close();
    }
}
