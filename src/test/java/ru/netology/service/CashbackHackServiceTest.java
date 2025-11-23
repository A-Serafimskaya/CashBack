package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test

    public void shouldDefineAmountBelow1000ForCashBack() {
        CashbackHackService service = new CashbackHackService();

        int expected = 400;
        int actual = service.remain(600);

        assertEquals(expected, actual);

    }

    @Test

    public void shouldDefineAmountAbove1000ForCashBack() {
        CashbackHackService service = new CashbackHackService();

        int expected = 500;
        int actual = service.remain(1500);

        assertEquals(expected, actual);

    }

    @Test

    public void shouldDefineAmount1000ForCashBack() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);

    }

}