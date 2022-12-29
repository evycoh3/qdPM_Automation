package com.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.constants.FrameworkConstants;
import com.enums.ConfigProperties;
import com.utils.PropertyUtils;

import java.awt.*;
import java.io.File;
import java.util.Objects;

public class ExtentReport {
    private ExtentReport() {
    }

    private static ExtentReports extent;

    public static void initReports() {
        if (Objects.isNull(extent)) {
            extent = new ExtentReports();
            extent.setSystemInfo("OS",System.getProperty("os.name"));
            extent.setSystemInfo("Java Version",System.getProperty("java.version"));
            extent.setSystemInfo("Browser", PropertyUtils.getValue(ConfigProperties.BROWSER));
            extent.setSystemInfo("URL",PropertyUtils.getValue(ConfigProperties.URL));
            extent.setSystemInfo("User","evy");
            ExtentSparkReporter spark = new ExtentSparkReporter(FrameworkConstants.getReportFilePathFilePath());
            extent.attachReporter(spark);
            spark.config().setDocumentTitle("qdPM report");
            spark.config().setReportName("qdPM Tests");
            spark.config().setTheme(Theme.DARK);
        }
    }
    public static void flushReports(){
        if(Objects.nonNull(extent)){
            extent.flush();
        }
        ExtentManager.unload();
    }
    public static void createTest(String testName){
        ExtentManager.set(extent.createTest(testName));
    }
}
