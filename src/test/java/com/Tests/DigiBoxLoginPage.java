package com.Tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DigiBoxLoginPage {

    AppiumDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        caps.setCapability("autoGrantPermissions",true);
        caps.setCapability(MobileCapabilityType.APP,"C:/Users/S_Home/Downloads/app-3606-DevTest-debug (1).apk");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        //for any test on browser app the chromedrive set property and browser caps
        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
    }

    @Test
    public void open_the_App() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.liqvd.digibox.test:id/btnSkipIntroSlideOne")).click();

    }

    @Test(dependsOnMethods = "open_the_App")
    public void enter_login_credentials() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.liqvd.digibox.test:id/edtDigiSpaceName")).sendKeys("Freeuse");
        driver.findElement(By.id("com.liqvd.digibox.test:id/edtEmail")).sendKeys("freeuser251093@gmail.com");
        driver.findElement(By.id("com.liqvd.digibox.test:id/edtPassword")).sendKeys("Gaurav@123");
        driver.findElement(By.id("com.liqvd.digibox.test:id/btnSignIn")).click();

    }
    @Test(dependsOnMethods = "enter_login_credentials")
    public void upload_single_image(){
        //click on add button
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Add\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
        //click on upload file
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.liqvd.digibox.test:id/llUploadFileFolders")).click();
        //select image
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String s=driver.findElement(By.xpath("//*[@text='StatueofLiberty.jpg']")).getText();
        System.out.println(s);
        if (s.equalsIgnoreCase("StatueofLiberty.jpg")){
            driver.findElement(By.xpath("//*[@text='StatueofLiberty.jpg']")).click();
        }

    }
    @Test(dependsOnMethods = "upload_single_image")
    public void upload_multiple_images(){
        //click on add button
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Add\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
        //click on upload file
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.liqvd.digibox.test:id/llUploadFileFolders")).click();
        //select image1
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String s1=driver.findElement(By.xpath("//*[@text='StatueofLiberty.jpg']")).getText();
        //select image2
        String s2=driver.findElement(By.xpath("//*[@text='disneyland.webp']")).getText();
        System.out.println(s1 + s2);
        //select 2 images
        if (s1.equalsIgnoreCase("StatueofLiberty.jpg")&& s2.equalsIgnoreCase("disneyland.webp")){
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")).click();
            //click on open
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.id("com.android.documentsui:id/menu_sort")).click();
        }

    }

    @Test(dependsOnMethods = "upload_multiple_images")
    public void upload_multiple_videos(){
        //click on add button
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Add\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
        //click on upload file
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.liqvd.digibox.test:id/llUploadFileFolders")).click();
        //select video1
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String s1=driver.findElement(By.xpath("//*[@text='video1.mp4']")).getText();
        //select image2
        String s2=driver.findElement(By.xpath("//*[@text='video2.mp4']")).getText();
        System.out.println("videos"+ s1 + s2);
        //select 2 images
        if (s1.equalsIgnoreCase("video1.mp4")&& s2.equalsIgnoreCase("video2.mp4")){
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")).click();
            //click on open
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.id("com.android.documentsui:id/menu_sort")).click();
        }
    }
    @Test(dependsOnMethods = "upload_multiple_videos")
    public void create_folder() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Add\"]/android.widget.FrameLayout/android.widget.ImageView")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.TextView")).click();
        driver.findElement(By.id("com.liqvd.digibox.test:id/edtCreateFolderName")).sendKeys("Swati");
        driver.findElement(By.id("com.liqvd.digibox.test:id/btnCreateFolder")).click();
        //go to the search option
        driver.findElement(By.id("com.liqvd.digibox.test:id/search")).click();
        driver.findElement(By.id("com.liqvd.digibox.test:id/edtSearch")).sendKeys("Swati");
        driver.findElement(By.id("com.liqvd.digibox.test:id/ivSearchBtn")).click();
        driver.findElement(By.id("com.liqvd.digibox.test:id/shapeableImageView")).click();
        //click add
        driver.findElement(By.xpath("\t\n" +
                "//android.widget.FrameLayout[@content-desc=\"Add\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
        //click upload file
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.TextView")).click();
        //select gif
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.LinearLayout")).click();


    }

    @Test(dependsOnMethods = "create_folder")
    public void upload_file_folder() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("\t\n" +
                "//android.widget.FrameLayout[@content-desc=\"Search\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.liqvd.digibox.test:id/edtSearch")).sendKeys("Swati");
        driver.findElement(By.id("com.liqvd.digibox.test:id/ivSearchBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.liqvd.digibox.test:id/tvName")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Add\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.TextView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")).click();
        driver.findElement(By.xpath("\t\n" +
                "//android.widget.FrameLayout[@content-desc=\"Home\"]/android.widget.FrameLayout/android.widget.ImageView")).click();

    }

    @Test(dependsOnMethods = "upload_file_folder")
    public void multiple_uploads_folder(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("\t\n" +
                "//android.widget.FrameLayout[@content-desc=\"Search\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //
        driver.findElement(By.id("com.liqvd.digibox.test:id/edtSearch")).sendKeys("Swati");
        driver.findElement(By.id("com.liqvd.digibox.test:id/ivSearchBtn")).click();
        //
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.liqvd.digibox.test:id/tvName")).click();
        //
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Add\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
        //
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.TextView")).click();
        //select image1
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String s1=driver.findElement(By.xpath("//*[@text='StatueofLiberty.jpg']")).getText();
        //select image2
        String s2=driver.findElement(By.xpath("//*[@text='disneyland.webp']")).getText();
        System.out.println(s1 + s2);
        //select 2 images
        if (s1.equalsIgnoreCase("StatueofLiberty.jpg")&& s2.equalsIgnoreCase("disneyland.webp")){
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")).click();
            //click on open
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.id("com.android.documentsui:id/menu_sort")).click();
        }

    }

    @Test(dependsOnMethods = "multiple_uploads_folder")
    public void apply_filter(){
        //click on search icon in lower ribbon
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("\t\n" +
                "//android.widget.FrameLayout[@content-desc=\"Search\"]/android.widget.FrameLayout/android.widget.ImageView")).click();

        //type  folder name swati
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.liqvd.digibox.test:id/edtSearch")).sendKeys("Swati");
        //click on search icon
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.liqvd.digibox.test:id/ivSearchBtn")).click();
        //click on first element in the search results
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.liqvd.digibox.test:id/tvName")).click();
        //click on filter icon
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.liqvd.digibox.test:id/ivFilter")).click();
        //select filters (name)
        driver.findElement(By.id("com.liqvd.digibox.test:id/rbAtoZ")).click();
        //Select filters  (selected last 7 days)
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.liqvd.digibox.test:id/rbDateLast7Days")).click();
        //select filters (size)
        driver.findElement(By.id("com.liqvd.digibox.test:id/rgSizeAll")).click();
        //select filters (file type)
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.CheckBox")).click();

        //Apply filter
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.liqvd.digibox.test:id/btnApply")).click();

    }

    @Test(dependsOnMethods = "apply_filter")
    public void folder_color_rename(){
        //go to search
        driver.findElement(By.xpath("\t\n" +
                "//android.widget.FrameLayout[@content-desc=\"Search\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
        //enter the folder name (abc)u want to change the color
        driver.findElement(By.id("com.liqvd.digibox.test:id/edtSearch")).sendKeys("abc");
        //click on search
        driver.findElement(By.id("com.liqvd.digibox.test:id/ivSearchBtn")).click();
        //go to 3 dots of folder u want to change color
        driver.findElement(By.id("com.liqvd.digibox.test:id/ivMenu")).click();
        //select change color
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.liqvd.digibox.test:id/itemChangeFolderColor")).click();
        //choose color
        driver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[8]/android.view.View")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")).click();

        //FOR RENAMING FOLDER
        //go to 3 dots again of folder u want to rename
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.liqvd.digibox.test:id/ivMenu")).click();
        //go to rename option
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.liqvd.digibox.test:id/itemRenameFolder")).click();
        //clear the name of folder
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.liqvd.digibox.test:id/edtReNameFolder")).clear();
        //Rename the folder with new name
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.liqvd.digibox.test:id/edtReNameFolder")).sendKeys("Testing");
        //click on rename folder
        driver.findElement(By.id("com.liqvd.digibox.test:id/btnReNameFolder")).click();
    }


    @Test(dependsOnMethods = "folder_color_rename")
    public void delete_folder(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //go to back
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton")).click();
        //go to homepage
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Home\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
        //go to search option
        driver.findElement(By.xpath("\t\n" +
                "//android.widget.FrameLayout[@content-desc=\"Search\"]/android.widget.FrameLayout/android.widget.ImageView")).click();

        //type  folder name swati
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.liqvd.digibox.test:id/edtSearch")).sendKeys("Swati");
        //click on search icon
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.liqvd.digibox.test:id/ivSearchBtn")).click();
        //click on three dots
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.liqvd.digibox.test:id/ivMenu")).click();
        //click on delete
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.liqvd.digibox.test:id/ivDelete")).click();
        //click on delete (confirm)
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.liqvd.digibox.test:id/tvContinue")).click();

    }
        @Test(dependsOnMethods = "delete_folder")
        public void create_subfolder(){
            //go to back
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("\t\n" +
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton")).click();

            //go to search option
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("\t\n" +
                    "//android.widget.FrameLayout[@content-desc=\"Search\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
            //click search button
            driver.findElement(By.id("com.liqvd.digibox.test:id/edtSearch")).sendKeys("Testing");
            //click search
            driver.findElement(By.id("com.liqvd.digibox.test:id/ivSearchBtn")).click();
            //click on folder icon
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView[1]")).click();
            //go to add button
            driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Add\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
            //go to create folder (subfolder)
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.TextView")).click();
            //name the folder
            driver.findElement(By.id("com.liqvd.digibox.test:id/edtCreateFolderName")).sendKeys("subfolder");
            //click create folder
            driver.findElement(By.id("com.liqvd.digibox.test:id/btnCreateFolder")).click();

        }

    @Test(dependsOnMethods = "create_subfolder")
    public void selectall_checkbox(){
        //go to back
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.liqvd.digibox.test:id/imgBack")).click();
        //select all (checkbox)
        driver.findElement(By.id("com.liqvd.digibox.test:id/ivSelectAll")).click();
        //deselect all
        driver.findElement(By.id("com.liqvd.digibox.test:id/ivSelectAll")).click();
//        //delete it
//        driver.findElement(By.id("com.liqvd.digibox.test:id/ivDelete")).click();
//        //confirm delete
//        driver.findElement(By.id("com.liqvd.digibox.test:id/tvContinue")).click();



    }
}
