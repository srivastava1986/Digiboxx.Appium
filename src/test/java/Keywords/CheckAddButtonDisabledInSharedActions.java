package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class CheckAddButtonDisabledInSharedActions extends GetPage {
    public CheckAddButtonDisabledInSharedActions(AndroidDriver driver) {
        super(driver,"CheckAddButtonDisabledInSharedTest");
    }

    public void check_add_button_disabled_in_shared(){
        element("menumyboxx").click();
        element("shared").click();

        if (element("addbutton").isEnabled())
            System.out.println("Add button is Enabled");
        else
            System.out.println("Add button is Disabled");
    }
}
