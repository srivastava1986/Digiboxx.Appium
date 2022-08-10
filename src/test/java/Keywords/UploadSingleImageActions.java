package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

import java.util.concurrent.TimeUnit;

    public class UploadSingleImageActions extends GetPage {

        public UploadSingleImageActions(AndroidDriver driver) {
        super(driver, "UploadSingleImageTest");

    }

         public void upload_single_image_file() {
//           System.out.println("hello");
             element("addbutton").click();
             element("uploadfilebutton").click();
             element("show_roots").click();
             element("images").click();
             element("dcim").click();
             element("selectimage1").click();
             element("open").click();
    }
}


