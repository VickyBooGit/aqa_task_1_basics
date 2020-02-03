package ru.netology.service;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
void shouldReturn100IfAmount900() {
    CashbackHackService service = new CashbackHackService();
    int amount = 900;
    int actual = service.remain(amount);
    int expected = 100;
    assertEquals(expected, actual);

}

    @Test
    void shouldReturn0IfAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);

    }
    @Test
    void shouldReturn0IfAmount2000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    void shouldReturnExeptionIfAmountMinus200()  {
        CashbackHackService service = new CashbackHackService();
        int amount = -200;

        assertThrows(RuntimeException.class, ()-> {service.remain(amount);} );
    }
}