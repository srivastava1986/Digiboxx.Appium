package com.Tests;

import com.TestSessionInitiator.TestSessionInitiator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SanityTest extends AExtentReportReporter{
    TestSessionInitiator test;

    @BeforeClass
    public void session(){
        test=new TestSessionInitiator();
    }

    @Test
    public void Login(){
        extenttest= extent.createTest("Login & Skip Presentation");
        test.loginPage.skippresentation();
        test.loginPage.clickContinue();
        test.loginPage.enterLoginCredentials();
    }

    @Test(dependsOnMethods = "Login")
    public void UploadSingleImage(){
        test.uploadSingleImage.upload_single_image_file();
    }

    @Test(dependsOnMethods = "UploadSingleImage")
    public void UploadSingleVideo(){
        test.uploadSingleVideo.upload_single_video_file();
    }

    @Test(dependsOnMethods = "UploadSingleVideo")
    public void CreateFolder(){
        test.createfolder.create_folder();
    }

    @Test(dependsOnMethods = "CreateFolder")
    public void ChangeFolderColor(){
        test.changeColorOfFolder.change_color_of_folder();
    }

}
