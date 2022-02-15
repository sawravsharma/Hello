package com.Test;

import org.testng.annotations.Test;

public class FishTest extends TestBase {
    public FishTest() {
        super();
    }

    @Test
    public void clickOnFish() {
        objec.getFish().addFish();
    }
}
