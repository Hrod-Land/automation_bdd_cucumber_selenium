package runner;

import browser.WebBrowserSession;
import io.cucumber.java.en.And;
import org.openqa.selenium.Alert;
import pages.AccountTab;

import java.util.concurrent.TimeUnit;

public class StepsAccountTab {

    AccountTab accountTab = new AccountTab();
    @And("click on Delete Account with All Data button in Settings modal")
    public void clickOnDeleteAccountWithAllDataButtonInSettingsModal() {
        accountTab.delete_account_button.click();
    }

    @And("click on OK button of browser alert displayed")
    public void clickOnOKButtonOfBrowserAlertDisplayed() {
        try {
            TimeUnit.SECONDS.sleep(1);
            Alert browserAlert = WebBrowserSession.getInstance().getBrowser().switchTo().alert();
            browserAlert.accept();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
