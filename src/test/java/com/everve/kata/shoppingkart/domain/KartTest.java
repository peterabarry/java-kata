package com.everve.kata.shoppingkart.domain;

import com.everve.kata.shoppingkart.Kart;
import com.everve.kata.shoppingkart.domain.quantity.GrammesQuantity;
import com.everve.kata.shoppingkart.domain.quantity.UnitQuantity;
import org.junit.Assert;
import org.junit.Test;

public class KartTest {


    @Test
    public void testTotal() throws Exception {

        Kart kart = new Kart();

        Product<UnitQuantity> cornflakes = new Product<>("Cornflakes", new ReferencePricedQuantity<>(UnitQuantity.ONE, Price.of(1.25)));
        Product<GrammesQuantity> fish = new Product<>("Fish", new ReferencePricedQuantity<>(new GrammesQuantity(100), Price.of(2.50)));

        kart.add(cornflakes, UnitQuantity.of(2));
        kart.add(fish, new GrammesQuantity(2));
        Assert.assertEquals("£2.55", kart.total());
    }

    @Test
    public void testReceipt() throws Exception {

        Kart kart = new Kart();

        Product<UnitQuantity> cornflakes = new Product<>("Cornflakes", new ReferencePricedQuantity<>(UnitQuantity.ONE, Price.of(1.25)));
        Product<GrammesQuantity> fish = new Product<>("Fish", new ReferencePricedQuantity<>(new GrammesQuantity(100), Price.of(2.50)));

        kart.add(cornflakes, UnitQuantity.of(2));
        kart.add(fish, new GrammesQuantity(2));
        // @formatter:off
        String reciept =
                        "Cornflakes          £2.50\n"   +
                        "Fish 2g             £0.05\n"   +
                        "( 100g @ £2.50)\n"             +
                        "-------------------------\n"   +
                        "Total:              £2.55";
        // @formatter:on
        Assert.assertEquals(reciept, kart.receipt());
    }

}
