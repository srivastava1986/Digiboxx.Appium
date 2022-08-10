package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MutipleVideosActions extends GetPage {

    public MutipleVideosActions(AndroidDriver driver) {
        super(driver, "UploadMultipleVideosTest");
    }

    public void upload_multiple_videos_file() {
        element("addbutton").click();
        element("uploadfilebutton").click();
        element("show_roots").click();//burger shape icon
        element("videos").click();
        element("dcim").click();

        List<WebElement> li= elements("listofvideos");
        int numberofvideos=li.size(); 

        for (int i=0 ;i< li.size(); i++)
        {
            element("listofvideoswithvariable",Integer.toString(i+1)).click();
            //System.out.println("i");
        }
        element("open").click();
    }
}