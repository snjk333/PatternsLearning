package com.oleksandr.Structural.Proxy.FirstExample;

import java.util.Currency;

public class MainClass {
    public static void main(String[] args) {
        CurrentRateService currentRateService = new CurrencyRateServiceProxy();

        Currency eur = Currency.getInstance("EUR");
        System.out.println("For EUR: ");
        System.out.println(currentRateService.getDailyCurrentRate(eur));
        System.out.println(currentRateService.getDailyCurrentRate(eur));
        System.out.println(currentRateService.getDailyCurrentRate(eur));

        System.out.println("===========================================");

        Currency usd = Currency.getInstance("USD");
        System.out.println("For USD: ");
        System.out.println(currentRateService.getDailyCurrentRate(usd));
        System.out.println(currentRateService.getDailyCurrentRate(usd));
        System.out.println(currentRateService.getDailyCurrentRate(usd));
    }
}
