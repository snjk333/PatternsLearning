package com.oleksandr.Structural.Proxy.FirstExample;

import java.util.Currency;

public interface CurrentRateService {
    double getDailyCurrentRate(Currency currency);
}
