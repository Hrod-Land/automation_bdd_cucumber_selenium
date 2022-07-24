package runner;

import io.cucumber.java.en.And;
import pages.SettingsModal;

public class StepsSettingsModal {

    SettingsModal settingsModal =  new SettingsModal();

    @And("then access to Profile tab in the Settings modal")
    public void thenAccessToProfileTabInTheSettingsModal() {
        settingsModal.profile_tab.click();
    }

    @And("accesses to Account tab in the Settings modal")
    public void accessesToAccountTabInTheSettingsModal() {
        settingsModal.account_tab.click();
    }
}
