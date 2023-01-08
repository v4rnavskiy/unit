package ru.netology.unit.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

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
    public void getBalance() {
        CashbackHackService cash = new CashbackHackService();

        int amount = 900;
        int actual = cash.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

}

