package in.Bank;

import java.util.Scanner;

public class BankAccount {
    Scanner input = new Scanner(System.in);

    private final long accountNumber;
    private final String accountHolderName ;
    private long balance;

    //you can define BankAccount public if you not define public then it will be default.
    //you can access default in same package but not access in different package.
    BankAccount(long accountNumber,String accountHolderName,long balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(){
        System.out.print("Enter your deposited amount : ");
        long amount = input.nextLong();
        this.balance += amount;
        System.out.println("Your amount is deposited.");
    }

    void withdraw(){
        System.out.print("Enter withdrawal amount : ");
        long amount = input.nextLong();
        if (amount <= balance){
            balance -= amount;
            System.out.println("Successfully completed your transaction.");
        }else {
            System.out.println("You have not enough balance.");
        }
    }
}
