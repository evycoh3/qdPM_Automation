package com.pages;

import com.driver.DriverManager;
import com.enums.LogType;
import com.enums.WaitStrategy;
import com.factories.ExplicitWaitFactory;
import com.reports.FrameworkLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class BasePage {
    protected String getPageTitle() {
        var title = DriverManager.getDriver().getTitle();
        FrameworkLogger.log(LogType.EXTENTANDCONSOLE, "Page Title: " + title);
        return title;
    }

    protected void sendKeys(By by, String value, String fieldName) {
        WebElement element = ExplicitWaitFactory.performExplicit(by, WaitStrategy.PRESENCE);
        element.sendKeys(value);
        FrameworkLogger.log(LogType.EXTENTANDCONSOLE, "Send keys to " + fieldName + ":" + value);
    }

    protected void click(By by, String fieldName) {
        WebElement element = ExplicitWaitFactory.performExplicit(by, WaitStrategy.CLICKABLE);
        element.click();
        FrameworkLogger.log(LogType.EXTENTANDCONSOLE, "Clicked on " + fieldName);

    }

    protected void customSelect(By by, String value, String fieldName) {
        Select select = new Select(ExplicitWaitFactory.performExplicit(by, WaitStrategy.VISIBLE));
        List<WebElement> list = select.getOptions();
        for (WebElement element : list) {
            if (element.getText().equalsIgnoreCase(value)) {
                element.click();
                break;
            }
        }
        FrameworkLogger.log(LogType.EXTENTANDCONSOLE, "selected " + value + "from " + fieldName + " dropdown");


    }

    protected void selectMultipleCheckboxes(By by, String fieldName, String... value) {
        ArrayList<String> items = new ArrayList<>();

        List<WebElement> list = DriverManager.getDriver().findElements(by);
        if (!value[0].equalsIgnoreCase("All")) {
            for (WebElement element : list) {
                String str = element.getText();
                for (String s : value) {
                    if (s.equalsIgnoreCase(str)) {
                        items.add(str);
                        element.click();
                        break;
                    }
                }
            }
            FrameworkLogger.log(LogType.EXTENTANDCONSOLE, "select " + items + " from " + fieldName);
        } else {
            for (WebElement element : list) {
                element.click();
                items.add(element.getText());
            }
            FrameworkLogger.log(LogType.EXTENTANDCONSOLE, "Selected : " + items.toString() + "from " + fieldName);

        }


    }

    public boolean isDisplay(By by, String fieldName) {
        WebElement element = ExplicitWaitFactory.performExplicit(by, WaitStrategy.VISIBLE);
        try {
            element.isDisplayed();
            FrameworkLogger.log(LogType.EXTENTANDCONSOLE, fieldName + " Is Displayed");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            FrameworkLogger.log(LogType.EXTENTANDCONSOLE, fieldName + " Is not displayed");
            return false;
        }

    }

}
