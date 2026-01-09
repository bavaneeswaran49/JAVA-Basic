import java.util.Scanner;


class BankAccount {

    int balance = 4000;

    void deposit(int amt) {
        balance += amt;
        System.out.println("Deposited Amount: " + amt);
        System.out.println("Current Balance: " + balance);
    }

    void withdraw(int amt) {
        System.out.println("Withdraw method in BankAccount");
    }

    void showBalance() {
        System.out.println("Available Balance: " + balance);
    }
}


class SavingAccount extends BankAccount {


    @Override
    void withdraw(int amt) {
        int limit = 2000;

        if (amt > limit) {
            System.out.println("Saving Account withdrawal limit is 2000");
        } else if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn from Saving Account: " + amt);
            showBalance();
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}


class CheckingAccount extends BankAccount {

    // withdrawal fee applied
    @Override
    void withdraw(int amt) {
        int fee = 50;

        if (amt + fee <= balance) {
            balance -= (amt + fee);
            System.out.println("Withdrawn from Checking Account: " + amt);
            System.out.println("Transaction Fee: " + fee);
            showBalance();
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class BankAccountTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Account Type");
        System.out.println("1. Saving Account");
        System.out.println("2. Checking Account");

        int choice = sc.nextInt();

        if (choice == 1) {
            SavingAccount sa = new SavingAccount();

            sa.deposit(1000);
            sa.withdraw(1500);

        } else if (choice == 2) {
            CheckingAccount ca = new CheckingAccount();

            ca.deposit(1000);
            ca.withdraw(1500);

        } else {
            System.out.println("Invalid Choice");
        }
    }
}
