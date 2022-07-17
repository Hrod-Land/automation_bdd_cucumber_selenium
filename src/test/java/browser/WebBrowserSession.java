package browser;

import org.openqa.selenium.WebDriver;

public class WebBrowserSession {

    private static WebBrowserSession webBrowserSession = null;
    private WebDriver browser;

    private WebBrowserSession(){
        browser = FactoryBrowser.make("chrome").create();
    }

    public static WebBrowserSession getInstance(){
        if (webBrowserSession == null)
            webBrowserSession = new WebBrowserSession();
        return webBrowserSession;
    }

    public void closeSession(){
        browser.quit();
        webBrowserSession = null;
    }

    public WebDriver getBrowser(){
        return browser;
    }
}
