package com.listeners;

import com.reports.ExtentLogger;
import com.reports.ExtentReport;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener , ISuiteListener {

    @Override
    public void onStart(ISuite suite){
        ExtentReport.initReports();
    }
    @Override
    public void onFinish(ISuite suite){
        ExtentReport.flushReports();
    }
    @Override
    public void onTestStart(ITestResult result){
        ExtentReport.createTest(result.getMethod().getMethodName());
    }
    @Override
    public void onTestSuccess(ITestResult result){
        ExtentLogger.pass(result.getMethod().getMethodName()+" is passed",true);
    }
    @Override
    public void onTestFailure(ITestResult result){
        ExtentLogger.fail(result.getMethod().getMethodName()+" is failed",true);
    }
    @Override
    public void onTestSkipped(ITestResult result){
        ExtentLogger.fail(result.getMethod().getMethodName()+" is skipped",true);
    }

}
