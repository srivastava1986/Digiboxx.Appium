package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class AddToStarredFilesAndFoldersActions extends GetPage {
    public AddToStarredFilesAndFoldersActions(AndroidDriver driver) {
        super(driver, "AddToStarredFilesAndFoldersTest");
    }

    public void add_to_starred_files_and_folders(){
        element("star").click();
        element("star2").click();
        element("star3").click();

    }

}
