package com;

import java.util.Random;

public class PasswordRandomizer {
    private Random random;
    private int length;

    public PasswordRandomizer(int length) {
        this.length = length;
        random = new Random();
    }

    public String createPassword() {
        int i = 0;
        String password = "";
        while (i < this.length) {
            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            int number = this.random.nextInt(alphabet.length());
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            password = password + symbol;
            i++;
        }
        return password;
    }
}
