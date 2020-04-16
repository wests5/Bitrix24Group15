package com.Bitrix24.tests;

import com.Bitrix24.pages.ActiveStreamPage;
import com.Bitrix24.pages.LoginPage;
import com.Bitrix24.utilities.BrowserUtilities;
import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SihamUS1_7VisualEditor extends TestBase {
    @Test(description = "User should be able to click on Visual Editor to see the editor text-bar displays.")
    public void clickEditor(){
        extentTest = extentReports.createTest(" User should be able to click on Visual Editor to see the editor text-bar displays." );
        LoginPage loginPage = new LoginPage();
        loginPage.login();

        ActiveStreamPage activeStreamPage = new ActiveStreamPage();
        activeStreamPage.More.click();

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.Announcement));
        wait.until(ExpectedConditions.elementToBeClickable(activeStreamPage.Announcement));
        activeStreamPage.Announcement.click();

        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.Visual_Editor));

        BrowserUtilities.waitForPageToLoad(15);
        activeStreamPage.Visual_Editor.click();
        wait.until(ExpectedConditions.elementToBeClickable(activeStreamPage.Visual_Editor));

        Assert.assertTrue(activeStreamPage.text_bar.isDisplayed());

        BrowserUtilities.waitForPageToLoad(15);
        extentTest.pass("Text Bar is displayed");
    }
}


