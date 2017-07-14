package com.everve.kata.shoppingkart.domain;

import com.everve.kata.shoppingkart.domain.quantity.Quantity;

public class Product<Q extends Quantity<Q>> implements Printable {
    private final String name;
    private final ReferencePricedQuantity<Q> referencePrice;

    public Product(String name, ReferencePricedQuantity<Q> referencePrice) {
        this.name = name;
        this.referencePrice = referencePrice;
    }

    public Price price(Q quantity) {
        return referencePrice.priceByReference(quantity);
    }

    public ReferencePricedQuantity referencePrice() {
        return referencePrice;
    }


    @Override
    public String print() {
        return name;
    }
}
