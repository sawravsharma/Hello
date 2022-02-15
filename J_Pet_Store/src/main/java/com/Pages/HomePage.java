package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.Test.TestBase.driver;

public class HomePage extends ObjFactory {
    @FindBy(xpath = "//img[@src='../images/fish_icon.gif']")
    WebElement Fish;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    public String verify_url(){
        return  driver.getCurrentUrl();
    }
    public String verify_user(){
        return driver.getTitle();
    }
    public void homeP(){
        Fish.click();
    }
}
