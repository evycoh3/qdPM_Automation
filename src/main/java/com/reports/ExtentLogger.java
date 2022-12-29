package com.reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.enums.ConfigProperties;
import com.utils.PropertyUtils;
import com.utils.ScreenshotUtils;

public  final class ExtentLogger {

    private ExtentLogger(){}

    public static void pass(String msg){
        ExtentManager.getExtentTest().pass(msg);
    }
    public static void fail(String msg){
        ExtentManager.getExtentTest().fail(msg);
    }
    public static void skip(String msg){
        ExtentManager.getExtentTest().skip(msg);
    }
    public static void pass(String msg,boolean screenshotNeeded){
        if(PropertyUtils.getValue(ConfigProperties.PASS_SCREENSHOT).equalsIgnoreCase("yes") &&screenshotNeeded){
            ExtentManager.getExtentTest().pass(msg,MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64img()).build());
        }
    }
    public static void fail(String msg,boolean screenshotNeeded){
        if(PropertyUtils.getValue(ConfigProperties.FAIL_SCREENSHOT).equalsIgnoreCase("yes") && screenshotNeeded){
            ExtentManager.getExtentTest().fail(msg,MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64img()).build());
        }
    }
    public static void skip(String msg,boolean screenshotNeed){
        if(PropertyUtils.getValue(ConfigProperties.SKIP_SCREENSHOT).equalsIgnoreCase("yes") &&screenshotNeed) {
            ExtentManager.getExtentTest().skip(msg, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64img()).build());
        }
    }
}
