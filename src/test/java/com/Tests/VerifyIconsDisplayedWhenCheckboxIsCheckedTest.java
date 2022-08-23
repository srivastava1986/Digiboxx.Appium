package com.Tests;

import com.TestSessionInitiator.TestSessionInitiator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyIconsDisplayedWhenCheckboxIsCheckedTest {
    TestSessionInitiator test;

    @BeforeClass
    public void startsession() {
        test = new TestSessionInitiator();
    }

    @Test
    public void LaunchApplication_and_skip_presentation() {
        test.loginPage.skippresentation();
    }

    @Test(dependsOnMethods = "LaunchApplication_and_skip_presentation")
    public void Click_Continue() {
        test.loginPage.clickContinue();
    }

    @Test(dependsOnMethods = "Click_Continue")
    public void enter_your_credentials() {
        test.loginPage.enterLoginCredentials();
    }

    @Test(dependsOnMethods = "enter_your_credentials")
    public void verify_Icons_Displayed_When_Checkbox_Is_Checked() {
        test.verifyIconsDisplayedWhenCheckboxIsChecked.verify_Icons_Displayed_When_Checkbox_Is_Checked();

    }
}
