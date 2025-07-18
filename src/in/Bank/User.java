package in.Bank;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount(123456789,"Avi",10000000);
        while (true){

        Scanner input = new Scanner(System.in);
        System.out.print("What you want to do with your account (Deposit,Withdraw,Cancle) : ");
        String operation = input.next();

            if (operation.equalsIgnoreCase("deposit")){
                obj.deposit();
                continue;
            }else if (operation.equalsIgnoreCase("withdraw")){
                obj.withdraw();
                continue;
            }else if (operation.equalsIgnoreCase("Cancle")) {
                break;
            }else {
                System.out.println("Enter valid operation.");
                continue;
            }
        }
    }
}
