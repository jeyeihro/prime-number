package com.github.jeyeihro.prime.app;

import java.util.stream.IntStream;

public class PrimeDisplay {
    final int limit;
    public PrimeDisplay(int limit){
        this.limit = limit;
    }
    public int execute(){
        IntStream.rangeClosed(1, limit).filter(n -> PrimeJudge.isPrime(n)).forEach(n -> System.out.println(n));
        return 0;
    }
}
