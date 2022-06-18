package com.github.jeyeihro.prime.app;

import java.util.stream.IntStream;

class PrimeJudge {
    static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }
        if(number == 2){
            return true;
        }
        if(number % 2 == 0){
            return false;
        }
        return IntStream.rangeClosed(3, (int)Math.sqrt(number)).allMatch(n -> number % n != 0);
    }
}
