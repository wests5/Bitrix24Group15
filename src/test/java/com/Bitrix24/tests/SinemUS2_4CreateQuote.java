package com.Bitrix24.tests;
import com.Bitrix24.pages.ActiveStreamPage;
import com.Bitrix24.pages.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinemUS2_4CreateQuote extends TestBase {

    @Test(description = " User should be able to create a quote by clicking on the Comma icon.",dataProvider = "credentialsUsers")
    public void highPriority(String userName,String password)  {
        extentTest = extentReports.createTest("User should be able to create a quote by clicking on the Comma icon." );

        ActiveStreamPage activeStreamPage = new ActiveStreamPage();
        LoginPage loginPage=new LoginPage();
        loginPage.login(userName,password,false);
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.taskLink));
        wait.until(ExpectedConditions.elementToBeClickable(activeStreamPage.taskLink));
        activeStreamPage.taskLink.click();

        wait.until(ExpectedConditions.elementToBeClickable(activeStreamPage.commoIcon));
        activeStreamPage.commoIcon.click();

        Assert.assertTrue(activeStreamPage.quote.isDisplayed());

    }

    @DataProvider
    public Object[][] credentialsUsers()
    {
        return new Object[][]{
                {"helpdesk53@cybertekschool.com","UserUser"},
                {"hr53@cybertekschool.com","UserUser"},
                {"marketing53@cybertekschool.com","UserUser"}
        };
    }


}
