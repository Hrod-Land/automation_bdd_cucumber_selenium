package runner;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.AccountHomePage;

public class StepsAccountHomePage {

    AccountHomePage accountHomePage =  new AccountHomePage();

    @Then("account home page is displayed")
    public void theNewAccountIsCreatedAndLoggedIn() {
        Assertions.assertTrue(accountHomePage.main_content_panel.isElementDisplayed(), "ERROR, Account not created");
        Assertions.assertTrue(accountHomePage.logout_link.isElementDisplayed(), "ERROR: Account not created");
    }

    @When("user access to Settings modal")
    public void userAccessToSettingsModal() {
        accountHomePage.settings_link.click();
    }

    @When("user click on Logout link")
    public void userClickOnLogoutLink() {
        accountHomePage.logout_link.click();
    }
}
