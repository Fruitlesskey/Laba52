package com.example.laba52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BonusServiceTest {

  @Test
  void shouldCalculateRestMonthsExample1() {
    BonusService service = new BonusService();
    int income = 10000;
    int expenses = 3000;
    int threshold = 20000;
    int expected = 3;
    int actual = service.calculateMonthsOfRest(income, expenses, threshold);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void shouldCalculateRestMonthsExample2() {
    BonusService service = new BonusService();
    int income = 100000;
    int expenses = 60000;
    int threshold = 150000;
    int expected = 2;
    int actual = service.calculateMonthsOfRest(income, expenses, threshold);
    Assertions.assertEquals(expected, actual);



  }

  @ParameterizedTest
  @CsvSource({
      "10000, 3000, 20000, 3",
      "100000, 60000, 150000, 2"
  })
  void shouldCalculateRestMonthsBasedOnCsvSource(int income, int expenses, int threshold, int expected) {
    BonusService service = new BonusService();
    int actual = service.calculateMonthsOfRest(income, expenses, threshold);
    assertEquals(expected, actual);
  }
}
