package runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsCreateTodoLyAccount {
    @Given("the user access {string} url")
    public void theUserAccessUrl(String url) {
    }

    @When("user click on Sign Un Free button")
    public void userClickOnSignUnFreeButton() {
    }

    @Then("Signup modal is displayed")
    public void signupModalIsDisplayed() {
    }

    @When("user enter the name {string} on Full Name field")
    public void userEnterTheNameOnFullNameField(String user_name) {
    }

    @And("enters the email {string} on Email field")
    public void entersTheEmailOnEmailField(String email_address) {
    }

    @And("enters the password {string} on Password field")
    public void entersThePasswordOnPasswordField(String password) {
    }

    @And("checks the Terms of Service agreement checkbox")
    public void checksTheTermsOfServiceAgreementCheckbox() {
    }

    @And("click on Signup on the modal")
    public void clickOnSignupOnTheModal() {
    }

    @Then("the new account is created and logged in")
    public void theNewAccountIsCreatedAndLoggedIn() {
    }

    @And("home page for the new user is displayed")
    public void homePageForTheNewUserIsDisplayed() {
    }
}
