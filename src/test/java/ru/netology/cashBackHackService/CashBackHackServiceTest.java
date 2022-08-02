package ru.netology.cashBackHackService;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CashBackHackServiceTest {

    CashBackHackService service = new CashBackHackService();

    @Test
    public void shouldShowAdditionalPayment(){
        int amount = 800;
        int expected = 200;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
    @Test
    public void shouldShowZeroAdditionalPayment(){
        int amount = 1_000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

}