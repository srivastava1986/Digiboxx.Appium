package com.PageObjects;

import com.utilities.textFileReader;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import static com.utilities.textFileReader.locatorfinder;

//Get Page defines all the "Page related methods" like driver.findElement and Locators.
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
        WebElement webelement = null;
        try {
            locators = textFileReader.locatorfinder(elementname);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            webelement = wait.until( ExpectedConditions.presenceOfElementLocated(getLocator(locators[1],locators[2])) );
            //return webelement;

        } catch (IOException e) {
            e.printStackTrace();
        }


        //return driver.findElement(getLocator(locators[1],locators[2]));

        return webelement;
    }
    public  WebElement element(String elementname,String variables)  {
        String[] locators= new String[0];
        String s3 = null;
        try {
            locators = textFileReader.locatorfinder(elementname);
            String s1=locators[2].split("#")[0];
            String s2=locators[2].split("#")[1];
            s3=s1+variables+s2;

        } catch (IOException e) {
            e.printStackTrace();
        }


        return driver.findElement(getLocator(locators[1],s3));
    }

    public List<WebElement> elements(String elementname){

        String[] locators = new String[0];

        try {
            locators = textFileReader.locatorfinder(elementname);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return driver.findElements(getLocator(locators[1],locators[2]));

    }
    public List<WebElement> elements(String elementname,String variables){

        String[] locators = new String[0];
        String s3 = null;

        try {
            locators = textFileReader.locatorfinder(elementname);
            String s1=locators[2].split("#")[0];

            String s2=locators[2].split("#")[1];

            s3=s1+variables+s2;





        } catch (IOException e) {
            e.printStackTrace();
        }


        return driver.findElements(getLocator(locators[1],s3));

    }


    private static By getLocator(String locatorType, String locatorvalue) {

        switch (Locators.valueOf(locatorType)){
            case id:
                return By.id(locatorvalue);
            case xpath:
                return By.xpath(locatorvalue);
            case tagname:
                return By.tagName(locatorvalue);
            case classname:
                return By.className(locatorvalue);
            case partiallinktext:
                return By.partialLinkText(locatorvalue);
            case css:
                return By.cssSelector(locatorvalue);
            default:
                return By.id(locatorvalue);
        }
    }
}
