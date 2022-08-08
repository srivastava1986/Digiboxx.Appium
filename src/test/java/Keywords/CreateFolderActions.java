package Keywords;

import com.PageObjects.GetPage;
import com.Tests.CreateFolderTest;
import io.appium.java_client.android.AndroidDriver;

public class CreateFolderActions extends GetPage {

    public CreateFolderActions(AndroidDriver driver) {
        super(driver, "CreateFolderTest");
    }

    public void create_folder() {
        element("addbutton").click();
        element("createfolderoption").click();
        element("typefoldername").sendKeys("abc");
        element("createfolderbutton").click();

    }
}