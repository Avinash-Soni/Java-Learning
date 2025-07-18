import java.util.Scanner;

public class Exception {
    public static void main(String[] args) throws ArithmeticException {
        Exception obj = new Exception();
        try {
            System.out.println(obj.divide());
            throw new java.lang.Exception("I am in throw"); // this is thrown
        } catch (IndexOutOfBoundsException e) {
            System.out.println("I am in catch Block");
            System.out.println(e.getMessage());
        }catch (java.lang.Exception e){
            // this prints the throw message but currently print actual reason.I don't know why?
            System.out.println(e.getMessage());
        }
    }

    int divide() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of a : ");
        int a = input.nextInt();
        System.out.print("Enter value of b : ");
        int b = input.nextInt();
        return a / b;
    }
}
