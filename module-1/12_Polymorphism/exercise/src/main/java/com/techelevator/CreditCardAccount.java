package com.techelevator;

public class CreditCardAccount implements Accountable {

    private String accountHolder;
    private String accountNumber;
    private int debt;

    public CreditCardAccount(String accountHolder, String accountNumber){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public int getDebt(){
        return debt;
    }
    @Override
        public int getBalance(){
            return -debt;
    }
    public int pay(int amountToPay){
        debt = debt - amountToPay;
        return debt;
    }
    public int charge(int amountToCharge){
        debt = amountToCharge + debt;
        return debt;
    }
}
