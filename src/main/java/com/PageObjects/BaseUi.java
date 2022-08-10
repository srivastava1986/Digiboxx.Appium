package com.PageObjects;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;
//Base page defines "Page factory" and common functions such as "Waits"
public class BaseUi {

    AndroidDriver driver;
    private String pageName;

    protected BaseUi(AndroidDriver driver,String pageName){
        PageFactory.initElements(driver, this);
        this.driver=driver;
        this.pageName=pageName;

    }

}
