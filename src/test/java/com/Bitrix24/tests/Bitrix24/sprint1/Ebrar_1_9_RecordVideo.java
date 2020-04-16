package com.Bitrix24.tests.Bitrix24.sprint1;

import com.Bitrix24.pages.ActiveStreamPage;
import com.Bitrix24.pages.LoginPage;
import com.Bitrix24.tests.Bitrix24.TestBase;
import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Ebrar_1_9_RecordVideo extends TestBase {




    @Test(description = " User should be able to click Record Video tab to record a video and attach it with the message.")
    public void RecordVideo() throws TimeoutException {
        extentTest = extentReports.createTest("User should be able to click Record Video tab to record a video and attach it with the message." );
        LoginPage loginPage = new LoginPage();
        loginPage.login();

        ActiveStreamPage activeStreamPage = new ActiveStreamPage();
        activeStreamPage.sendMessageInput.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.RecordVideo));
        wait.until(ExpectedConditions.elementToBeClickable(activeStreamPage.RecordVideo));
        activeStreamPage.RecordVideo.click();
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.DeviceAccess));
        activeStreamPage.AllowAccess.click();
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.ErrorMessage));
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.CloseErrorMessage));
        wait.until(ExpectedConditions.elementToBeClickable(activeStreamPage.CloseErrorMessage));
        activeStreamPage.CloseErrorMessage.click();





    }
}

