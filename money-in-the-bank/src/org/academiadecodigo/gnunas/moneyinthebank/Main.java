package org.academiadecodigo.gnunas.moneyinthebank;

/**
 * Created by codecadet on 29/09/2020.
 * Money in the bank... Pimping ain't easy !
 */
public class Main {

    public static void main(String[] args){

        //INSERT MAIN CODE HERE

        // DEFINE INITIAL VARIABLES HERE
        double customerBankBalance = 1000;
        int customerWalletBalance = 500;


        // Create a new Bank
        Bank bank = new Bank(customerBankBalance);

        // Create a new Wallet for the Customer
        Wallet customerWallet = new Wallet(customerWalletBalance);

        // Create a Customer with the predefined Bank and Wallet
        Customer customer = new Customer(bank, customerWallet);

        //Some sout's
        System.out.println("Bank balance of customer is : "+customerBankBalance+"$");

        // Where the transactions take place !
        customer.deposit(200);
        customer.withdraw(50);
        customer.withdraw(1150);
        customer.withdraw(20);
        customer.deposit(200);
        customer.withdraw(200);
    }
}
