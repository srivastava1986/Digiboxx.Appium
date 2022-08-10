package com.Tests;

import com.TestSessionInitiator.ResessionTestSessionInitiator;
import com.TestSessionInitiator.TestSessionInitiator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UploadSingleImageTest {
    TestSessionInitiator test;
    //ResessionTestSessionInitiator test;

    @BeforeClass
    public void startsession(){
        //extenttest=extent.createTest("Upload Single Image Test Case");
        //test=new ResessionTestSessionInitiator();
        test=new TestSessionInitiator();
    }

    @Test
    public void step01_LaunchApplication_and_skip_presentation(){
        //extenttest=extent.createTest("Upload Single Image Test Case");
        test.loginPage.skippresentation();
    }

    @Test(dependsOnMethods = "step01_LaunchApplication_and_skip_presentation")
    public void step02_Click_Continue(){
        test.loginPage.clickContinue();
    }

    @Test(dependsOnMethods = "step02_Click_Continue")
    public void step03_enter_your_credentials(){
        test.loginPage.enterLoginCredentials();
    }

    @Test(dependsOnMethods = "step03_enter_your_credentials")
    //@Test
    public void step04_uploadingSingleImage() {
        //extenttest=extent.createTest(getClass().getSimpleName());
        test.uploadSingleImage.upload_single_image_file();


    }
}

