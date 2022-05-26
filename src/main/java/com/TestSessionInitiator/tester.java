package com.TestSessionInitiator;

import java.util.HashMap;
import java.util.Map;

import static com.utilities.configfileReader.getConfigData;

public class tester {

    public static void main(String args[]){

        System.out.println(getSessionConfig().get("app"));

    }

    public static Map<String, String> getSessionConfig(){
        String[] configkeys={"platform","app","appiumserver"};

        Map<String,String> config=new HashMap<String, String>();
        for (String string:configkeys){
            config.put(string,getConfigData(string));
        }
        return config;
    }
}
