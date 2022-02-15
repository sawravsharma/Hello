package com.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest  extends TestBase {
    String title;
    String user;
    public HomeTest() {
        super();
    }
    @Test
    public void CheckUrl(){
        title = hom.getClickFish().verify_url();
        Assert.assertEquals(title, "https://petstore.octoperf.com/actions/Catalog.action");
    }
    @Test
    public void CheckUser(){
        user = hom.getClickFish().verify_user();
        Assert.assertEquals(user, "Welcome Saurav");
    }
    @Test
    public void register_Fish(){
        hom.getClickFish().homeP();
    }
}
