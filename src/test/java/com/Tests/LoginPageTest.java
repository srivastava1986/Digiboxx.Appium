package com.Tests;

import com.TestSessionInitiator.TestSessionInitiator;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.utilities.extentReport;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTest {
    TestSessionInitiator test;
    extentReport extentReport;


    //TestSessionInitiator testSessionInitiator;
    //ExtentReports extent=new ExtentReports();
    //ExtentSparkReporter spark = new ExtentSparkReporter("target/DigiBoxx.html");

    public static final String USERNAME = System.getenv("BROWSERSTACK_USERNAME");
    public static final String AUTOMATE_KEY = System.getenv("BROWSERSTACK_ACCESS_KEY");
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    @BeforeClass
    public void startsession(){

        test=new TestSessionInitiator();
        extentReport=new extentReport();
    }

    @Test
    public void step01_LaunchApplication_and_skip_presentation(){
        test.loginPage.skippresentation();

    }

    @Test
    public void step02_Click_Continue(){
        test.loginPage.clickContinue();

    }
    @Test
    public void step03_enter_your_credentials(){
         test.loginPage.enterLoginCredentials();
//        ExtentTest extenttest=extent.createTest("Login into the application");
//        extentReport.extenthandler().createTest();
//
//
//
//        if(value){
//            Assert.assertTrue(value,"This test step is passed");
//            extenttest.pass("passed");
//            // extenttest.log(Status.PASS,"The test is passed");
//
//        }else {
//            //extent.createTest("Login into the application").log(Status.FAIL,"The actual is not as expected");
//            Assert.assertFalse(value,"failed test case");
//            extenttest.fail("failed");
            //extenttest.log(Status.FAIL,"The test is failed");
//        }
    }


}
