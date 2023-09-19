package com.mborciuch;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale indiaLocale = new Locale("fr", "in");
        System.out.println(indiaLocale.getCountry());
        double value  = 1400.22;
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(indiaLocale);
        System.out.println(currencyInstance.format(value));
    }
}
