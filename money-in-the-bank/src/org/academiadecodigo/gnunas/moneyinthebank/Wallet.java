package org.academiadecodigo.gnunas.moneyinthebank;

/**
 * Created by codecadet on 29/09/2020.
 */
public class Wallet {

    private double walletBalance;

    public Wallet(double walletBalance) {
        this.walletBalance = walletBalance;
    }

    public void depositToWallet(double amount) {
        if (amount > 0) {
            this.walletBalance += amount;
        }else{
            System.out.println("Error in depositing to wallet (Amount must be bigger than 0)");
        }
    }

    public double withdrawFromWallet(double amount) {
        if (walletBalance > amount) {
            this.walletBalance -= amount;
            return amount;
        } else {
            return 0;
        }
    }
}
