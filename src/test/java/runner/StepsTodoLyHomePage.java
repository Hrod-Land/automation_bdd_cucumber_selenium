package runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TodoLyHomePage;

public class StepsTodoLyHomePage {

    TodoLyHomePage todoLyHomePage =  new TodoLyHomePage();

    @Then("todo.ly home page is displayed")
    public void todoLyHomePageIsDisplayed() {
        todoLyHomePage.todoLyNotAuthenticatedMainView_panel.isElementDisplayed();
    }

    @When("user click on Login button")
    public void userClickOnLoginButton() {
        todoLyHomePage.loginButton.click();
    }

    @And("user click on Sign Un Free button")
    public void userClickOnSignUnFreeButton() {
        todoLyHomePage.signUpFree.click();
    }
}
