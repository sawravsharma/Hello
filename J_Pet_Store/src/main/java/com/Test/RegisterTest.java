package com.Test;

import org.testng.annotations.Test;

public class RegisterTest extends TestBase{
    public  RegisterTest(){
        super();
    }
    @Test(priority=0)
    public void register_details() {
        obje.getRegister().register();
    }
}
