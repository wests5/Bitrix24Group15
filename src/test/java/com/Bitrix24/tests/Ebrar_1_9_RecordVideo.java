import com.Bitrix24.pages.ActiveStreamPage;
import com.Bitrix24.pages.LoginPage;
import com.Bitrix24.tests.TestBase;
import com.Bitrix24.utilities.BrowserUtilities;
import com.Bitrix24.utilities.Driver;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Ebrar_1_9_RecordVideo extends TestBase {

    @Test(description = " User should be able to click Record Video tab to record a video and attach it with the message.")
    public void attachLink() throws TimeoutException {
        extentTest = extentReports.createTest("User should be able to click Record Video tab to record a video and attach it with the message" );
        LoginPage loginPage = new LoginPage();
        loginPage.login();

        ActiveStreamPage activeStreamPage = new ActiveStreamPage();
        activeStreamPage.sendMessageInput.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.RecordVideo));
        wait.until(ExpectedConditions.elementToBeClickable(activeStreamPage.RecordVideo));
        activeStreamPage.RecordVideo.click();
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.DeviceAccess));
        activeStreamPage.AllowAccess.click();
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.Error));
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.errorMessage));




    }
}