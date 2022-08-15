package com.Tests;

import com.TestSessionInitiator.TestSessionInitiator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeleteFromKebabIconTest {
    TestSessionInitiator test;

    @BeforeClass
    public void session() {
        test = new TestSessionInitiator();
    }

    @Test
    public void step01_Login() {
        test.loginPage.skippresentation();
        test.loginPage.clickContinue();
        test.loginPage.enterLoginCredentials();
    }

    @Test(dependsOnMethods = "step01_Login")
    public void step02uploadingSingleImage() {
        test.uploadSingleImage.upload_single_image_file();
    }

    @Test(dependsOnMethods = "step02uploadingSingleImage")
    public void step03_delete_from_kebab_icon() {
        test.deleteFromKebabIcon.delete_from_kebab_icon();



    }


}