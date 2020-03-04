package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 1;
        double sumCredit = amount + amount * percent / 100;
        while (sumCredit > salary) {
            year++;
            sumCredit = (sumCredit - salary) + (sumCredit - salary) * (percent) / 100;
        }
        return year;
    }
}