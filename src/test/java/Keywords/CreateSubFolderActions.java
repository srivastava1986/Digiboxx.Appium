package Keywords;

import com.PageObjects.GetPage;
import com.Tests.CreateFolderTest;
import io.appium.java_client.android.AndroidDriver;

public class CreateSubFolderActions extends GetPage {

    public CreateSubFolderActions(AndroidDriver driver) {
        super(driver, "CreateFolderTest");
    }

    public void create_subfolder() {
        element("addbutton").click();
        element("createfolderoption").click();
        element("typefoldername").sendKeys("abc");
        element("createfolderbutton").click();


    }
}