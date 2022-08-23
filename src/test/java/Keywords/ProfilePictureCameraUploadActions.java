package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class ProfilePictureCameraUploadActions extends GetPage {
    public ProfilePictureCameraUploadActions(AndroidDriver driver) {
        super(driver, "ProfilePictureCameraUploadTest");
    }

    public void profile_picture_camera_upload() {
        element("profileicon").click();
        element("camera").click();
        element("clickcamera").click();
        element("shutterbutton").click();//need to automate
        element("donebutton").click();
        element("rotate").click();
        element("select").click();
        element("backtohome").click();
    }
}