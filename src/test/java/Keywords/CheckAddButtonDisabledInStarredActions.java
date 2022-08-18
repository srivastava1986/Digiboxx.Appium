package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class CheckAddButtonDisabledInStarredActions extends GetPage {
    public CheckAddButtonDisabledInStarredActions(AndroidDriver driver) {
        super(driver, "CheckAddButtonDisabledInStarredTest");
    }

    public void check_add_button_disabled_in_starred(){
        element("menumyboxx").click();
        element("starred").click();

        if (element("addbutton").isEnabled())
            System.out.println("Add button is Enabled");
        else
            System.out.println("Add button is Disabled");
    }

}
