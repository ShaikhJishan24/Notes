package BankManagement;

import java.io.*;
import java.util.ArrayList;

public class Bank implements Serializable {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(String accountNumber) {
        accounts.add(new Account(accountNumber));
    }

    public Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public void saveBank(String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(this);
        } catch (IOException e) {
            System.out.println("Error saving bank data: " + e.getMessage());
        }
    }

    public static Bank loadBank(String filename) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            return (Bank) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading bank data: " + e.getMessage());
            return new Bank();
        }
    }
}

