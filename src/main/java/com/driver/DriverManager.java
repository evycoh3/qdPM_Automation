package com.driver;

import org.openqa.selenium.WebDriver;

public class DriverManager{
    private DriverManager(){}
    private static ThreadLocal<WebDriver>driver=new ThreadLocal<>();

    public static WebDriver getDriver(){
        return driver.get();
    }

    public static void setDriver(WebDriver driverInstance) {
        driver.set(driverInstance);
    }
    public static void unload(){
        driver.remove();


    }
}
