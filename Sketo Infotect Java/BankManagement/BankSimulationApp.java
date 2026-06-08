package BankManagement;

import java.util.Scanner;

public class BankSimulationApp {
    private static Bank bank;
    private static final String FILENAME = "bank.dat";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        bank = Bank.loadBank(FILENAME);
        boolean exit = false;

        while (!exit) {
            System.out.println("Welcome to the Bank Simulation System");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Check Balance");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    transfer();
                    break;
                case 5:
                    checkBalance();
                    break;
                case 6:
                    bank.saveBank(FILENAME);
                    exit = true;
                    System.out.println("Thank you for using the Bank Simulation System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createAccount() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        bank.addAccount(accountNumber);
        System.out.println("Account created successfully.");
    }

    private static void deposit() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        Account account = bank.findAccount(accountNumber);
        if (account != null) {
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();
            account.deposit(amount);
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void withdraw() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        Account account = bank.findAccount(accountNumber);
        if (account != null) {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            account.withdraw(amount);
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void transfer() {
        System.out.print("Enter source account number: ");
        String sourceAccountNumber = scanner.next();
        Account sourceAccount = bank.findAccount(sourceAccountNumber);
        if (sourceAccount != null) {
            System.out.print("Enter destination account number: ");
            String destinationAccountNumber = scanner.next();
            Account destinationAccount = bank.findAccount(destinationAccountNumber);
            if (destinationAccount != null) {
                System.out.print("Enter amount to transfer: ");
                double amount = scanner.nextDouble();
                sourceAccount.transfer(destinationAccount, amount);
                System.out.println("Amount transferred successfully.");
            } else {
                System.out.println("Destination account not found.");
            }
        } else {
            System.out.println("Source account not found.");
        }
    }

    private static void checkBalance() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        Account account = bank.findAccount(accountNumber);
        if (account != null) {
            System.out.println("Account Balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }
}

