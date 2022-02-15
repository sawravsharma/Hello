package com.Test;

import org.testng.annotations.Test;

public class AddToCartTest extends TestBase {
    public AddToCartTest() {
        super();
    }
    @Test
    public void addToCart_details() {
        atc.getaddToCart().cartButton();
    }
}
