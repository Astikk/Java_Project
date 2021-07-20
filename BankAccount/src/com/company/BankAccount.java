package com.company;

public class BankAccount {
    private int account_number;
    private double balance;
    private String customername;
    private String email;
    private int PhoneNo;

    public void deposite(double depositamount){
        this.balance +=depositamount;
        System.out.println("Deposit of "+depositamount+" made, New balance is = "+this.balance);
    }

    public void withdraw(double withdrawamount){
        if (this.balance - withdrawamount >=0){
            System.out.println("only "+ this.balance+ " available Withdraw not processed");
        }else {
            this.balance -= withdrawamount;
            System.out.println("withdrawal of "+ withdrawamount+ " processed, Remaining balanced = "+ this.balance);
        }
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
        System.out.println("Balance = ");
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        PhoneNo = phoneNo;
    }
}
