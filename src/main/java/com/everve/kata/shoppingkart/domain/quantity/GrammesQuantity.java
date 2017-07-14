package com.everve.kata.shoppingkart.domain.quantity;

public class GrammesQuantity extends AbstractQuantity<GrammesQuantity> {

    public GrammesQuantity(int grammes) {
        super(grammes);
    }

    public String print() {
        return this.discreteQuantity + "g";
    }


}
