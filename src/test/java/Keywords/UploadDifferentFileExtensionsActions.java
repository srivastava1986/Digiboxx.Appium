package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class UploadDifferentFileExtensionsActions extends GetPage {
    public UploadDifferentFileExtensionsActions(AndroidDriver driver) {
        super(driver,"UploadDifferentFileExtensionsTest");
    }

    public void upload_different_file_extensions(){
        element("addbutton").click();
        element("uploadfilebutton").click();
        element("show_roots").click();
        element("images").click();
        element("clickdcim").click();
        element("selectimage1").click();
        element("selectgifimage").click();
        element("open").click();

    }
}
