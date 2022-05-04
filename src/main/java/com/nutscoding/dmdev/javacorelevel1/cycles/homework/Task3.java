package com.nutscoding.dmdev.javacorelevel1.cycles.homework;

/**
 * Программист Ваня сразу после окончания курсов dmdev
 * устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счёт брокера,
 * чтобы инвестировать в акции с доходностью 2% в месяц.
 * <p>
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 * <p>
 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 */
public class Task3 {

    public static void main(String[] args) {
        int salary = 600;
        int month = 38;
        int periodOfIncrease = 6;
        int amountOfIncrease = 400;
        double investAccountAmount =
                (investAccount(salary,
                        month,
                        periodOfIncrease,
                        amountOfIncrease));
        double mainAccountAmount =
                (mainAccount(salary,
                        month,
                        periodOfIncrease,
                        amountOfIncrease));
        System.out.println("На брокерском счету: " + investAccountAmount + " долларов США");
        System.out.println("На основном счету: " + mainAccountAmount + " долларов США");

    }

    public static double investAccount (int salary, int month, int periodOfIncrease, int amountOfIncrease) {
        int currentMonth = 1;
        double investSum = 0;

        while(currentMonth < month){
            if (currentMonth % periodOfIncrease == 0){
                salary += amountOfIncrease;
            }
            investSum = investSum + (investSum * 0.02) + (salary * 0.1);
            currentMonth++;
        }
        return investSum;
    }

    public static  double mainAccount(int salary, int month, int periodOfIncrease, int amountOfIncrease){
        double mainAccount = 0;
        int currentMonth = 1;
        int foodSum = 300;
        while(currentMonth <= month){
            if (currentMonth % periodOfIncrease == 0){
                salary += amountOfIncrease;
            }
            double brokerDeduction = salary * 0.1;
            mainAccount = mainAccount + (salary - foodSum - brokerDeduction);
            currentMonth++;
        }
        return mainAccount;
    }
}
