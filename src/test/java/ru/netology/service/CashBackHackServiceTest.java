package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CashBackHackServiceTest {

    @Test
    public void CashBackTest() {
        CashBackHackService service = new CashBackHackService();

        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void AddNullCashBackTest() {
        CashBackHackService service = new CashBackHackService();

        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void AddAllCashBackTest() {
        CashBackHackService service = new CashBackHackService();

        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        Assertions.assertEquals(expected, actual);
    }

}
