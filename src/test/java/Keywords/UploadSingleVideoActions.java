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
            element("kebab").click();
            element("dcim").click();
            element("video1").click();

        }
    }