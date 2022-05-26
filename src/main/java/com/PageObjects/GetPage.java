package com.PageObjects;

import com.utilities.textFileReader;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

import static com.utilities.textFileReader.locatorfinder;

public class GetPage extends BaseUi {

    protected AndroidDriver driver;
    String pageName;
    public GetPage(AndroidDriver driver, String pageName){
        super(driver,pageName);
        this.driver = driver;
        this.pageName=pageName;

    }

//    public static void main(String args[]){
//        System.out.println((getLocator("id","com.liqvd.digibox.test:id/btnSkipIntroSlideOne")));
//    }

    public  WebElement element(String elementname)  {
        String[] locators= new String[0];
        try {
            locators = textFileReader.locatorfinder(elementname);

        } catch (IOException e) {
            e.printStackTrace();
        }


        return driver.findElement(getLocator(locators[1],locators[2]));
    }

    private static By getLocator(String locatorType, String locatorvalue) {

        switch (Locators.valueOf(locatorType)){
            case id:
                return By.id("com.liqvd.digibox.test:"+locatorvalue);
            case xpath:
                return By.xpath(locatorvalue);
            default:
                return By.id(locatorvalue);
        }
    }
}
