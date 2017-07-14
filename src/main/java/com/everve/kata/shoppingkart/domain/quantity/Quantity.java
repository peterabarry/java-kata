package com.everve.kata.shoppingkart.domain.quantity;

import com.everve.kata.shoppingkart.domain.Price;
import com.everve.kata.shoppingkart.domain.Printable;

public interface Quantity<Q extends Quantity<Q>> extends Printable {

    Price price(Q referenceQuantity, Price referencePrice);

}
