package com.techelevator;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);

    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {

        super(accountHolderName, accountNumber, balance);

    }

    @Override
    public int withdraw(int amountToWithdraw) {

        if (super.getBalance() > 150 + amountToWithdraw) {
            super.withdraw(amountToWithdraw);

        } else if ((super.getBalance() >= amountToWithdraw)) {
            super.withdraw(amountToWithdraw + 2);

        }

        return getBalance();
    }
}