package runner;

import browser.WebBrowserSession;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import pages.AccountTab;
import pages.TodoLyHomePage;

import java.util.concurrent.TimeUnit;

public class StepsAccountTab {

    AccountTab accountTab = new AccountTab();
    TodoLyHomePage todoLyHomePage = new TodoLyHomePage();
    @And("click on Delete Account with All Data button in Settings modal")
    public void clickOnDeleteAccountWithAllDataButtonInSettingsModal() {
        accountTab.delete_account_button.click();
    }

    @And("click on OK button of browser alert displayed")
    public void clickOnOKButtonOfBrowserAlertDisplayed() {
        try {
            WebBrowserSession.getInstance().getBrowser().switchTo().alert().accept();
            WebBrowserSession.getInstance().getBrowser().switchTo().window(WebBrowserSession.getInstance().getBrowser().getWindowHandle());
            Assertions.assertTrue(todoLyHomePage.todoLyNotAuthenticatedMainView_panel.isElementDisplayed());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
