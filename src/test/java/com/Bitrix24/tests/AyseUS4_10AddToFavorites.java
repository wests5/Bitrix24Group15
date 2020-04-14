package com.Bitrix24.tests;

import com.Bitrix24.pages.ActiveStreamPage;
import com.Bitrix24.pages.LoginPage;
import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AyseUS4_10AddToFavorites extends TestBase{
    @Test(description = "User should be able to add others posts to favorites by clicking on the Star icon")
    public void commaIcon() throws InterruptedException {
        extentTest = extentReports.createTest("User should be able to add others posts to favorites by clicking on the Star icon" );
        LoginPage loginPage = new LoginPage();
        loginPage.login();

        ActiveStreamPage activeStreamPage = new ActiveStreamPage();
        activeStreamPage.starButton.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        Assert.assertTrue(activeStreamPage.starButton.isEnabled());

    }
    }