package com.cyclokitty;

import com.Dice;
import com.LotteryNumbers;
import com.PasswordRandomizer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random randomizer = new Random();
        int i = 0;
        while (i < 10) {
            System.out.println("Oh so random " +  (randomizer.nextInt(50) + 1) + "!");
            i++;
        }

        WeatherForecast forecaster = new WeatherForecast();

        ArrayList<String> dates = new ArrayList<>();
        Collections.addAll(dates, "Mon", "Tues", "Weds", "Thurs", "Fri", "Sat", "Sun");

        System.out.println("Weather forecast for the next week: ");
        for (String day : dates ) {
            String weatherForecast = forecaster.forecastWeather();
            int tempForecast = forecaster.forecastTemperature();
            System.out.println(day + ": " + weatherForecast + " " + tempForecast + " degrees.");
        }

        Dice luckyDice = new Dice(6);
        int j = 0;
        while (j < 10) {
            System.out.println("you rolled: " + luckyDice.roll());
            j++;
        }

//        String alphabet = "abcdefghijklmnopqrstuvwxyz";
//        int alpha = "abcdefghijklmnopqrstuvwxyz".length();
//        System.out.println("This is: " + alpha + " letters long.");

        Random mixer = new Random();
        int k = 0;
        String password = "";
        while (k < 13) {
            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            int number = mixer.nextInt(alphabet.length());
            //char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            char symbol = alphabet.charAt(number);
            password = password + symbol;
            k++;
        }
        System.out.println(password);

        PasswordRandomizer makeMeAPassword = new PasswordRandomizer(13);
        System.out.println("Passwords: " + makeMeAPassword.createPassword());
        System.out.println("Passwords: " + makeMeAPassword.createPassword());
        System.out.println("Passwords: " + makeMeAPassword.createPassword());
        System.out.println("Passwords: " + makeMeAPassword.createPassword());

        LotteryNumbers lotto = new LotteryNumbers();
        ArrayList<Integer> numbers = lotto.numbers();
        System.out.println("Lotto numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("");

    }



}
