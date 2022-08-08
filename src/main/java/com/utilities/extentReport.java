package com.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReport {

    //ExtentReports extent=new ExtentReports();
    ExtentSparkReporter spark= new ExtentSparkReporter("target/DigiBoxx.html");

    public extentReport(){

    }

    public ExtentReports extenthandler(){
        return new ExtentReports();
    }
}
