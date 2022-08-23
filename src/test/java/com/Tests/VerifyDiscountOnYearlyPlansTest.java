package com.Tests;

import com.TestSessionInitiator.TestSessionInitiator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyDiscountOnYearlyPlansTest {
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
    public void verify_Discount_On_Yearly_Plans() {
        test.verifyDiscountOnYearlyPlans.verify_Discount_On_Yearly_Plans();

    }
}
