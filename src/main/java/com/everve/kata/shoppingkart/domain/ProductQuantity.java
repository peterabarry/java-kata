package com.everve.kata.shoppingkart.domain;

import com.everve.kata.shoppingkart.domain.quantity.Quantity;

public class ProductQuantity<Q extends Quantity<Q>> implements Printable {

    private final Product<Q> product;
    private final Q quantity;

    public ProductQuantity(Product<Q> product, Q quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Price price() {
        return this.product.price(this.quantity);
    }

    public String print() {
        return String.format(
                "%-20s%s\n%s",
                product.print() + " " + quantity.print(),
                price().print(),
                product.referencePrice().print());
    }
}
