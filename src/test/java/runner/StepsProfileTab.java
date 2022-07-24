package runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.AccountHomePage;
import pages.ProfileTab;

public class StepsProfileTab {

    ProfileTab profileTab = new ProfileTab();
    AccountHomePage accountHomePage = new AccountHomePage();

    @When("enter the {string} and {string}")
    public void enterTheAnd(String old_password, String new_password) {
        profileTab.old_password_txt_area.writeText(old_password);
        profileTab.new_password_txt_area.writeText(new_password);
    }

    @And("click OK in the Settings modal")
    public void clickOKInTheSettingsModal() {
        profileTab.ok_button.click();
        Assertions.assertTrue(accountHomePage.main_content_panel.isElementDisplayed());
    }
}
