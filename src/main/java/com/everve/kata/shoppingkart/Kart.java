package com.everve.kata.shoppingkart;

import com.everve.kata.shoppingkart.domain.Price;
import com.everve.kata.shoppingkart.domain.Product;
import com.everve.kata.shoppingkart.domain.ProductQuantity;
import com.everve.kata.shoppingkart.domain.quantity.Quantity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Kart {

    private List<ProductQuantity> quantitiesOfProducts = new ArrayList<>();

    public <Q extends Quantity<Q>> void add(Product<Q> product, Q quantityOfProduct) {
        quantitiesOfProducts.add(new ProductQuantity<>(product, quantityOfProduct));
    }

    public String total(){
        List<Price> prices = quantitiesOfProducts.stream().map(ProductQuantity::price).collect(Collectors.toList());
        return Price.sum(prices).print();
    }

    public String receipt() {
        StringBuilder builder = new StringBuilder();
        for (ProductQuantity quantityOfProduct : quantitiesOfProducts) {
            builder.append(quantityOfProduct.print());
        }
        builder.append("-------------------------\n");
        builder.append(String.format("Total:         %10s", total()));
        return builder.toString();
    }
}
