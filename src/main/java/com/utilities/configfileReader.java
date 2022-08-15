package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configfileReader {

    public configfileReader(){

    }

//    public static void main(String args[]){
//        System.out.println(getConfigData("appiumserver"));
//    }

    public static String getConfigData(String key){
        String value="";
        try {
            //FileInputStream class is useful to read data from a file                                       in the form of sequence of bytes.
            FileInputStream input = new FileInputStream("./config.properties");
            Properties prop = new Properties();
            prop.load(input);
            value=prop.getProperty(key);
        }  catch (IOException e) {
            e.printStackTrace();
        }

        return value;

    }
}
