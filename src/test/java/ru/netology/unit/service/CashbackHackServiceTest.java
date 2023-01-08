package ru.netology.unit.service;

import org.junit.Test;
import org.junit.Assert;


public class CashbackHackServiceTest {

    @Test
    public void getCashback() {
        CashbackHackService cash = new CashbackHackService();

        int amount = 1000;
        int actual = cash.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getCashback2() {
        CashbackHackService cash = new CashbackHackService();

        int amount = 900;
        int actual = cash.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }


}

