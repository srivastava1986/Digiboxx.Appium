package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class UploadingGIFActions extends GetPage {
    public UploadingGIFActions(AndroidDriver driver) {
        super(driver, "UploadingGIFTest");
    }

    public void Upload_gif_file()
    {
        element("addbutton").click();
        element("uploadfilebutton").click();
        element("show_roots").click();
        element("images").click();
        element("dcim").click();
        element("selectgifimage").click();

    }
}
