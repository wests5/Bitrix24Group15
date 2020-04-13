package com.Bitrix24.tests;

import com.Bitrix24.pages.ActiveStreamPage;
import com.Bitrix24.pages.LoginPage;
import com.Bitrix24.utilities.BrowserUtilities;
import com.Bitrix24.utilities.Driver;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.Bitrix24.tests.TestBase.extentReports;

public class AshyrUS1_5CreateAQuote extends TestBase {
    @Test(description = "User should be able to create a quote by clicking on the Comma icon.")
    public void createAQuote() throws InterruptedException {
        extentTest = extentReports.createTest(" User should be able to create a quote by clicking on the Comma icon." );
        LoginPage loginPage = new LoginPage();
        loginPage.login();

        ActiveStreamPage activeStreamPage = new ActiveStreamPage();
        activeStreamPage.sendMessageInput.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.quoteIcon));
        wait.until(ExpectedConditions.elementToBeClickable(activeStreamPage.quoteIcon));
        activeStreamPage.quoteIcon.click();
        Driver.getDriver().switchTo().frame(activeStreamPage.frame);
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.quoteInputText));

        activeStreamPage.quoteInputText.sendKeys("Testing User Story 1-5: Creating a quote");
        Driver.getDriver().switchTo().defaultContent();
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.sendBtn));
        wait.until(ExpectedConditions.elementToBeClickable(activeStreamPage.sendBtn));
        activeStreamPage.sendBtn.click();
        String expected="Testing User Story 1-5: Creating a quote";
        String actual=Driver.getDriver().findElement(By.xpath("//td[text()='Testing User Story 1-5: Creating a quote']")).getText();
        Assert.assertEquals(actual,expected );
    }


}
