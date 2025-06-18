import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of Element : ");
        int num = input.nextInt();

        int[] array = new int[num];
        int mul=1;

        for (int i=0;i<num;i++){
            System.out.print("Enter Your "+(i+1)+" Element : ");
            array[i] = input.nextInt();
             mul = mul*array[i];
        }

        for (int i = 1; i <= mul; i++) {
            boolean isLCM = true;
            for (int j = 0; j < num; j++) {
                if (i % array[j] != 0) {
                    isLCM = false;
                    break;
                }
            }
            if (isLCM) {
                System.out.println("LCM = " + i);
                break;
            }
        }
    }
}
