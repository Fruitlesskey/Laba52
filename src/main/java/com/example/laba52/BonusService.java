package com.example.laba52;

public class BonusService {

  public int calculateMonthsOfRest(int income, int expenses, int threshold) {
    int monthsOfRest = 0;
    int currentMoney = 0;

    for (int month = 1; month <= 12; month++) {
      if (currentMoney >= threshold) {
        currentMoney -= expenses;
        currentMoney -= 3 * (currentMoney - expenses); // Деньги после отдыха уменьшаются в 3 раза
        monthsOfRest++;
      } else {
        currentMoney += income - expenses;
      }
    }

    return monthsOfRest;
  }
}