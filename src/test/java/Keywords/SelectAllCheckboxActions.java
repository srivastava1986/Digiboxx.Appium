package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

import java.io.ObjectInputStream;

public class SelectAllCheckboxActions extends GetPage {
    public SelectAllCheckboxActions(AndroidDriver driver) {
        super(driver, "SelectAllCheckboxTest");
    }

    public void select_all_checkbox(){
        element("checkbox2").click();
        element("checkbox3").click();
        element("checkbox2").click();
        element("checkbox3").click();
        element("selectallcheckbox").click();
        element("selectallcheckbox").click();
        element("selectallcheckbox").click();
        element("deleteicon").click();
        element("deletebutton").click();
    }
}
