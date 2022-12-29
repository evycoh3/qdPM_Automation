package com.pages.locators;

import org.openqa.selenium.By;

public final class LoginPageLocators {
    private LoginPageLocators(){}
    private static final By TEXTBOX_EMAIL= By.name("login[email]");
    private static final By TEXTBOX_PASSWORD=By.name("login[password]");
    private static final By BTN_LOGIN=By.cssSelector("button[type='submit']");


    public static By getTextboxEmail() {
        return TEXTBOX_EMAIL;
    }

    public static By getTextboxPassword() {
        return TEXTBOX_PASSWORD;
    }

    public static By getBtnLogin() {
        return BTN_LOGIN;
    }

}
