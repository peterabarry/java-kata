package com.everve.kata.shoppingkart.domain.quantity;

import com.everve.kata.shoppingkart.domain.Price;

public class UnitQuantity extends AbstractQuantity<UnitQuantity> {

    public static final UnitQuantity ONE = new UnitQuantity();

    public static UnitQuantity of(int units) {
        return units == 1 ? UnitQuantity.ONE : new UnitQuantity(units);
    }

    private UnitQuantity() {
        this(1);
    }

    private UnitQuantity(int count) {
        super(count);
    }

    @Override
    public String print() {
        return ""; //we do not need to for unit prices as the lines are self evident.
    }

}
