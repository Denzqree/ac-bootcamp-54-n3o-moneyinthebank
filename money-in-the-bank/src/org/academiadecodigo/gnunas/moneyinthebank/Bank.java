package org.academiadecodigo.gnunas.moneyinthebank;

/**
 * Created by codecadet on 29/09/2020.
 */
public class Bank {

    private double costumerBalance;

    public Bank(double costumerBalance) {
        this.costumerBalance = costumerBalance;
    }

    public double getCostumerBalance(){
        return costumerBalance;
    }

    public void depositToBank(double amount) {
        if(amount > 0) {
            this.costumerBalance += amount;
        }
    }

    public double withdrawFromBank(double amount) {
        if(this.costumerBalance >= amount) {
            this.costumerBalance -= amount;
            return amount;
        }
        return 0;
    }
}
