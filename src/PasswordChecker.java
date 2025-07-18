import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        String password;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your password : ");
            password = input.next();
        }while (!validPassword(password));
        System.out.println("Thank You for valid Password.");
    }

    public static boolean validPassword(String pass){
        if (pass.length()==7){
            return true;
        }else {
            return false;
        }
    }
}
