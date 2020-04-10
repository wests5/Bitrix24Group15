package com.Bitrix24.tests;

import com.Bitrix24.pages.ActiveStreamPage;
import com.Bitrix24.pages.LoginPage;
import com.Bitrix24.utilities.BrowserUtilities;
import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BulentTX_4AttachingVideo extends TestBase{

    @Test(description = " User should be able to attach to video.")
    public void addVideo() throws InterruptedException {
//        extentTest = extentReports.createTest("User should be able to attach to video." );
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        ActiveStreamPage activeStreamPage = new ActiveStreamPage();
        activeStreamPage.sendMessageInput.click();
        BrowserUtilities.wait ( 3 );
        activeStreamPage.videoIcon.click();
        BrowserUtilities.wait ( 3 );
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.videoURL));
        wait.until(ExpectedConditions.elementToBeClickable(activeStreamPage.videoURL));
        activeStreamPage.videoURL.sendKeys ("https://www.youtube.com/watch?v=Ik9Y4O6TcF4&t=6s");
        BrowserUtilities.wait ( 8 );
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.saveVideoBtn));
        wait.until(ExpectedConditions.elementToBeClickable(activeStreamPage.saveVideoBtn));
        activeStreamPage.saveVideoBtn.click();
        BrowserUtilities.wait ( 4 );


    }
}
