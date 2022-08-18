package com.Tests;

import com.TestSessionInitiator.TestSessionInitiator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SanityTest extends AExtentReportReporter {
    TestSessionInitiator test;

    @BeforeClass
    public void session() {
        test = new TestSessionInitiator();
    }

    @Test
    public void Login() {
        extenttest = extent.createTest("Login & Skip Presentation");
        test.loginPage.skippresentation();
        test.loginPage.clickContinue();
        test.loginPage.enterLoginCredentials();
//        Boolean B=test.loginPage.validateDashboardTitle();
//        Assert.assertTrue(B);


    }

//    @Test(dependsOnMethods = "Login")
//    public void UploadSingleImage(){
//        test.uploadSingleImage.upload_single_image_file();
//    }

//    @Test(dependsOnMethods = "UploadSingleImage")
//    public void UploadSingleVideo(){
//        test.uploadSingleVideo.upload_single_video_file();
//    }
//
//    @Test(dependsOnMethods = "UploadSingleVideo")
//    public void CreateFolder(){
//        test.createfolder.create_folder();
//    }
//
//    @Test(dependsOnMethods = "CreateFolder")
//    public void ChangeFolderColor(){
//        test.changeColorOfFolder.change_color_of_folder();
//    }



//    @Test(dependsOnMethods = "Login")
//    public void  deleteFromRecycleBin(){
//        extenttest = extent.createTest("Delete files from recycle bin");
//        test.deleteFromRecycleBin.delete_from_recycle_bin();
//    }
//
//    @Test(dependsOnMethods = "deleteFromRecycleBin")
//    public void updateProfilePicture() {
//        extenttest = extent.createTest("Update profile picture when no picture is set");
//        test.updateProfilePicture.update_profile_picture();
//
//    }
//    @Test(dependsOnMethods = "updateProfilePicture")
//    public void changeProfilePicture()  {
//        extenttest = extent.createTest("Change profile picture with a new one");
//        test.changeProfilePicture.change_profile_picture();
//    }
//
//    @Test(dependsOnMethods = "changeProfilePicture")
//    public void deleteProfilePicture(){
//        extenttest = extent.createTest("Delete profile picture");
//        test.deleteProfilePicture.delete_profile_picture();
//    }

    @Test(dependsOnMethods = "Login")
    public void  restore_by_checkbox_selection(){
        extenttest = extent.createTest("Restore files by checkbox selection");
        test.uploadSingleImage.upload_single_image_file();
        test.uploadMultipleImages.upload_multiple_images_file();
        test.selectAllCheckbox.select_all_checkbox();
        test.restoreByCheckboxSelection.restore_by_checkbox_selection();
    }

    @Test(dependsOnMethods = "restore_by_checkbox_selection")
    public void check_add_button_enabled_in_myboxx() {
        extenttest = extent.createTest("Add button enabled in MyBoxx");
        test.checkAddButtonEnabledInMyBoxx.check_add_button_enabled_in_myboxx();

    }
    @Test(dependsOnMethods = "check_add_button_enabled_in_myboxx")
    public void check_add_button_disabled_in_quick_access()  {
        extenttest = extent.createTest("Add button disabled in Quick Access");
        test.checkAddButtonDisabledInQuickAccess.check_add_button_disabled_in_quick_access();
    }

    @Test(dependsOnMethods = "check_add_button_disabled_in_quick_access")
    public void check_add_button_disabled_in_recycle_bin()  {
        extenttest = extent.createTest("Add button disabled in Recycle Bin");
        test.checkAddButtonDisabledInRecycleBin.check_add_button_disabled_in_recycle_bin();
    }

    @Test(dependsOnMethods = "check_add_button_disabled_in_recycle_bin")
    public void check_add_button_disabled_in_starred(){
        extenttest = extent.createTest("Add button disabled in Starred");
        test.checkAddButtonDisabledInStarred.check_add_button_disabled_in_starred();
    }

    @Test(dependsOnMethods = "check_add_button_disabled_in_starred")
    public void check_add_button_disabled_in_shared(){
        extenttest = extent.createTest("Add button disabled in Shared");
        test.checkAddButtonDisabledInShared.check_add_button_disabled_in_shared();
    }

}

