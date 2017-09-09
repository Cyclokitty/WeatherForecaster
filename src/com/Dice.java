package com;

import java.util.Random;

public class Dice {
    private Random random;
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        random = new Random();
    }

    public int roll() {
        int rolled = this.random.nextInt(this.numberOfSides) + 1;
        return rolled;
    }
}
