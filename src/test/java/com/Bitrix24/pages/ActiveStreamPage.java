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
    @FindBy(xpath="//*[@id=\"bx-b-uploadfile-blogPostForm\"]")
    public WebElement upload;
    @FindBy(xpath="//*[@id=\"bx-b-video-blogPostForm\"]/span")
    public WebElement videoIcon;
    @FindBy(id="video_idPostFormLHE_blogPostForm-source")
    public WebElement videoURL;
    @FindBy(xpath="//*[@id=\"undefined\"]")
    public WebElement saveVideoBtn;

    @FindBy(xpath = "//*[@id=\"post-buttons-bottom\"]/span[7]")
    public WebElement RecordVideo;
    @FindBy (id="popup-window-content-bx-popup-videomessage-popup")
    public WebElement DeviceAccess;
    @FindBy (xpath= "//*[@id=\"bx-popup-videomessage-popup\"]/div[3]/span[1]")
    public WebElement AllowAccess;
    @FindBy (xpath= "//*[@id=\"popup-window-titlebar-bx-popup-videomessage-popup\"]/span")
    public WebElement Error;
    @FindBy (id="popup-window-content-bx-popup-videomessage-popup")
    public WebElement errorMessage;

    @FindBy(xpath = "//span[@title='Quote text']")

    public WebElement quoteIcon;
    @FindBy(className = "bx-editor-iframe")
    public WebElement frame;
    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement quoteInputText;




    @FindBy(id = "feed-add-post-form-link-text")
    protected WebElement moreTabBtn;

    @FindBy(id = "lhe_button_title_blogPostForm")
    public WebElement topicButton;

    @FindBy(id = "#blog-title")
    public WebElement messageTopicBox;

    @FindBy(id = "POST_TITLE")
    public WebElement topicBoxtext;
    @FindBy(id = "feed-add-post-form-tab-calendar")
    public WebElement eventTab;
    @FindBy(id = "bx-html-editor-tlbr-oCalEditorcal_3Jcl")
    public WebElement editorToolBar;
    @FindBy(id = "lhe_button_editor_blogPostForm_calendar")
    public WebElement eventVisualEditor;

}

