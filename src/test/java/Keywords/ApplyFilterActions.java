package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class ApplyFilterActions extends GetPage {
    public ApplyFilterActions(AndroidDriver driver) {
        super(driver, "ApplyFilterTest");
    }

    public void apply_filter(){
        element("filtericon").click();
//        element("AtoZcheckbox").click();
//        element("ZtoAcheckbox").click();
        element("datetodaycheckbox").click();
        element("sizeallcheckbox").click();
        element("alltypescheckbox").click();
        element("alltagscheckbox").click();
        element("apply").click();
    }
}
