package runner;

import browser.WebBrowserSession;
import io.cucumber.java.en.And;
import org.openqa.selenium.Alert;
import pages.AccountTab;
import pages.SettingsModal;

import java.util.concurrent.TimeUnit;

public class StepsDeleteAccount {

    AccountTab accountTab = new AccountTab();
    SettingsModal settingsModal = new SettingsModal();

    @And("accesses to Account tab in the Settings modal")
    public void accessesToAccountTabInTheSettingsModal() {
        settingsModal.account_tab.click();
    }

    @And("click on Delete Account with All Data button in Settings modal")
    public void clickOnDeleteAccountWithAllDataButtonInSettingsModal() {
        accountTab.delete_account_button.click();
    }

    @And("click on OK button of browser alert displayed")
    public void clickOnOKButtonOfBrowserAlertDisplayed() {
        try {
            TimeUnit.SECONDS.sleep(2);
            Alert browserAlert = WebBrowserSession.getInstance().getBrowser().switchTo().alert();
            browserAlert.accept();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
