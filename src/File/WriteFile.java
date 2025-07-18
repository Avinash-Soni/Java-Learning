package File;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your file Name : ");
        String fileName = input.next();

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("This is the best practice for java.");
            writer.flush();
            System.out.println("Successfully created file and enter data");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
