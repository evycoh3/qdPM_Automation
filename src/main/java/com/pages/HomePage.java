package com.pages;

import com.pages.locators.HomePageLocators;
import com.utils.DynamicXpathUtils;
import org.openqa.selenium.By;

public class HomePage extends BasePage{

    public LoginPage clickLogout(){
        click(HomePageLocators.getNavbarUser(),"user navbar");
        click(HomePageLocators.getBtnLogout(),"logout btn");
        return new LoginPage();
    }

    public HomePage clickOnSideNavBar(String menu){
        String main= DynamicXpathUtils.getXpath(HomePageLocators.getBtnSideNavbar(),menu);
        click(By.xpath(main),menu);
        return this;
    }
    public HomePage clickOnSubSideNavBar(String submenu){
        String main=DynamicXpathUtils.getXpath(HomePageLocators.getBtnSubSideNavbar(),submenu);
        click(By.xpath(main),submenu);
        return this;
    }

}
