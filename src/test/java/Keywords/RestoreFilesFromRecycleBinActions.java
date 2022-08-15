package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class RestoreFilesFromRecycleBinActions extends GetPage {
    public RestoreFilesFromRecycleBinActions(AndroidDriver driver) {
        super(driver, "RestoreFilesFromRecycleBinTest");
    }

    public void restore_files_from_recycle_bin() {
        element("menumyboxx").click();
        element("recyclebin").click();
        element("folderkebabmenu").click();
        element("restore").click();
        element("homeicon").click();
    }
}