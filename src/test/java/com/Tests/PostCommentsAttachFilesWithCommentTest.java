package com.Tests;

import com.TestSessionInitiator.TestSessionInitiator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PostCommentsAttachFilesWithCommentTest {
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
    public void step04_upload_single_image() {
        test.uploadSingleImage.upload_single_image_file();
    }

    @Test(dependsOnMethods = "step04_upload_single_image")
    public void step05_post_comments_attach_files() {
        test.postCommentsAttachFilesWithComment.post_comments_attach_files();

    }
}
