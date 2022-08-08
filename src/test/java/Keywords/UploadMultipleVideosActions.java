package Keywords;

import com.PageObjects.GetPage;
import com.Tests.UploadMultipleVideosTest;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UploadMultipleVideosActions extends GetPage {

    public UploadMultipleVideosActions(AndroidDriver driver) {
        super(driver, "UploadMultipleVideosTest");
    }

    public void upload_multiple_videos_file() {
        element("addbutton").click();
        element("uploadfilebutton").click();
//        element("selectvideo1").click();
//        element("selectvideo2").click();
//        element("open").click();
        element("show_roots").click();//burger shape icon click
        //--write all the elements.click();
        element("videos").click();
        element("dcim").click();

        List<WebElement> li=elements("listofvideos");
        int numberofvideos=li.size();
        System.out.println(numberofvideos);
        //List<WebElement> li2=elements("listofvideos",);

        List<WebElement> li2;
        for(int i=0;i<li.size();i++){
                    li2=elements("listofvideoswithvariable",Integer.toString(i+1));
                    li2.get(0).click();

        }

    }
}