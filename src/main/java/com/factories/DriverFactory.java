package com.factories;

import com.enums.BrowserType;
import com.enums.ConfigProperties;
import com.utils.PropertyUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class DriverFactory {
    private DriverFactory(){}

    public static WebDriver getDriver(){
        WebDriver driver=null;
        String browser= PropertyUtils.getValue(ConfigProperties.BROWSER);
        if(browser.equalsIgnoreCase(String.valueOf(BrowserType.CHROME))){
            driver=WebDriverManager.chromedriver().create();

        }
        else if(browser.equalsIgnoreCase(String.valueOf(BrowserType.EDGE))){
           driver=WebDriverManager.edgedriver().create();
        }
        return driver;
    }
}
