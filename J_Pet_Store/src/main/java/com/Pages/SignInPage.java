package com.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import static com.Test.TestBase.driver;
import static com.Test.TestBase.prop;

public class SignInPage extends ObjFactory {

    @FindBy(xpath="//input[@name ='username']")
    WebElement username;

    @FindBy(xpath="//input[@name ='password']")
    WebElement password;

    @FindBy(id="signon")
    WebElement loginbutton;

    @FindBy(xpath="//*[@id=\"Catalog\"]/a")
    WebElement registernow;

    public SignInPage(){
        PageFactory.initElements(driver, this);
    }
    public void signIn() {
        username.sendKeys(prop.getProperty("uname"));
        username.clear();
        password.sendKeys(prop.getProperty("pword"));
        loginbutton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        registernow.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void registerNow(){
        registernow.click();
    }
}
