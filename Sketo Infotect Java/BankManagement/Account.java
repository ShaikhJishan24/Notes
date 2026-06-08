package BankManagement;
import java.io.Serializable;

public class Account implements Serializable {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void transfer(Account toAccount, double amount) {
        if (amount <= balance) {
            withdraw(amount);
            toAccount.deposit(amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

