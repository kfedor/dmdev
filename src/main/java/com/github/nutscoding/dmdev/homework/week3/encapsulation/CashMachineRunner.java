package com.github.nutscoding.dmdev.homework.week3.encapsulation;

public class CashMachineRunner {

    public static void main(String[] args) {
        CashMachine cashMachine = new CashMachine
                (10,
                        10,
                        10);
        cashMachine.banknotesTwentyAdd(10);
        cashMachine.banknotesFiftyAdd(10);
        cashMachine.banknotesHundredAdd(10);

        System.out.println(cashMachine.withdrawMoney(740));
    }
}
