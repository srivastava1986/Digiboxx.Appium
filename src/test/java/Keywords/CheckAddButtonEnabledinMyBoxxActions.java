package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class CheckAddButtonEnabledinMyBoxxActions extends GetPage {
    public CheckAddButtonEnabledinMyBoxxActions(AndroidDriver driver) {
        super(driver, "CheckAddButtonEnabledinMyBoxxTest");
    }

    public void check_add_button_enabled_in_myboxx(){

        if (element("addbutton").isEnabled())
            System.out.println("Add button is Enabled");
        else
            System.out.println("Add button is Disabled");


    }
}
