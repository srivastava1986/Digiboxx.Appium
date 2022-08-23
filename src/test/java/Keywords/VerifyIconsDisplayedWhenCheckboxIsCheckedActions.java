package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class VerifyIconsDisplayedWhenCheckboxIsCheckedActions extends GetPage {

    public VerifyIconsDisplayedWhenCheckboxIsCheckedActions(AndroidDriver driver) {
        super(driver,"VerifyIconsDisplayedWhenCheckboxIsCheckedTest");
    }

    public void verify_Icons_Displayed_When_Checkbox_Is_Checked(){
        element("addbutton").click();
        element("createfolderoption").click();
        element("typefoldername").sendKeys("Test123");
        element("createfolderbutton").click();
        element("selectallcheckbox").click();
        //Delete icon
        if (element("deleteicon").isEnabled())
            System.out.println(" Delete is Enabled");
        else
            System.out.println(" Delete is Disabled");
        //Download icon
        if (element("downloadall").isEnabled())
            System.out.println(" Download is Enabled");
        else
            System.out.println(" Download is Disabled");
        //Share icon
        if (element("shareicon").isEnabled())
            System.out.println(" Share icon is Enabled");
        else
            System.out.println(" Share icon is Disabled");
    }
}
