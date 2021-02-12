package org.academiadecodigo.gnunas.moneyinthebank;

/**
 * Created by codecadet on 29/09/2020.
 */
public class Customer {

    private Bank bank;
    private Wallet wallet;

    public Customer(Bank bank, Wallet wallet) {
        this.bank = bank;
        this.wallet = wallet;
    }

    public void deposit(double amount) {
        double withdrawFromWallet = wallet.withdrawFromWallet(amount);
        if (withdrawFromWallet > 0) {
            bank.depositToBank(withdrawFromWallet);
            System.out.println("Customer deposited " + amount + "$ to his bank account. His bank account's balance is now " + bank.getCostumerBalance() + "$");
        } else {
            System.out.println("The amount to be deposited by the customer is 0");
        }
    }

    public void withdraw(double amount) {
        double withdrawFromBank = bank.withdrawFromBank(amount);
        if (withdrawFromBank > 0 && bank.getCostumerBalance() >= 0) {
            wallet.depositToWallet(withdrawFromBank);
            System.out.println("Customer withdrew " + amount + "$ from his bank account. His bank account's balance is now " + bank.getCostumerBalance() + "$");
        }else{
            System.out.println("The amount to be withdrawn exceeds the customer's bank balance.");
        }
    }
}
