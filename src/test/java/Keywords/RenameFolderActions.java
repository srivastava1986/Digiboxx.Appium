package Keywords;

import com.PageObjects.GetPage;
import com.Tests.RenameFolderTest;
import io.appium.java_client.android.AndroidDriver;

public class RenameFolderActions extends GetPage {
    public RenameFolderActions(AndroidDriver driver) {
        super(driver, "RenameFolderTest");
    }

    public void rename_folder() {
        element("addbutton").click();
        element("createfolderoption").click();
        element("typefoldername").sendKeys("abc");
        element("createfolderbutton").click();
        element("folderkebab").click();
        element("renameoption").click();
        element("renamefolderbox").clear();
        element("renamefolderbox").sendKeys("Testing");
        element("renamefolderbutton").click();



    }
}
