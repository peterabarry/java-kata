package com.everve.kata.shoppingkart.domain;

import com.everve.kata.shoppingkart.domain.quantity.Quantity;

public class ReferencePricedQuantity<Q extends Quantity<Q>> implements Printable {

    private final Q referenceQuantity;
    private final Price referencePrice;


    public ReferencePricedQuantity(Q referenceQuantity, Price referencePrice) {
        this.referenceQuantity = referenceQuantity;
        this.referencePrice = referencePrice;
    }

    public Price priceByReference(Q quantityToPrice) {
        return quantityToPrice.price(this.referenceQuantity, this.referencePrice);
    }

    public String print() {
        String print = this.referenceQuantity.print();
        if (!"".equals(print)) {
            print = "( " + print + " @ " + referencePrice.print() + ")\n";
        }
        return print;
    }
}
