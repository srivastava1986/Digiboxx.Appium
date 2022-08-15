package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class DeleteFromPreviewPageActions extends GetPage {
    public DeleteFromPreviewPageActions(AndroidDriver driver) {
        super(driver, "DeleteFromPreviewPageTest");
    }

    public void delete_from_preview_page(){
        element("folderkebabmenu").click();
        element("preview").click();
        element("deletefrompreview").click();
        element("continuetodelete").click();
    }
}
