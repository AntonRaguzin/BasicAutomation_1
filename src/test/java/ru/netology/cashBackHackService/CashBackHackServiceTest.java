package ru.netology.cashBackHackService;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashBackHackServiceTest {

    CashBackHackService service = new CashBackHackService();

    @Test
    public void shouldShowAdditionalPayment(){
        int amount = 800;
        int expected = 200;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void shouldShowZeroAdditionalPayment(){
        int amount = 1_000;
        int expected = 0;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

}