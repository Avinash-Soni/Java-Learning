import java.util.Scanner;

public class DiceRoll {
    public static void main(String[] args) {
        String command;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Roll your Dice (yes/no) : ");
            command = input.next();
            if (command.equals("yes")){
                System.out.println((int)(Math.random()*10));
            }

        }while (command.equals("yes"));
    }
}
