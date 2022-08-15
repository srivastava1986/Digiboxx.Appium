package com.PageObjects;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;
//Base page defines "Page factory" and common functions such as "Waits"
public class BaseUi {

    AndroidDriver driver;
    private String pageName;

    //Constructor
    protected BaseUi(AndroidDriver driver,String pageName){
        //Page Factory is a class provided by Selenium WebDriver to support Page Object Design patterns.
        // In Page Factory, testers use @FindBy annotation.
        // The initElements method is used to initialize web elements.
        //The initElements is a static method of PageFactory class which is used to initialize
        // all the web elements located by @FindBy annotation
        //@FindBy annotation is used in PageFactory to locate and
        // declare the web elements using different locators
        //Initialises WebElements declared in this class using driver instance.
        PageFactory.initElements(driver, this);
        // "this" keyword is used here to distinguish global and local variable "driver"
        this.driver=driver;
        this.pageName=pageName;

    }





}
