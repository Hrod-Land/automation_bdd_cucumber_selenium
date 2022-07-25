package runner;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.AccountHomePage;
import pages.TodoLyHomePage;

public class StepsAccountHomePage {

    AccountHomePage accountHomePage =  new AccountHomePage();
    TodoLyHomePage todoLyHomePage =  new TodoLyHomePage();

    @Then("account home page is displayed")
    public void theNewAccountIsCreatedAndLoggedIn() {
        Assertions.assertTrue(accountHomePage.main_content_panel.isElementDisplayed(), "ERROR, Account home page is not displayed");
    }

    @When("user access to Settings modal")
    public void userAccessToSettingsModal() {
        accountHomePage.settings_link.click();
    }

    @When("user click on Logout link")
    public void userClickOnLogoutLink() {
        accountHomePage.logout_link.click();
        Assertions.assertTrue(todoLyHomePage.todoLyNotAuthenticatedMainView_panel.isElementDisplayed());
    }
}
