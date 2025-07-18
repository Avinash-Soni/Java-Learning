import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacter {
    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String userStr = input.nextLine();

        for(char ch : userStr.toCharArray()){
            set.add(ch);
        }
        System.out.printf("Your String has %d unique character.",set.size());
    }
}
