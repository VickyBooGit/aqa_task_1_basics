package ru.netology.service;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CartServiceTest {

    @Test
    public void changeCount() {
        CartService service = new CartService();
        assertThrows(UnsupportedOperationException.class, () ->
                service.changeCount(1, 1));
    }
}