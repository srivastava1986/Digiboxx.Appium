package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class FolderUploadGIFActions extends GetPage {
    public FolderUploadGIFActions(AndroidDriver driver) {
        super(driver, "FolderUploadGIFTest");
    }

    public void upload_GIF_in_folder(){
        element("addbutton").click();
        element("createfolderoption").click();
        element("typefoldername").sendKeys("FolderE");
        element("createfolderbutton").click();
        element("clickonfolder").click();
        element("addbutton").click();
        element("uploadfilebutton").click();
        element("show_roots").click();
        element("images").click();
        element("clickdcim").click();
        element("selectgifimage").click();
        element("open").click();
        element("homeicon").click();

    }
}
