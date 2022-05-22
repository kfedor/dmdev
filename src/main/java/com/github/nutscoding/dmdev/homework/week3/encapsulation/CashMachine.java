package com.github.nutscoding.dmdev.homework.week3.encapsulation;

/**
 * Создать класс, описывающий банкомат.
 * <p>
 * Банкомат задается тремя свойствами:
 * - количеством купюр номиналом 20, 50 и 100.
 * <p>
 * Сделать методы для добавления денег в банкомат.
 * <p>
 * Сделать метод, снимающий деньги: он принимает сумму денег, а возвращает булево значение - успешность выполнения операции.
 * <p>
 * При снятии денег метод должен распечатывать каким количеством купюр какого номинала выдаётся сумма.
 * <p>m
 * Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 */
public class CashMachine {

    private final int VALUE_OF_BANKNOTE_TWENTY = 20;
    private final int VALUE_OF_BANKNOTE_FIFTY = 50;
    private final int VALUE_OF_BANKNOTE_HUNDRED = 100;

    private int quantityOfBanknotesTwenty;
    private int quantityOfBanknotesFifty;
    private int quantityOfBanknotesHundred;

    public CashMachine(int quantityOfBanknotesTwenty, int quantityOfBanknotesFifty, int quantityOfBanknotesHundred) {
        this.quantityOfBanknotesTwenty = quantityOfBanknotesTwenty;
        this.quantityOfBanknotesFifty = quantityOfBanknotesFifty;
        this.quantityOfBanknotesHundred = quantityOfBanknotesHundred;
    }

    public void banknotesTwentyAdd(int banknotesToAdd) {
        quantityOfBanknotesTwenty += banknotesToAdd;
    }

    public void banknotesFiftyAdd(int banknotesToAdd) {
        quantityOfBanknotesFifty += banknotesToAdd;
    }

    public void banknotesHundredAdd(int banknotesToAdd) {
        quantityOfBanknotesHundred += banknotesToAdd;
    }

    public boolean withdrawMoney(int amountForWithdrawing) {
        boolean result = true;
        int totalAmount = findTotalAmount();
        if (amountForWithdrawing % 10 != 0) {
            System.out.println
                    ("Amount is incorrect.");
            result = false;
        }
        if (totalAmount < amountForWithdrawing) {
            result = false;
        }
        if (result) {
            System.out.println(defineBanknotesForWithdrawing(amountForWithdrawing));
        }
        return result;
    }

    private String defineBanknotesForWithdrawing(int amountForWithdrawing) {
        int counterHundred = 0;
        while (amountForWithdrawing >= VALUE_OF_BANKNOTE_HUNDRED && quantityOfBanknotesHundred > 0) {
            amountForWithdrawing -= VALUE_OF_BANKNOTE_HUNDRED;
            quantityOfBanknotesHundred--;
            counterHundred++;
        }
        int counterFifties = 0;
        while (amountForWithdrawing >= VALUE_OF_BANKNOTE_FIFTY && quantityOfBanknotesFifty > 0) {
            amountForWithdrawing -= VALUE_OF_BANKNOTE_FIFTY;
            quantityOfBanknotesFifty--;
            counterFifties++;
        }
        int counterTwenties = 0;
        while (amountForWithdrawing >= VALUE_OF_BANKNOTE_TWENTY && quantityOfBanknotesTwenty > 0) {
            amountForWithdrawing -= VALUE_OF_BANKNOTE_TWENTY;
            quantityOfBanknotesTwenty--;
            counterTwenties++;
        }
        return "банкомат выдаст: купюр по 100 - " + counterHundred
                + " купюр по 50 - " + counterFifties
                + " купюр по 20 - " + counterTwenties;
    }

    private int findTotalAmount() {
        int amountOfTwenties = quantityOfBanknotesTwenty * VALUE_OF_BANKNOTE_TWENTY;
        int amountOfFifties = quantityOfBanknotesFifty * VALUE_OF_BANKNOTE_FIFTY;
        int amountOfHundreds = quantityOfBanknotesHundred * VALUE_OF_BANKNOTE_HUNDRED;
        return amountOfTwenties + amountOfFifties + amountOfHundreds;
    }
}

