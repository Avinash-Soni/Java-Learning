package File;


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadAFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your file Name : ");
        String fileName = input.next();

        try(FileReader reader = new FileReader(fileName)){
            int read = 0;
            do {
                read =  reader.read();
                System.out.print((char)read);
            }while (read != -1);
        }catch (IOException e){
            System.out.println("File is not found.");
        }
    }

}
