package com.oleksandr.Structural.Proxy.FirstExample;

import java.util.Currency;
import java.util.Random;

public class CurrentRateServiceImpl implements CurrentRateService {
    @Override
    public double getDailyCurrentRate(Currency currency) {
        Random rnd = new Random();
        double rate = 100*rnd.nextDouble();
        double scale = Math.pow(10,2);
        return Math.round(rate*scale)/scale;
    }
}
