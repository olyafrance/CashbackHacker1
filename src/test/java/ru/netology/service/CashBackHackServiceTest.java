package ru.netology.service;

import static org.testng.AssertJUnit.assertEquals;


public class CashBackHackServiceTest {

    @org.testng.annotations.Test

    public void CashBackTest() {
        CashBackHackService service = new CashBackHackService();

        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void AddNullCashBackTest() {
        CashBackHackService service = new CashBackHackService();

        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void AddAllCashBackTest() {
        CashBackHackService service = new CashBackHackService();

        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

}
