package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMaxWhenMaxIsFirst() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenMaxIsNotFirst() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {1, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenAllElementsAreEqual() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {7, 7, 7, 7, 7};
        long expected = 7;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWithSingleElement() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {42};
        long expected = 42;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWithNegativeNumbers() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {-10, -5, -8, -3, -1};
        long expected = -1;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenMaxInMiddle() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {1, 2, 3, 10, 4, 5, 6};
        long expected = 10;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenMaxAtEnd() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {1, 2, 3, 4, 5, 6, 20};
        long expected = 20;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenMaxAtBeginning() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {100, 2, 3, 4, 5, 6, 20};
        long expected = 100;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }
}