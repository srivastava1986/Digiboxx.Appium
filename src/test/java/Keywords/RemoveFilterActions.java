package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class RemoveFilterActions extends GetPage {
    public RemoveFilterActions(AndroidDriver driver) {
        super(driver, "RemoveFilterTest");
    }

    public void remove_filter(){
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
