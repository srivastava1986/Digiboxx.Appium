package com.Tests;

import com.TestSessionInitiator.TestSessionInitiator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateFolderTest {
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
    public void step04_createfolder() {
        test.createfolder.create_folder();
    }

    @Test(dependsOnMethods = "step04_createfolder")
    public void step05_delete_from_checkbox_selection(){
        test.deleteFromCheckboxSelection.delete_from_checkbox_selection();
    }

}

