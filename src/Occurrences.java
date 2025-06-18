import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of Element : ");
        int num = input.nextInt();

        int[] array = new int[num];
        int count = 0;

        for (int i = 0; i < num; i++) {
            System.out.print("Enter Your " + (i + 1) + " Element : ");
            array[i] = input.nextInt();
        }
        System.out.print("Enter number whose occurrence you what to know : ");
        int base = input.nextInt();

        for (int i = 0;i<num;i++){
            if (base==array[i]){
                count = count+1;
            }
        }
        System.out.println("Occurrence of "+base+" is "+count);
    }
}