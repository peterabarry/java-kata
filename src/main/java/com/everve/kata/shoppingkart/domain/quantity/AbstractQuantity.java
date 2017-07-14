package com.everve.kata.shoppingkart.domain.quantity;

import com.everve.kata.shoppingkart.domain.Price;

abstract class AbstractQuantity<Q extends AbstractQuantity<Q>> implements Quantity<Q> {


    @SuppressWarnings("WeakerAccess")
    protected int discreteQuantity;

    AbstractQuantity(int discreteQuantity) {
        this.discreteQuantity = discreteQuantity;
    }

    @Override
    public Price price(Q referenceQuantity, Price referencePrice) {
        return referencePrice.multiply((double) discreteQuantity / (double) referenceQuantity.discreteQuantity);
    }


}
