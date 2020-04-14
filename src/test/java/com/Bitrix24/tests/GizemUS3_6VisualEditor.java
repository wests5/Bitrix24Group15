package com.Bitrix24.tests;

import com.Bitrix24.pages.ActiveStreamPage;
import com.Bitrix24.pages.LoginPage;
import com.Bitrix24.utilities.BrowserUtilities;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class GizemUS3_6VisualEditor extends TestBase {


    @Test(dataProvider = "loginInfo")
    public void VisualEditorTest(String username, String password){
        extentTest = extentReports.createTest("User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box. ");
        LoginPage loginPage = new LoginPage();
        ActiveStreamPage activeStreamPage = new ActiveStreamPage();
        loginPage.login(username,password,false);
        BrowserUtilities.waitForVisibility(activeStreamPage.eventTab,5).click();
        BrowserUtilities.waitForVisibility(activeStreamPage.eventVisualEditor,5).click();
        assertTrue(BrowserUtilities.waitForVisibility(activeStreamPage.editorToolBar,5).isDisplayed());
    }

    @DataProvider
    public Object[][] loginInfo() {
        return new Object[][]{
                {"helpdesk54@cybertekschool.com","UserUser"},
                {"hr55@cybertekschool.com","UserUser"},
                {"marketing54@cybertekschool.com","UserUser"}
        };
    }
}
