package com.Bitrix24.tests;
import com.Bitrix24.pages.ActiveStreamPage;
import com.Bitrix24.pages.LoginPage;
import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FilizUS2_4CreateAQuote extends TestBase{

    @Test(description = "User should be able to create a quote by clicking on the Comma icon")
    public void commaIcon()throws InterruptedException{
        extentTest = extentReports.createTest("User should be able to create a quote." );
        ActiveStreamPage activeStreamPage = new ActiveStreamPage();
        LoginPage loginPage=new LoginPage();
        loginPage.login();
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.taskLink));
        wait.until(ExpectedConditions.elementToBeClickable(activeStreamPage.taskLink));
        activeStreamPage.taskLink.click();
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.taskName));
        activeStreamPage.taskName.sendKeys("try");
        activeStreamPage.commaIcon.click();
        Driver.getDriver().switchTo().frame(activeStreamPage.frame1);
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.quoteInputText));
        activeStreamPage.quoteInputText.sendKeys("abcde");
        Driver.getDriver().switchTo().defaultContent();
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.sendBtn));
        wait.until(ExpectedConditions.elementToBeClickable(activeStreamPage.sendBtn));
        activeStreamPage.sendBtn.click();

        boolean staleElement = true;
        while(staleElement){
            try{
                driver.findElement(By.className("popup-window-button")).click();
                staleElement = false;
            } catch(StaleElementReferenceException e){
                staleElement = true;
            }
        }
        Driver.getDriver().switchTo().frame(activeStreamPage.frame2);
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.actualQuote));

        String expected="abcde";
        String actual=activeStreamPage.actualQuote.getText();
        Assert.assertEquals(actual,expected );
    }
}