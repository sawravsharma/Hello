package com.Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class SignInTest extends TestBase {
    public  SignInTest(){
        super();
    }
    @BeforeSuite
    public void launch() throws Exception {
        launch_browser();
        obj.getSignIn();
    }
    @Test
    public void login_details(){
        obj.getSignIn().signIn();
    }
    @Test
    public void register_click(){
        obj.getSignIn().registerNow();
    }
}
