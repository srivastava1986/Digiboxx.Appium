package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class FolderUploadMultipleImagesActions extends GetPage {
    public FolderUploadMultipleImagesActions(AndroidDriver driver) {
        super(driver, "FolderUploadMultipleImagesTest");
    }

    public void folder_upload_mutilple_images(){
        element("addbutton").click();
        element("createfolderoption").click();
        element("typefoldername").sendKeys("FolderA");
        element("createfolderbutton").click();
        element("clickonfolder").click();
        element("addbutton").click();
        element("uploadfilebutton").click();
        element("show_roots").click();
        element("images").click();
        element("dcim").click();
        element("selectimage1").click();
        element("selectimage2").click();
        element("open").click();
        element("homeicon").click();
    }
}
