package com.exemple;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CalculatriceTest {
    @Test
    void additionMarche() {
        assertEquals(5, new Calculatrice().additionner(2, 3));
    }
}