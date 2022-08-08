package Keywords;

import com.PageObjects.Locators;
import com.utilities.textFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.Collections;
import java.util.List;




public class Tester {

   
    
    public static void main(String[] args) {
        List<String> li2;
        for(int i=0;i<3;i++){
            li2= Collections.singletonList(elements("listofvideoswithvariable", Integer.toString(i + 1)));
            System.out.println(li2.get(0));
            //li2.get(0);

        }
    }

    public static String elements(String elementname,String variables){

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


        return s3;

    }

    public static By getLocator(String locatorType, String locatorvalue) {

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
