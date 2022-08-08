package com.Tests;

import com.TestSessionInitiator.TestSessionInitiator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UploadMultipleImagesTest {
    TestSessionInitiator test;

    @BeforeClass
    public void startsession(){
        test=new TestSessionInitiator();
    }

    @Test
    public void step01_LaunchApplication_and_skip_presentation(){
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
    public void step04_uploadingMultipleImages() {
        test.uploadMultipleImages.upload_multiple_images_file();
    }
}
