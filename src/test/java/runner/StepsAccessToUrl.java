package runner;

import browser.WebBrowserSession;
import io.cucumber.java.en.Given;

public class StepsAccessToUrl {
    @Given("the user accesses {string} url")
    public void theUserAccessUrl(String url) {
        WebBrowserSession.getInstance().getBrowser().get(url);
    }
}
