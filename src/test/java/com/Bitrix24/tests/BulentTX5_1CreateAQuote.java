package com.Bitrix24.tests;

import com.Bitrix24.pages.ActiveStreamPage;
import com.Bitrix24.pages.LoginPage;
import com.Bitrix24.utilities.BrowserUtilities;
import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.Bitrix24.tests.TestBase.extentReports;

public class BulentTX5_1CreateAQuote extends TestBase {
    @Test(description="User should be able to create a quote by clicking on the Comma icon.")
    public void createAQuote() throws InterruptedException {

        extentTest=extentReports.createTest ( " User should be able to create a quote by clicking on the Comma icon." );
        LoginPage loginPage=new LoginPage ();
        loginPage.login ();
        ActiveStreamPage activeStreamPage=new ActiveStreamPage ();
        activeStreamPage.sendMessageInput.click ();

        WebDriverWait wait=new WebDriverWait ( Driver.getDriver (), 10 );
        wait.until ( ExpectedConditions.visibilityOf ( activeStreamPage.quoteIcon ) );
        activeStreamPage.quoteIcon.click ();

        Driver.getDriver ().switchTo ().frame ( activeStreamPage.frame );
        wait.until ( ExpectedConditions.visibilityOf ( activeStreamPage.quoteInputText ) );

        activeStreamPage.quoteInputText.sendKeys ( "Text wil be here" );
        Driver.getDriver ().switchTo ().defaultContent ();

        wait.until ( ExpectedConditions.visibilityOf ( activeStreamPage.sendBtn ) );
        wait.until ( ExpectedConditions.elementToBeClickable ( activeStreamPage.sendBtn ) );

        activeStreamPage.sendBtn.click ();
        BrowserUtilities.wait ( 4 );
        String expected="Text wil be here";
        String actual=Driver.getDriver ().findElement ( By.xpath ( "//td[text()='Text wil be here']" ) ).getText ();
        Assert.assertEquals ( actual, expected );
    }
}