package com.cyclokitty;

import java.util.Random;

public class WeatherForecast {
    private Random random;

    public WeatherForecast() {
        this.random = new Random();
    }

    public String forecastWeather() {
        double probability = this.random.nextDouble();

        if (probability <= 0.1) {
            return "Sleet";
        } else if (probability <= 0.4) {
            return "Snow";
        } else {
            return "Sunny";
        }
    }

    public int forecastTemperature() {
        return (int) (4 * this.random.nextGaussian() - 3);
    }
}
