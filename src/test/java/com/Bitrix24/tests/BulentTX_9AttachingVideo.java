package com.Bitrix24.tests;

import com.Bitrix24.pages.LoginPage;
import org.testng.annotations.Test;

public class BulentTX_9AttachingVideo extends TestBase{

    @Test(description = " User should be able to attach to video.")
    public void addVideo() throws InterruptedException {
//        extentTest = extentReports.createTest("User should be able to attach to video." );
        LoginPage loginPage = new LoginPage();
        loginPage.login();

    }
}
