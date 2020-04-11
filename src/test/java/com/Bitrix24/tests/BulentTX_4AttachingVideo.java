package com.Bitrix24.tests;

import com.Bitrix24.pages.ActiveStreamPage;
import com.Bitrix24.pages.LoginPage;
import com.Bitrix24.utilities.BrowserUtilities;
import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BulentTX_4AttachingVideo extends TestBase{

    @Test(description = " User should be able to attach to video.")
    public void addVideo() throws InterruptedException {
//        extentTest = extentReports.createTest("User should be able to attach to video." );
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        BrowserUtilities.wait ( 3 );
        ActiveStreamPage activeStreamPage = new ActiveStreamPage();
        activeStreamPage.sendMessageInput.click();
        BrowserUtilities.wait ( 3 );
        activeStreamPage.videoIcon.click();
        BrowserUtilities.wait ( 3 );
        activeStreamPage.videoURL.click();
        activeStreamPage.videoURL.sendKeys ("https://www.youtube.com/watch?v=yefmcX57Eyg&t=6s");
        BrowserUtilities.wait ( 20 );
        activeStreamPage.saveVideoBtn.click();


    }
}
