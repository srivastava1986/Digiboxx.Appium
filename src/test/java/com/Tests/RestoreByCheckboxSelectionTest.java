package com.Tests;

import com.TestSessionInitiator.TestSessionInitiator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RestoreByCheckboxSelectionTest {
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
    public void step04_uploadingMultipleImage() {
        test.uploadMultipleImages.upload_multiple_images_file();
        test.uploadMultipleImages.upload_multiple_images_file();
    }

    @Test(dependsOnMethods = "step04_uploadingMultipleImage")
    public void step05_select_all_checkbox() {
        test.selectAllCheckbox.select_all_checkbox();

    }

    @Test(dependsOnMethods = "step05_select_all_checkbox")
    public void step06_restore_by_checkbox_selection() {
        test.restoreByCheckboxSelection.restore_by_checkbox_selection();
    }

}
