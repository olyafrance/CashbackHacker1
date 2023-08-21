package ru.netology.service;



import static org.junit.Assert.assertEquals;


public class CashBackHackServiceTest {

    @org.junit.Test

    public void CashBackTest() {
        CashBackHackService service = new CashBackHackService();

        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(expected, actual);
    }

   // @Test
   // public void AddNullCashBackTest() {
    //     CashBackHackService service = new CashBackHackService();

    //     int amount = 1000;
    //    int actual = service.remain(amount);
    //   int expected = 0;

    //    assertEquals(expected, actual);
    // }

    @org.junit.Test
    public void AddAllCashBackTest() {
        CashBackHackService service = new CashBackHackService();

        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }

}
