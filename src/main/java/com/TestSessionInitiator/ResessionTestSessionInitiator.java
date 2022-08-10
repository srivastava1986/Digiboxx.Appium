package com.TestSessionInitiator;

import Keywords.*;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import static com.utilities.configfileReader.getConfigData;

//Test Session Initiator defines "it initiates the session" and "loads all page objects which are used in the Test Cases".
public class ResessionTestSessionInitiator {

    AndroidDriver driver;

    //Reference Variables
    private DriverFactory driverfactory;
    public LoginPageActions loginPage;
    public MyBoxxPageActions myboxpageactions;
    public UploadSingleImageActions uploadSingleImage;
    public UploadMultipleImagesActions uploadMultipleImages;
    public UploadSingleVideoActions uploadSingleVideo;
    public UploadMultipleVideosActions uploadMultipleVideos;
    public CreateFolderActions createfolder;
    public CreateSubFolderActions createsubfolder;
    public ChangeColorOfFolderActions changeColorOfFolder;
    public RenameFolderActions renameFolder;


    public MutipleVideosActions multiplevideos;


    private void  initPage(){

        //Objects of Reference Variables
        loginPage = new LoginPageActions(driver);
        myboxpageactions = new MyBoxxPageActions(driver);
        uploadSingleImage = new UploadSingleImageActions(driver);
        uploadMultipleImages = new UploadMultipleImagesActions(driver);
        uploadSingleVideo = new UploadSingleVideoActions(driver);
        uploadMultipleVideos = new UploadMultipleVideosActions(driver);
        createfolder = new CreateFolderActions(driver);
        createsubfolder = new CreateSubFolderActions(driver);
        changeColorOfFolder=new ChangeColorOfFolderActions(driver);
        renameFolder =new RenameFolderActions(driver);
        multiplevideos = new MutipleVideosActions(driver);


    }
    public ResessionTestSessionInitiator(){

        //configureAndriodDriver();
        //checkSession();
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
