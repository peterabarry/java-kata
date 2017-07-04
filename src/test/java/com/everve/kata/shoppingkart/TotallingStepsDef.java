package com.everve.kata.shoppingkart;

import cucumber.api.java8.En;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;

public class TotallingStepsDef implements En {

    private ShoppingKart kart;

    public TotallingStepsDef() {
        Given("An Empty Shopping Kart",
                () -> kart = new ShoppingKart());

        Then("The total is £0.00",
                () -> Assert.assertThat(
                        kart.total(),
                        CoreMatchers.equalTo("£0.00")
                ));
    }
}