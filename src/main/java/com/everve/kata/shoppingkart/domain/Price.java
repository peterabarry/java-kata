package com.everve.kata.shoppingkart.domain;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.Currency;

public class Price implements Printable{

    private static final NumberFormat FORMAT = DecimalFormat.getCurrencyInstance();

    static {
        FORMAT.setCurrency(Currency.getInstance("GBP"));
    }

    public static Price sum(Collection<Price> prices) {
        return Price.of(prices.stream().mapToDouble((p) -> p.value).sum());
    }

    public static Price of(double value) {
        return new Price(value);
    }

    private final double value;

    private Price(double value) {
        this.value = value;
    }

    public Price multiply(double multiplier) {
        return new Price(multiplier * value);
    }

    @Override
    public String print() {
        return FORMAT.format(this.value);
    }
}
