package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class CheckAddButtonDisabledInQuickAccessActions extends GetPage {
    public CheckAddButtonDisabledInQuickAccessActions(AndroidDriver driver) {
        super(driver, "CheckAddButtonDisabledInQuickAccessTest");
    }
    public void check_add_button_disabled_in_quick_access() {
        element("menumyboxx").click();
        element("quickaccess").click();

        if (element("addbutton").isEnabled())
            System.out.println("Add button is Enabled");
        else
            System.out.println("Add button is Disabled");
    }
}
