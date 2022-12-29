package com.driver;

import com.constants.FrameworkConstants;
import com.enums.ConfigProperties;
import com.factories.DriverFactory;
import com.utils.PropertyUtils;

import java.time.Duration;
import java.util.Objects;

public final class Driver {
    private Driver() {
    }

    public static void init() {
        if(Objects.isNull(DriverManager.getDriver())) {
            DriverManager.setDriver(DriverFactory.getDriver());
            DriverManager.getDriver().manage().window().maximize();
            DriverManager.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(FrameworkConstants.getPageLoadTime()));
            DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(FrameworkConstants.getImplicitWait()));
            DriverManager.getDriver().get(PropertyUtils.getValue(ConfigProperties.URL));
        }
    }



    public static void quit() {
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
