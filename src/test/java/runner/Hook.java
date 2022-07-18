package runner;

import browser.WebBrowserSession;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class Hook {

    @Before
    public void setup(){
        System.out.println("pre-conditions .........!!!!!");
    }

    @After
    public void cleanup(){
        System.out.println("Post-testing.......!!!!!");
        WebBrowserSession.getInstance().closeSession();
    }
}
