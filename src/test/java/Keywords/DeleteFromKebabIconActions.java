package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class DeleteFromKebabIconActions extends GetPage {
    public DeleteFromKebabIconActions(AndroidDriver driver) {
        super(driver, "DeleteFromKebabIconTest");
    }

    public void delete_from_kebab_icon(){
        //deleting file from kebab icon
        element("folderkebabmenu").click();
        element("deletefile").click();
        element("deletebutton").click();

        //deleting folder from kebab icon
        element("addbutton").click();
        element("createfolderoption").click();
        element("typefoldername").sendKeys("abc");
        element("createfolderbutton").click();
        element("folderkebabmenu").click();
        element("deletefolder").click();
        element("deletebutton").click();
    }
}
