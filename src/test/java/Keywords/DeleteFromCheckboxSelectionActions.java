package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class DeleteFromCheckboxSelectionActions extends GetPage {
    public DeleteFromCheckboxSelectionActions(AndroidDriver driver) {
        super(driver, "DeleteFromCheckboxSelection");
    }

    public void delete_from_checkbox_selection(){
        element("homeicon").click();
        element("foldercheckbox").click();
        element("deleteicon").click();
        element("deletebutton").click();
    }
}
