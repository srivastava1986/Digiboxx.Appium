package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class RestoreByCheckboxSelectionActions extends GetPage {
    public RestoreByCheckboxSelectionActions(AndroidDriver driver) {
        super(driver, "RestoreByCheckboxSelectionTest");
    }

    public void restore_by_checkbox_selection(){
        element("menumyboxx").click();
        element("recyclebin").click();
        element("checkbox1").click();
        element("restorebutton").click();
        element("checkbox1").click();
        element("selectallcheckbox").click();
        //element("selectallcheckbox").click();
        //element("selectallcheckbox").click();
        element("restorebutton").click();
        element("homeicon").click();
    }
}
