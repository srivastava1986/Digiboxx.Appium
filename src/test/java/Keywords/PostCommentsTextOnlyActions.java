package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class PostCommentsTextOnlyActions extends GetPage {
    public PostCommentsTextOnlyActions(AndroidDriver driver) {
        super(driver, "PostCommentsTextOnlyTest");
    }

    public void post_comments_text_only(){
        element("folderkebabmenu").click();
        element("preview").click();
        element("comments").click();
        element("writetext").click();
        element("writetext").sendKeys("Nice");
        element("send").click();
        element("backkbutton").click();
        element("backkbutton").click();

    }
}
