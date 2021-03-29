package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Accountable[] getAccounts() {
        return accounts.toArray(new Accountable[0]);
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void addAccount(Accountable newAccount){
        accounts.add(newAccount);
    }

    public boolean isVip(){
        int total = 0;
        for (Accountable account : accounts) {
            total += account.getBalance();
        }
        if (total >= 25000) {
            return true;
        }
        return false;
    }

}
