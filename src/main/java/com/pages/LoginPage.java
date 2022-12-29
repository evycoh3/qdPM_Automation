package com.pages;

import com.pages.locators.LoginPageLocators;

public class LoginPage extends BasePage{

    public String getTitle(){
        return getPageTitle();
    }

    public LoginPage setEmail(String email){
        sendKeys(LoginPageLocators.getTextboxEmail(),email,"email");
        return this;
    }
    public LoginPage setPassword(String password){
        sendKeys(LoginPageLocators.getTextboxPassword(),password,"password");
        return this;
    }
    public HomePage clickLogin(){
        click(LoginPageLocators.getBtnLogin(),"login btn");
        return new HomePage();
    }

}
