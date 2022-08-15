package com.TestSessionInitiator;

import Keywords.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import static com.utilities.configfileReader.getConfigData;

//Test Session Initiator defines "it initiates the session" and "loads all page objects
// which are used in the Test Cases".
public class TestSessionInitiator {

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
    public UploadingGIFActions uploadGIF;
    public SubFolderUploadImageActions uploadImageInSubFolder;
    public SubFolderUploadVideoActions uploadVideoInSubFolder;
    public DeleteFromCheckboxSelectionActions deleteFromCheckboxSelection;
    public SelectAllCheckboxActions selectAllCheckbox;
    public DeleteFromRecycleBinActions deleteFromRecycleBin;
    public ApplyFilterActions applyFilter;
    public RemoveFilterActions removeFilter;
    public SelectMultipleFilesUsingCheckboxActions selectMultipleFilesUsingCheckbox;
    public RestoreFilesFromRecycleBinActions restoreFilesFromRecycleBin;
    public DeleteFromKebabIconActions deleteFromKebabIcon;
    public DeleteFromPreviewPageActions deleteFromPreviewPage;


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
        uploadGIF= new UploadingGIFActions(driver);
        uploadImageInSubFolder = new SubFolderUploadImageActions(driver);
        uploadVideoInSubFolder=new SubFolderUploadVideoActions(driver);
        deleteFromCheckboxSelection = new DeleteFromCheckboxSelectionActions(driver);
        selectAllCheckbox = new SelectAllCheckboxActions(driver);
        deleteFromRecycleBin=new DeleteFromRecycleBinActions(driver);
        applyFilter=new ApplyFilterActions(driver);
        removeFilter= new RemoveFilterActions(driver);
        selectMultipleFilesUsingCheckbox=new SelectMultipleFilesUsingCheckboxActions(driver);
        restoreFilesFromRecycleBin= new RestoreFilesFromRecycleBinActions(driver);
        deleteFromKebabIcon = new DeleteFromKebabIconActions(driver);
        deleteFromPreviewPage=new DeleteFromPreviewPageActions(driver);



    }
    public TestSessionInitiator(){

        configureAndriodDriver();
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
