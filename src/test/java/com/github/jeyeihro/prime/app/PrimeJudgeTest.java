package com.github.jeyeihro.prime.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeJudgeTest {
    @Test
    void isPrime_negative(){
        assertEquals(false, PrimeJudge.isPrime(-1));
    }

    @Test
    void isPrime_zero(){
        assertEquals(false, PrimeJudge.isPrime(0));
    }

    @Test
    void isPrime_one(){
        assertEquals(false, PrimeJudge.isPrime(1));
    }

    @Test
    void isPrime_two(){
        assertEquals(true, PrimeJudge.isPrime(2));
    }

    @Test
    void isPrime_three(){
        assertEquals(true, PrimeJudge.isPrime(3));
    }

    @Test
    void isPrime_four(){
        assertEquals(false, PrimeJudge.isPrime(4));
    }

    @Test
    void isPrime_nine(){
        assertEquals(false, PrimeJudge.isPrime(9));
    }
}