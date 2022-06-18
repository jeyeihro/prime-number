package com.github.jeyeihro.prime;

import com.github.jeyeihro.prime.app.PrimeDisplay;

public class Main {
    public static void main(String[] args) {
        // The number of outputs ranges from 2 to 100 by default.
        // (This is specified by the arguments to the constructor.)
        // Try changing it as a test.
        PrimeDisplay primeDisplay = new PrimeDisplay(100);
        primeDisplay.execute();
    }
}
