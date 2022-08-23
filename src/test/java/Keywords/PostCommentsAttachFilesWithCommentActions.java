package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class PostCommentsAttachFilesWithCommentActions extends GetPage {
    public PostCommentsAttachFilesWithCommentActions(AndroidDriver driver) {
        super(driver, "PostCommentsAttachFilesWithCommentTest");
    }
    public void post_comments_attach_files(){
        element("folderkebabmenu").click();
        element("preview").click();
        element("comments").click();
        element("writetext").click();
        element("writetext").sendKeys("Nice");
        element("attach").click();
        element("selectimage1").click();
        element("openoptions").click();
        element("send").click();
        element("backkbutton").click();
        element("backkbutton").click();

    }
}
