package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class LoginPageActions extends GetPage {

    public LoginPageActions(AndroidDriver driver){
        super(driver,"LoginPageTest");

    }

    public void skippresentation(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        element("skip").click();
    }



}
