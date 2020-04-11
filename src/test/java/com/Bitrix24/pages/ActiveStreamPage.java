package com.Bitrix24.pages;

import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveStreamPage {
    public ActiveStreamPage() {
        PageFactory.initElements ( Driver.getDriver (), this );
    }

    @FindBy(id="microoPostFormLHE_blogPostForm_inner")
    public WebElement sendMessageInput;

    @FindBy(css="span[title='Link']")
    public WebElement linkIcon;
    @FindBy(id="linkidPostFormLHE_blogPostForm-text")
    public WebElement linkLinkText;
    @FindBy(id="linkidPostFormLHE_blogPostForm-href")
    public WebElement linkLinkUrl;
    @FindBy(css="[value='Save']")
    public WebElement linkSaveBtn;
    @FindBy(id="blog-submit-button-save")
    public WebElement sendBtn;
    @FindBy(xpath="/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[1]/div/div[2]/div[3]/div[2]/span[3]/span")
    public WebElement videoIcon;
    @FindBy(id="video_idPostFormLHE_blogPostForm-source")
    public WebElement videoURL;
    @FindBy(id="undefined")
    public WebElement saveVideoBtn;
    @FindBy(xpath="//*[@id=\"bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm\"]/div")
    public WebElement editor;
    @FindBy(xpath="//*[@id=\"bx-b-quote-blogPostForm\"]/span")
    public WebElement addQuote;
    @FindBy(xpath="/html/body/blockquote")
    public WebElement enterText;
    @FindBy(xpath="//*[@id=\"blog-submit-button-save\"]")
    public WebElement send;
}