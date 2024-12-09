package ru.netology.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumbersMonthsNextYearTest {
    @Test
    public void calculateVacationMonthsTest1() {
        NumbersMonthsNextYear service = new NumbersMonthsNextYear();
        int result = service.calculate(10000, 3000, 20000);
        assertEquals(3, result);
    }

    @Test
    public void calculateVacationMonthsTest2() {
        NumbersMonthsNextYear service = new NumbersMonthsNextYear();
        int result = service.calculate(100000, 60000, 150000);
        assertEquals(2, result);
    }
}