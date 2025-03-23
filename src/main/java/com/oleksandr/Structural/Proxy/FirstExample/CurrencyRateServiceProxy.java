package com.oleksandr.Structural.Proxy.FirstExample;

import java.util.Currency;
import java.util.HashMap;

public class CurrencyRateServiceProxy implements CurrentRateService{

    private final CurrentRateService currentRateService;
    private final HashMap<Currency,Double> currencyRatesMap = new HashMap<>();

    public CurrencyRateServiceProxy() {
        this.currentRateService = new CurrentRateServiceImpl();
    }

    @Override
    public double getDailyCurrentRate(Currency currency) {
        if(currencyRatesMap.containsKey(currency)) {
            return currencyRatesMap.get(currency);
        }
        double dailyRate = currentRateService.getDailyCurrentRate(currency);
        currencyRatesMap.put(currency, dailyRate);
        return dailyRate;
    }
}
