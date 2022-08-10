package com.Tests;

import Keywords.RenameFolderActions;
import com.TestSessionInitiator.TestSessionInitiator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RenameFolderTest {
    TestSessionInitiator test;

    @BeforeClass
    public void startsession() {
        test = new TestSessionInitiator();
    }

    @Test
    public void step01_LaunchApplication_and_skip_presentation() {
        test.loginPage.skippresentation();
    }

    @Test(dependsOnMethods = "step01_LaunchApplication_and_skip_presentation")
    public void step02_Click_Continue() {
        test.loginPage.clickContinue();
    }

    @Test(dependsOnMethods = "step02_Click_Continue")
    public void step03_enter_your_credentials() {
        test.loginPage.enterLoginCredentials();
    }

    @Test(dependsOnMethods = "step03_enter_your_credentials")
    public void step04_renameFolder() {
        test.renameFolder.rename_folder();
    }

}