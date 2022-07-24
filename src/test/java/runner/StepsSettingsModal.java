package runner;

import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pages.AccountTab;
import pages.ProfileTab;
import pages.SettingsModal;

public class StepsSettingsModal {

    SettingsModal settingsModal =  new SettingsModal();
    ProfileTab profileTab = new ProfileTab();
    AccountTab accountTab = new AccountTab();

    @And("then access to Profile tab in the Settings modal")
    public void thenAccessToProfileTabInTheSettingsModal() {
        settingsModal.profile_tab.click();
        Assertions.assertTrue(profileTab.settingsProfile_panel.isElementDisplayed());
    }

    @And("accesses to Account tab in the Settings modal")
    public void accessesToAccountTabInTheSettingsModal() {
        settingsModal.account_tab.click();
        Assertions.assertTrue(accountTab.settingsAccount_panel.isElementDisplayed());
    }
}
