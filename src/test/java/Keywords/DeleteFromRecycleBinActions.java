package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class DeleteFromRecycleBinActions extends GetPage {
    public DeleteFromRecycleBinActions(AndroidDriver driver) {
        super(driver, "DeleteFromRecycleBinTest");
    }

    public void delete_from_recycle_bin() {
        element("menumyboxx").click();
        element("recyclebin").click();
        element("selectallcheckbox").click();
        element("deleteicon").click();
        element("deletebutton").click();
        element("homeicon").click();
    }
}