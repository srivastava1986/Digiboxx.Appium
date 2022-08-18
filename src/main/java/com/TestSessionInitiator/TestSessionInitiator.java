package com.TestSessionInitiator;

import Keywords.*;
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
    public UpdateProfilePictureActions updateProfilePicture;
    public ChangeProfilePictureActions changeProfilePicture;
    public DeleteProfilePictureActions deleteProfilePicture;
    public RestoreByCheckboxSelectionActions restoreByCheckboxSelection;
    public ProfilePictureCameraUploadActions profilePictureCameraUpload;
    public ChangePasswordActions changePassword;
    public AddToStarredFilesAndFoldersActions addToStarredFilesAndFolders;
    public CheckAddButtonEnabledinMyBoxxActions checkAddButtonEnabledInMyBoxx;
    public CheckAddButtonDisabledInQuickAccessActions checkAddButtonDisabledInQuickAccess;
    public CheckAddButtonDisabledInRecycleBinActions checkAddButtonDisabledInRecycleBin;
    public CheckAddButtonDisabledInStarredActions checkAddButtonDisabledInStarred;
    public CheckAddButtonDisabledInSharedActions checkAddButtonDisabledInShared;
    public PostCommentsTextOnlyActions postCommentsTextOnly;
    public PostCommentsAttachFilesWithCommentActions postCommentsAttachFilesWithComment;
    public ShareFileInStarredTabActions shareFileInStarredTabTest;

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
        updateProfilePicture=new UpdateProfilePictureActions(driver);
        changeProfilePicture=new ChangeProfilePictureActions(driver);
        deleteProfilePicture=new DeleteProfilePictureActions(driver);
        restoreByCheckboxSelection=new RestoreByCheckboxSelectionActions(driver);
        profilePictureCameraUpload=new ProfilePictureCameraUploadActions(driver);
        changePassword=new ChangePasswordActions(driver);
        addToStarredFilesAndFolders=new AddToStarredFilesAndFoldersActions(driver);
        checkAddButtonEnabledInMyBoxx=new CheckAddButtonEnabledinMyBoxxActions(driver);
        checkAddButtonDisabledInQuickAccess= new CheckAddButtonDisabledInQuickAccessActions(driver);
        checkAddButtonDisabledInRecycleBin=new CheckAddButtonDisabledInRecycleBinActions(driver);
        checkAddButtonDisabledInStarred=new CheckAddButtonDisabledInStarredActions(driver);
        checkAddButtonDisabledInShared=new CheckAddButtonDisabledInSharedActions(driver);
        postCommentsTextOnly=new PostCommentsTextOnlyActions(driver);
        postCommentsAttachFilesWithComment=new PostCommentsAttachFilesWithCommentActions(driver);
        shareFileInStarredTabTest=new ShareFileInStarredTabActions(driver);
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
