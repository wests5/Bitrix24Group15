package com.Bitrix24.tests;

import com.Bitrix24.pages.ActiveStreamPage;
import com.Bitrix24.pages.LoginPage;
import com.Bitrix24.utilities.BrowserUtilities;
import com.Bitrix24.utilities.Driver;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Israfil1_8_TopicBox extends TestBase{

    @Test
    public void verifyTopicBox(){
        extentTest = extentReports.createTest("User should be able click on the Topic icon to see Message Topic Box." );
        LoginPage loginPage =new LoginPage();
        loginPage.login();

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),15);
        ActiveStreamPage activeStreamPage=new ActiveStreamPage();
        BrowserUtilities.waitForPageToLoad(15);
        activeStreamPage.sendMessageInput.click();

        BrowserUtilities.waitForPageToLoad(15);
        wait.until(ExpectedConditions.elementToBeClickable(activeStreamPage.topicButton)).click();
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.topicBoxtext));

        String topicboxtext=activeStreamPage.topicBoxtext.getText();

        Assert.assertTrue(activeStreamPage.topicBoxtext.isDisplayed());

        extentTest.pass("Message Topic text Box is displayed");
    }

}


