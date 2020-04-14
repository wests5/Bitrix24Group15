package com.Bitrix24.pages;

import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveStreamPage {

    public ActiveStreamPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "microoPostFormLHE_blogPostForm_inner")
    public WebElement sendMessageInput;
    @FindBy(css = "span[title='Link']")
    public WebElement linkIcon;
    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement linkLinkText;
    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkLinkUrl;
    @FindBy(css = "[value='Save']")
    public WebElement linkSaveBtn;
    @FindBy(id = "blog-submit-button-save")
    public WebElement sendBtn;
    @FindBy(id = "feed-add-post-form-link-more")
    public WebElement More;
    @FindBy(xpath = "//span[@class='menu-popup-item-text' and contains(text(),'Announcement')]")
    public WebElement Announcement;
    @FindBy(css = "[title='Visual editor']")
    public WebElement Visual_Editor;
    @FindBy(id = "bx-html-editor-tlbr-idPostFormLHE_blogPostForm")
    public WebElement text_bar;

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-tasks']//span[contains(text(),'Task')]")
    public WebElement taskLink;
    @FindBy(id = "tasks-task-priority-cb")
    public WebElement highPriorityCheckbox;

    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement addMentionIcon;
    @FindBy(linkText = "Employees and departments")
    public WebElement employeesAndDepartments;
    @FindBy(xpath = "(//div[@class='bx-finder-company-department-employee-name'])[1]")
    public WebElement firstContact;
    @FindBy(xpath = "(//div[@class='bx-finder-company-department-employee-name'])[2]")
    public WebElement secondContact;
    @FindBy(xpath = "(//span[@class='feed-add-post-destination-text'])[2]")
    public WebElement firstContactIntoMentionBox;
    @FindBy(xpath = "(//span[@class='feed-add-post-destination-text'])[3]")
    public WebElement secondContactIntoMentionBox;

    @FindBy(xpath = "//div[@id='bx-html-editor-iframe-cnt-lifefeed_task_form']//iframe[@class='bx-editor-iframe']")
    public WebElement frame1;
    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement quoteInputText;
    @FindBy(name= "ACTION[0][ARGUMENTS][data][TITLE]")
    public WebElement taskName;
    @FindBy(id= "bx-b-quote-task-form-lifefeed_task_form")
    public WebElement commaIcon;
    @FindBy(className= "side-panel-iframe")
    public WebElement frame2;
    @FindBy(xpath = "//td[contains(text(),'abcde')]")
    public WebElement actualQuote;




}
