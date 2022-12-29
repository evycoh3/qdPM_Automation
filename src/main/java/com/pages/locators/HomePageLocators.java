package com.pages.locators;


import org.openqa.selenium.By;

public final class HomePageLocators {
    private HomePageLocators(){}
    private static final By NAVBAR_USER= By.cssSelector("ul.pull-right");
    private static final By BTN_LOGOUT=By.xpath("//a[text()=' Logoff']");

    private static final String BTN_SIDE_NAVBAR="//ul[@class='page-sidebar-menu']/li/a/span[@class='title'][text()='%value%']";
    private static final String BTN_SUB_SIDE_NAVBAR="//ul[@class='page-sidebar-menu']/li//ul//span[@class='title'][text()='%value%']";


    public static By getNavbarUser() {
        return NAVBAR_USER;
    }

    public static By getBtnLogout() {
        return BTN_LOGOUT;
    }

    public static String getBtnSideNavbar() {
        return BTN_SIDE_NAVBAR;
    }

    public static String getBtnSubSideNavbar() {
        return BTN_SUB_SIDE_NAVBAR;
    }
}
