package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

import java.util.concurrent.TimeUnit;

    public class UploadSingleVideoActions extends GetPage {
        public UploadSingleVideoActions(AndroidDriver driver) {
            super(driver, "UploadSingleVideoTest");
            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        public void upload_single_video_file() {
            element("addbutton").click();
            element("uploadfilebutton").click();
            element("show_roots").click();
            element("videos").click();
            element("dcim").click();
            element("selectvideo1").click();
            element("open").click();


        }
    }