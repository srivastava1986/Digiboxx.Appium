package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class SubFolderUploadImageActions extends GetPage {
    public SubFolderUploadImageActions(AndroidDriver driver) {
        super(driver, "SubFolderUploadImageTest");
    }

    public void upload_image_in_sub_folder() {
            element("subfoldername").click();
            element("addbutton").click();
            element("uploadfilebutton").click();
            element("show_roots").click();
            element("images").click();
            element("dcim").click();
            element("selectimage1").click();
            element("open").click();
    }
}