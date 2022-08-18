package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class CheckAddButtonDisabledInRecycleBinActions extends GetPage {
    public CheckAddButtonDisabledInRecycleBinActions(AndroidDriver driver) {
        super(driver, "CheckAddButtonDisabledInRecycleBinTest");
    }

    public void check_add_button_disabled_in_recycle_bin(){
        element("menumyboxx").click();
        element("recyclebin").click();

        if (element("addbutton").isEnabled())
            System.out.println("Add button is Enabled");
        else
            System.out.println("Add button is Disabled");
    }
}
