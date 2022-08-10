package com.Tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class AExtentReportReporter {

    ExtentReports extent;
    ExtentSparkReporter spark;
    ExtentTest extenttest;


    @BeforeSuite
    public void ExtentInitiator(){
        spark=new ExtentSparkReporter("target/DigiBoxx_mobile.html");
        extent=new ExtentReports();
        extent.attachReporter(spark);



    }

    @AfterMethod
    public void getResults(ITestResult results){

        if(results.getStatus()==ITestResult.FAILURE){
            extenttest.fail(MarkupHelper.createLabel(results.getName()+"Test Case failed", ExtentColor.RED));
            extenttest.fail(results.getThrowable());

        }else if(results.getStatus()==ITestResult.SUCCESS){
            extenttest.pass(MarkupHelper.createLabel(results.getName()+"Test Case passed", ExtentColor.GREEN));

        }else{
            extenttest.skip(MarkupHelper.createLabel(results.getName()+"Test Case skipped", ExtentColor.YELLOW));
            extenttest.skip(results.getThrowable());
        }
    }

    @AfterSuite
    public void teardown(){
        extent.flush();
    }





   

}
