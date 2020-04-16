package com.Bitrix24.tests.Bitrix24.sprint1;

import com.Bitrix24.pages.ActiveStreamPage;
import com.Bitrix24.pages.LoginPage;
import com.Bitrix24.tests.Bitrix24.TestBase;
import com.Bitrix24.utilities.BrowserUtilities;
import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

 class Ebrar_Userstory_6_1 extends TestBase {




    @Test(description = "User should be able yo click on upload files icon to upload files and pictrues from local disks, download feom external drive, select documents from bitrix24, and create files to upload. ")
    public void uploadfiles() throws TimeoutException {
        extentTest = extentReports.createTest("User should be able yo click on upload files icon to upload files and pictrues from local disks, download feom external drive, select documents from bitrix24, and create files to upload. ");
        LoginPage loginPage = new LoginPage();
        loginPage.login();

        ActiveStreamPage activeStreamPage = new ActiveStreamPage();
        activeStreamPage.sendMessageInput.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.More));
        wait.until(ExpectedConditions.elementToBeClickable(activeStreamPage.More));
        activeStreamPage.More.click();
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.Appreciation));
        activeStreamPage.Appreciation.click();
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.Upload));
        wait.until(ExpectedConditions.elementToBeClickable(activeStreamPage.Upload));
        activeStreamPage.Upload.click();

        WebElement file=  driver.findElement(By.xpath("//input[@name='bxu_files[]"));
        file.sendKeys("C:\\Users\\nigar\\Desktop\\Bitrix24 Framework assignment");






    }



                    }
