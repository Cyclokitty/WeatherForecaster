package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        this.numbers = new ArrayList<Integer>();
        this.drawNumbers(7);

    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }


    public void drawNumbers(int picks) {
        Random random = new Random();
        if (this.numbers.size() != picks) {
            int diff = picks - this.numbers.size();
            int j = 0;
            while (j < diff) {
                int digit = random.nextInt(39) + 1;
                if (!this.numbers.contains(digit)) {
                    this.numbers.add(digit);
                } else {
                    j--;
                }
                j++;
            }
        }
        Collections.sort(this.numbers);
    }


}
