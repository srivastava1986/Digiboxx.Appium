package com.TestSessionInitiator;


import com.utilities.configfileReader;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.util.Map;

public class DriverFactory {

    static DesiredCapabilities caps = new DesiredCapabilities();
    static configfileReader reader=new configfileReader();


    //Map is an interface, used for when you want to associate a key with a value
    //here i m taking key & value from Config.properties
    public static AndroidDriver getDriver(Map<String,String> config) throws MalformedURLException {

        if(config.get("platform").toLowerCase().toString().equalsIgnoreCase("mobile")){

            System.out.println(System.getProperty("user.dir")+ File.separator+config.get("app"));//C:\Digiboxx.Appium\app-411-WIPTest-debug.apk
            return getAndriodDriver(System.getProperty("user.dir")+ File.separator+config.get("app"),config.get("appiumserver"));

        }

        return getAndriodDriver(config.get("app"),config.get("appiumserver"));

    }

//    private static WebDriver getChromeDriver(String driverpath){
//
//    }

    private static AndroidDriver getAndriodDriver(String app,String server) throws MalformedURLException {
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        caps.setCapability("autoGrantPermissions",true);
        caps.setCapability(MobileCapabilityType.APP,app);
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        caps.setCapability("noRest",true);
        //caps.setCapability("–session-override",true);
        //caps.setCapability("skipServerInstallation",true );
        //for any test on browser app the chromedrive set property and browser caps

        return new AndroidDriver(new URL(server),caps);

    }

//    private static AndroidDriver getAndriodChromeDriver(String driverpath){
//
//    }
}
