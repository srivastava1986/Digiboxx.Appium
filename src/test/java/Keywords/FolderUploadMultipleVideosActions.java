package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class FolderUploadMultipleVideosActions extends GetPage {
    public FolderUploadMultipleVideosActions(AndroidDriver driver) {
        super(driver,"FolderUploadMultipleVideosTest");
    }

    public void folder_upload_multiple_videos(){
        element("addbutton").click();
        element("createfolderoption").click();
        element("typefoldername").sendKeys("FolderB");
        element("createfolderbutton").click();
        element("clickonfolder").click();
        element("addbutton").click();
        element("uploadfilebutton").click();
        element("show_roots").click();
        element("videos").click();
        element("dcim").click();
        element("selectvideo1").click();
        element("selectvideo2").click();
        element("open").click();
        element("homeicon").click();
    }
}
