package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class SubFolderUploadVideoActions extends GetPage {
    public SubFolderUploadVideoActions(AndroidDriver driver) {
        super(driver, "SubFolderUploadVideoTest");
    }

    public void upload_video_in_sub_folder() {
        element("subfoldername").click();
        element("addbutton").click();
        element("uploadfilebutton").click();
        element("show_roots").click();
        element("videos").click();
        element("dcim").click();
        element("selectvideo1").click();
        element("open").click();
    }
}
