package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class UpdateProfilePictureActions extends GetPage {
    public UpdateProfilePictureActions(AndroidDriver driver) {
        super(driver, "UpdateProfilePictureTest");
    }

    public void update_profile_picture(){
        element("profileicon").click();
        element("clickonprofileimage").click();
        element("galleryicon").click();
        element("selectimage1").click();
        element("openoptions").click();
        element("selectprofilepicture").click();
        element("clickonprofileimage").click();
        element("backbutton").click();
        element("backtohome").click();


    }
}
