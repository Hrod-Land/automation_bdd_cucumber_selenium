package runner;

import browser.WebBrowserSession;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.AccountHomePage;
import pages.SettingsModal;
import pages.SignupModal;
import pages.TodoLyHomePage;

public class StepsCreateTodoLyAccount {

    TodoLyHomePage todoLyHomePage = new TodoLyHomePage();
    SignupModal signupModal = new SignupModal();
    AccountHomePage accountHomePage =  new AccountHomePage();
    SettingsModal accountSettingsModal = new SettingsModal();


//    private void cleanup(){
//        accountHomePage.settings_link.click();
//        accountSettingsModal.account_tab.click();
//    }

    @Given("the user accesses {string} url")
    public void theUserAccessUrl(String url) {
        WebBrowserSession.getInstance().getBrowser().get(url);
    }

    @And("user click on Sign Un Free button")
    public void userClickOnSignUnFreeButton() {
        todoLyHomePage.signUpFree.click();
    }

    @When("user enter the name {string} on Full Name field")
    public void userEnterTheNameOnFullNameField(String user_name) {
        signupModal.user_nameTxTBox.writeText(user_name);
    }

    @And("enters the email {string} on Email field")
    public void entersTheEmailOnEmailField(String email_address) {
        signupModal.emailTxtBox.writeText(email_address);
    }

    @And("enters the password {string} on Password field")
    public void entersThePasswordOnPasswordField(String password) {
        signupModal.passwordTxtBox.writeText(password);
    }

    @And("checks the Terms of Service agreement checkbox")
    public void checksTheTermsOfServiceAgreementCheckbox() {
        signupModal.checkboxChkBox.click();
    }

    @And("click on Signup on the modal")
    public void clickOnSignupOnTheModal() {
        signupModal.signupButton.click();
    }

    @Then("account home page is displayed")
    public void theNewAccountIsCreatedAndLoggedIn() {
        Assertions.assertTrue(accountHomePage.main_content_panel.isElementDisplayed(), "ERROR, Account not created");
        Assertions.assertTrue(accountHomePage.logout_link.isElementDisplayed(), "ERROR: Account not created");
    }
}
