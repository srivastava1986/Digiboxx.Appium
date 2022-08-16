package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class ChangeProfilePictureActions extends GetPage {
    public ChangeProfilePictureActions(AndroidDriver driver) {
        super(driver, "ChangeProfilePictureTest");
    }

    public void change_profile_picture(){
        element("profileicon").click();
        element("clickonprofileimage").click();
        element("galleryicon").click();
        element("selectimage2").click();
        element("openoptions").click();
        element("selectprofilepicture").click();
        element("backtohome").click();
    }
}


