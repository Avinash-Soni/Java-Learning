import java.util.Scanner;

public class DiceRoll {
    public static void main(String[] args) {
        String command;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Roll your Dice (yes/no) : ");
            command = input.next();
            if (command.equals("yes")){
                int output = (int)(Math.ceil(Math.random()*6));
                    System.out.println(output);
            }

        }while (command.equals("yes"));
    }
}
