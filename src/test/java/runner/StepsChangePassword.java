package runner;

import com.beust.ah.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import pages.*;

public class StepsChangePassword {

    TodoLyHomePage todoLyHomePage =  new TodoLyHomePage();
    LoginModal loginModal = new LoginModal();
    SettingsModal accountSettingsModal = new SettingsModal();
    AccountHomePage accountHomePage = new AccountHomePage();
    SettingsModal settingsModal =  new SettingsModal();
    ProfileTab profileTab = new ProfileTab();

    @When("user click on Login button")
    public void userClickOnLoginButton() {
        todoLyHomePage.loginButton.click();
    }

    @And("enters {string} and {string} in Login modal")
    public void entersAndInLoginModal(String email, String password) {
        loginModal.emailTxtBox.writeText(email);
        loginModal.passwordTxtBox.writeText(password);
    }

    @And("click Login on the modal")
    public void clickLoginOnTheModal() {
        loginModal.loginButton.click();
    }

    @When("user access to Settings modal")
    public void userAccessToSettingsModal() {
        accountHomePage.settings_link.click();
    }

    @And("then access to Profile tab in the Settings modal")
    public void thenAccessToProfileTabInTheSettingsModal() {
        settingsModal.profile_tab.click();
    }

    @When("enter the {string} and {string}")
    public void enterTheAnd(String old_password, String new_password) {
        profileTab.old_password_txt_area.writeText(old_password);
        profileTab.new_password_txt_area.writeText(new_password);
    }

    @And("click OK in the Settings modal")
    public void clickOKInTheSettingsModal() {
        profileTab.ok_button.click();
    }

    @When("user click on Logout link")
    public void userClickOnLogoutLink() {
        accountHomePage.logout_link.click();
    }

    @Then("todo.ly home page is displayed")
    public void todoLyHomePageIsDisplayed() {
        todoLyHomePage.todoLy_NotAuthenticatedMainPanel.isElementDisplayed();
    }
}
