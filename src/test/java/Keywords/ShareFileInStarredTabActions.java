package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class ShareFileInStarredTabActions extends GetPage {
    public ShareFileInStarredTabActions(AndroidDriver driver) {
        super(driver, "ShareFileInStarredTabTest");
    }

    public void share_files_in_starred_tab(){
        element("menumyboxx").click();
        element("starred").click();
        element("folderkebabmenu").click();
        element("sharewithuser").click();
        element("useremail").click();
        element("useremail").sendKeys("abc123@gmail.com");
        element("submitassign").click();
        element("okassign").click();
        element("cancelassign").click();
    }


}
