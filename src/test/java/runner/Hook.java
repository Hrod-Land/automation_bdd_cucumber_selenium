package runner;

import browser.WebBrowserSession;
import io.cucumber.java.*;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class Hook {

    @Before
    public void setup() {
        System.out.println("Under development");
    }

    @After
    public void cleanup(Scenario scenario) {
        if((scenario.getName().equalsIgnoreCase("As an end user I want to create an account in todo.ly"))){
            System.out.println("Under development");
        }
        else {
            System.out.println("Under development");
        }
        WebBrowserSession.getInstance().closeSession();
    }
}
