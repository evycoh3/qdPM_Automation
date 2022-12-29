package com.factories;

import com.constants.FrameworkConstants;
import com.driver.DriverManager;
import com.enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public final class ExplicitWaitFactory {
    private ExplicitWaitFactory(){}

    public static WebElement performExplicit(By by, WaitStrategy waitStrategy){
        WebElement element = null;
        if(waitStrategy==WaitStrategy.CLICKABLE){
            element=getWait().until(ExpectedConditions.elementToBeClickable(by));
        }
        else if(waitStrategy==WaitStrategy.VISIBLE){
            element=getWait().until(ExpectedConditions.visibilityOfElementLocated(by));
        }
        else if(waitStrategy==WaitStrategy.PRESENCE){
            element=getWait().until(ExpectedConditions.presenceOfElementLocated(by));
        }
        else if(waitStrategy==WaitStrategy.NONE){
            element=DriverManager.getDriver().findElement(by);
        }
        return element;
    }


    private static WebDriverWait getWait(){
        WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getExplicitWait()));
        wait.pollingEvery(Duration.ofMillis(FrameworkConstants.getExplicitMilliSecWait()));
        wait.ignoring(StaleElementReferenceException.class).ignoring(NoSuchElementException.class);
        return wait;
    }
}
