package com.Bitrix24.pages;

import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AnnouncementPage {
    public AnnouncementPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    WebElement uploadIcon;

    @FindBy(xpath = "(//table[@class='diskuf-selector-table wd-fa-add-file-light-table'])[1]//tr[1]//td[1]")
    WebElement dragAndUploadBtn;

    @FindBy(xpath = "(//table[@class='diskuf-selector-table wd-fa-add-file-light-table'])[1]//tr[1]//td[1]//input")
    WebElement fileInput;

    @FindBy(id = "blog-submit-button-save")
    WebElement sendBtn;

    @FindBy(xpath = "//span[@class='f-wrap']")
    WebElement loadedFile;

    public void getToAnnouncementPage()  {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        ActiveStreamPage activeStreamPage = new ActiveStreamPage();
        activeStreamPage.moreTabBtn.click();
        wait.until(ExpectedConditions.presenceOfElementLocated
                (By.xpath("//div[@id='menu-popup-feed-add-post-form-popup']//*[contains(text(),'Announcement')]"))).click();


    }

    public void clickOnUploadIcon(){
        Driver.getDriver().findElement(By.id("bx-b-uploadfile-blogPostForm")).click();
           }

    public void setDragAndUploadBtn(String file){
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(dragAndUploadBtn).build().perform();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath
                ("(//table[@class='diskuf-selector-table wd-fa-add-file-light-table'])[1]//tr[1]//td[1]")));
        fileInput.sendKeys(file);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='f-wrap']")));
    }

    public void waitForFileloaded(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='f-wrap']")));
    }

    public WebElement getLoadedFile() {
        return loadedFile;
    }
}
