package com.github.jeyeihro.prime.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeDisplayTest {
    @Test
    void constructor(){
        int expected = 100;
        PrimeDisplay d = new PrimeDisplay(100);
        assertEquals(expected, d.limit);
    }

    @Test
    void execute(){
        assertEquals(0, new PrimeDisplay(10).execute());
    }
}