package exercicio6.application;

import exercicio6.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String accountHolder = sc.nextLine();

        System.out.print("Is there a initial deposit (y/n) ? ");
        char isInitialDeposit = sc.next().charAt(0);

        if (isInitialDeposit == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialValue = sc.nextDouble();
             account = new Account(accountNumber, accountHolder, initialValue);
        } else {
            account = new Account(accountNumber, accountHolder);
        }

        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);
        System.out.println("Update account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);
        System.out.println("Update account data: ");
        System.out.println(account);


        sc.close();

    }
}
