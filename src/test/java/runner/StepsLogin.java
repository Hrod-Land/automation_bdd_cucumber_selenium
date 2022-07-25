package runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_old.Ac;
import org.junit.jupiter.api.Assertions;
import pages.*;

public class StepsLogin {

    LoginModal loginModal = new LoginModal();
    AccountHomePage accountHomePage =  new AccountHomePage();
    TodoLyHomePage todoLyHomePage = new TodoLyHomePage();

    @And("enters {string} and {string} in Login modal")
    public void entersAndInLoginModal(String email, String password) {
        loginModal.emailTxtBox.writeText(email);
        loginModal.passwordTxtBox.writeText(password);
    }

    @And("click Login on the modal")
    public void clickLoginOnTheModal() {
        loginModal.loginButton.click();
        Assertions.assertTrue(accountHomePage.main_content_panel.isElementDisplayed());
    }

    @Then("click on login and login modal still displayed")
    public void loginModalStillDisplayed() {
        loginModal.loginButton.click();
        Assertions.assertTrue(todoLyHomePage.errorSpan_label.isElementDisplayed());
//        Assertions.assertTrue(loginModal.loginModal_panel.isElementDisplayed());

    }
}
