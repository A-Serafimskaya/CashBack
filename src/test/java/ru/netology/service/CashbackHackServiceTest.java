package ru.netology.service;




import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test

    public void shouldDefineAmountBelow1000ForCashBack() {
        CashbackHackService service = new CashbackHackService();

        int expected = 400;
        int actual = service.remain(600);

        assertEquals(actual, expected);

    }

    @Test

    public void shouldDefineAmountAbove1000ForCashBack() {
        CashbackHackService service = new CashbackHackService();

        int expected = 500;
        int actual = service.remain(1500);

        assertEquals(actual, expected);

    }

    @Test

    public void shouldDefineAmount1000ForCashBack() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual, expected);
    }

}