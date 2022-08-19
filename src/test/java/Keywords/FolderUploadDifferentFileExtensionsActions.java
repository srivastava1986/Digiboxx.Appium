package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class FolderUploadDifferentFileExtensionsActions extends GetPage {
    public FolderUploadDifferentFileExtensionsActions(AndroidDriver driver) {
        super(driver, "FolderUploadDifferentFileExtensionsTest");
    }

    public void upload_different_file_extentions_in_folder(){
        element("addbutton").click();
        element("createfolderoption").click();
        element("typefoldername").sendKeys("FolderD");
        element("createfolderbutton").click();
        element("clickonfolder").click();
        element("addbutton").click();
        element("uploadfilebutton").click();
        element("show_roots").click();
        element("images").click();
        element("clickdcim").click();
        element("selectimage1").click();
        element("selectgifimage").click();
        element("open").click();
        element("homeicon").click();
    }
}
