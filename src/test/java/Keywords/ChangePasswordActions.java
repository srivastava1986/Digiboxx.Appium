package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class ChangePasswordActions extends GetPage {
    public ChangePasswordActions(AndroidDriver driver) {
        super(driver, "ChangePasswordTest");
    }

    public void change_password(){
        element("digispace").sendKeys("intern5");
        element("email").sendKeys("testing2510934@gmail.com");
        element("password").sendKeys("Qwerty@1234");
        element("signinbutton").click();
        element("tryagainclick").click();
        element("password").clear();
        element("password").sendKeys("Gaurav@123");
        element("signinbutton").click();

    }
}
