package com.Pages;

public class ObjFactory {
    private SignInPage obj;
    private RegisterPage obje;
    private FishPage objec;
    private HomePage hom;
    private AddToCartPage atc;

    public SignInPage getSignIn() {
        if (obj == null) {
            obj = new SignInPage();
        }
        return obj;
    }
    public RegisterPage getRegister(){
        if (obje == null){
            obje = new RegisterPage();
        }
        return obje;
    }
    public HomePage getClickFish(){
        if ( hom == null){
            hom = new HomePage();
        }
        return hom;
    }
    public FishPage getFish(){
        if (objec == null){
            objec = new FishPage();
        }
        return objec;
    }
    public AddToCartPage getaddToCart(){
        if (atc == null){
            atc = new AddToCartPage();
        }
        return atc;
    }
}
