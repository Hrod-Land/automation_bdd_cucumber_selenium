package runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.AccountHomePage;
import pages.SignupModal;

public class StepsSignupModal {

    SignupModal signupModal = new SignupModal();
    AccountHomePage accountHomePage = new AccountHomePage();

    @When("user enters the {string} on Full Name field")
    public void userEntersTheOnFullNameField(String user_name) {
        signupModal.user_nameTxTBox.writeText(user_name);
    }

    @And("enters the {string} on Email field")
    public void entersTheOnEmailField(String email) {
        signupModal.emailTxtBox.writeText(email);
    }

    @And("enters the {string} on Password field")
    public void entersTheOnPasswordField(String password) {
        signupModal.passwordTxtBox.writeText(password);
    }

    @And("checks the Terms of Service agreement checkbox")
    public void checksTheTermsOfServiceAgreementCheckbox() {
        signupModal.checkboxChkBox.click();
    }

    @And("click on Signup on the modal")
    public void clickOnSignupOnTheModal() {
        signupModal.signupButton.click();
        Assertions.assertTrue(accountHomePage.main_content_panel.isElementDisplayed());
    }
}
