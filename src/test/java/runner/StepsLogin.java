package runner;

import io.cucumber.java.en.And;
import pages.*;

public class StepsLogin {

    LoginModal loginModal = new LoginModal();

    @And("enters {string} and {string} in Login modal")
    public void entersAndInLoginModal(String email, String password) {
        loginModal.emailTxtBox.writeText(email);
        loginModal.passwordTxtBox.writeText(password);
    }

    @And("click Login on the modal")
    public void clickLoginOnTheModal() {
        loginModal.loginButton.click();
    }
}
