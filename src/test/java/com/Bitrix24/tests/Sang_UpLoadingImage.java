package com.Bitrix24.tests;


import com.Bitrix24.pages.AnnouncementPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sang_UpLoadingImage extends TestBase {

    @Test
    public void testSevenDashOne(){


        AnnouncementPage announcementPage = new AnnouncementPage();
        announcementPage.getToAnnouncementPage();
        announcementPage.clickOnUploadIcon();
        String file = System.getProperty("user.dir") + "\\hulkavatar.jpg";
        announcementPage.setDragAndUploadBtn(file);
        announcementPage.waitForFileloaded();

        Assert.assertTrue(announcementPage.getLoadedFile().getText().contains("hulkavatar.jpg"));
 }
}
