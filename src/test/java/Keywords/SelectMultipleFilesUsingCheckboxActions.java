package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class SelectMultipleFilesUsingCheckboxActions extends GetPage {
    public SelectMultipleFilesUsingCheckboxActions(AndroidDriver driver) {
        super(driver, "SelectMultipleFilesUsingCheckboxTest");
    }

    public void select_multiple_files_using_checkbox(){
        element("checkbox1").click();
        element("checkbox3").click();
        element("checkbox1").click();
        element("homeicon").click();
    }
}
