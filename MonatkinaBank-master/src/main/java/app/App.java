package app;

import bank.ATM;
import bank.Bank;
import bank.Card;
import data.BankAccount;

import java.util.List;

public class App {
    public static void main(String[] args) {
        ATM atm = new ATM();
        System.out.println(Bank.getAccounts().get(0).getPersonalAccount());
        System.out.println(Bank.getAccounts().get(0).getClient().getCard().getPinCode());
        atm.start();

    }
}