package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class VerifyDiscountOnYearlyPlansActions extends GetPage {

    public VerifyDiscountOnYearlyPlansActions(AndroidDriver driver) {
        super(driver, "VerifyDiscountOnYearlyPlansTest");
    }

    public void verify_Discount_On_Yearly_Plans() {
        element("premium").click();

        if (element("planA").isEnabled() && element("30rupeespermonthfor100GB").isEnabled() &&
                element("324peryearfor100GB").isEnabled() && element("save10%").isEnabled())
            System.out.println("Save 10% discount is Enabled");
        else
            System.out.println("Save 10% discount is Disabled");

    }
}