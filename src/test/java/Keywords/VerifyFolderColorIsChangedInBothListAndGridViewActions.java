package Keywords;

import com.PageObjects.GetPage;
import io.appium.java_client.android.AndroidDriver;

public class VerifyFolderColorIsChangedInBothListAndGridViewActions extends GetPage {
    public VerifyFolderColorIsChangedInBothListAndGridViewActions(AndroidDriver driver) {
        super(driver, "VerifyFolderColorIsChangedInBothListAndGridViewTest");
    }

    public void verify_Folder_Color_Is_Changed_In_Both_List_And_GridView(){
        element("addbutton").click();
        element("createfolderoption").click();
        element("typefoldername").sendKeys("Test");
        element("createfolderbutton").click();
        element("folderkebab").click();
        element("changecoloroffolderoptions").click();
        element("greencolor").click();
        element("apply").click();
        element("typeview").click();





//        if (element("greencolor").isSelected())
//            System.out.println(" Green color is visible in both list and grid view");
//        else
//            System.out.println(" Green color is not visible");

    }
}
