package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class ChangeColorOfFolderActions extends GetPage {
        public ChangeColorOfFolderActions(AndroidDriver driver) {
                super(driver, "UploadMultipleVideosTest");
        }

        public void change_color_of_folder() {
                element("addbutton").click();
                element("createfolderoption").click();
                element("typefoldername").sendKeys("xyz");
                element("createfolderbutton").click();
                element("folderkebab").click();
                element("changecoloroffolderoptions").click();
                element("greencolor").click();
                element("apply").click();



        }
}