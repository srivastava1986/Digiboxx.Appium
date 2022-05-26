package com.TestSessionInitiator;

import Keywords.LoginPageActions;
import io.appium.java_client.android.AndroidDriver;


import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import static com.utilities.configfileReader.getConfigData;


public class TestSessionInitiator {

    AndroidDriver driver;
    private DriverFactory driverfactory;
    public LoginPageActions loginPage;

    private void  initPage(){
        loginPage = new LoginPageActions(driver);
    }
    public TestSessionInitiator(){
        driverfactory=new DriverFactory();
        configureAndriodDriver();
        initPage();
    }

    private void configureAndriodDriver() {
        try {
            driver=driverfactory.getDriver(getSessionConfig());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    private Map<String, String> getSessionConfig(){
         String[] configkeys={"platform","app","appiumserver"};

         Map<String,String> config=new HashMap<String, String>();
         for (String string:configkeys){
             config.put(string,getConfigData(string));
         }
         return config;
    }



}
