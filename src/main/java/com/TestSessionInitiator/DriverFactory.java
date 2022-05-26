package com.TestSessionInitiator;

import com.utilities.configfileReader;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class DriverFactory {

    static DesiredCapabilities caps = new DesiredCapabilities();
    static configfileReader reader=new configfileReader();



    public static AndroidDriver getDriver(Map<String,String> config) throws MalformedURLException {

        if(config.get("platform").toLowerCase().toString().equalsIgnoreCase("mobile")){

            System.out.println(config.get("app"));
            return getAndriodDriver(config.get("app"),config.get("appiumserver"));

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
        //for any test on browser app the chromedrive set property and browser caps

        return new AndroidDriver(new URL(server),caps);

    }

//    private static AndroidDriver getAndriodChromeDriver(String driverpath){
//
//    }
}
