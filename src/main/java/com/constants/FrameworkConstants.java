package com.constants;

import com.enums.ConfigProperties;
import com.utils.PropertyUtils;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public final class FrameworkConstants {
    private FrameworkConstants(){}

    private static final int IMPLICIT_WAIT=10;
    private static final int PAGE_LOAD_TIME=10;
    private static final int EXPLICIT_WAIT=12;
    private static final int EXPLICIT_MILLI_SEC_WAIT=250;
    private static final String PROPERTY_FILE_PATH=System.getProperty("user.dir")+"/src/main/resources/config.properties";
    private static final String EXCEL_FILE_PATH=System.getProperty("user.dir")+"/src/main/resources/Book1.xlsx";
    private static final String JSON_FILE_PATH=System.getProperty("user.dir")+"/src/main/resources/data.json";

    private static final String REPORT_FILE_PATH="test-outputs";

    public static int getPageLoadTime() {
        return PAGE_LOAD_TIME;
    }

    public static int getImplicitWait() {
        return IMPLICIT_WAIT;
    }

    public static String getPropertyFilePath() {
        return PROPERTY_FILE_PATH;
    }

    public static int getExplicitWait() {
        return EXPLICIT_WAIT;
    }

    public static int getExplicitMilliSecWait() {
        return EXPLICIT_MILLI_SEC_WAIT;
    }

    public static String getExcelFilePath() {
        return EXCEL_FILE_PATH;
    }
    public static String getReportFilePathFilePath(){
        if(PropertyUtils.getValue(ConfigProperties.OVER_RIDE_REPORTS).equalsIgnoreCase("yes")){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd_hh_mm_ss");
            LocalDateTime now = LocalDateTime.now();
            String dateTime = dtf.format(now);
            return REPORT_FILE_PATH+"/"+dateTime+".html";
        }
        else{
            return REPORT_FILE_PATH+"/index.html";
        }
    }

    public static String getJsonFilePath() {
        return JSON_FILE_PATH;
    }
}
