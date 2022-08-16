package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class DeleteProfilePictureActions extends GetPage {
    public DeleteProfilePictureActions(AndroidDriver driver) {
        super(driver, "DeleteProfilePictureTest");
    }

    public void delete_profile_picture(){
        element("profileicon").click();
        element("clickonprofileimage").click();
        element("removeprofilepicture").click();
        element("yesbutton").click();
        element("backtohome").click();

    }
}
