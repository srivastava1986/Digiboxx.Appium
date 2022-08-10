package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

import java.util.concurrent.TimeUnit;

    public class UploadMultipleImagesActions extends GetPage {

        public UploadMultipleImagesActions(AndroidDriver driver) {
            super(driver, "UploadMultipleImagesTest");
            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        public void upload_multiple_images_file() {
            element("addbutton").click();
            element("uploadfilebutton").click();
            element("show_roots").click();
            element("images").click();
            element("dcim").click();
            element("selectimage1").click();
            element("selectimage2").click();
            element("open").click();

        }
    }