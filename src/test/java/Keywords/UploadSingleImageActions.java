package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

import java.util.concurrent.TimeUnit;

    public class UploadSingleImageActions extends GetPage {

        public UploadSingleImageActions(AndroidDriver driver) {
        super(driver, "UploadSingleImageTest");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

         public void upload_single_image_file() {
             System.out.println("hello");
        element("addbutton").click();
        element("uploadfilebutton").click();
//        element("images").click();
//        element("dcim").click();
//        String s = element("selectimage1").getText();
//        if (s.equalsIgnoreCase("StatueofLiberty.jpg")) {
//            element("selectimage1").click();
//        }
        //element("selectimage1").click();
    }
}


