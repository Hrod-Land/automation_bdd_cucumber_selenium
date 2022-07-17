package core;

import browser.WebBrowserSession;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import session.Session;

public class GraphElement {

    protected WebElement webElement;
    protected By locator;

    public GraphElement(By locator){
        this.locator =  locator;
    }

    protected void findElement(){
        webElement = WebBrowserSession.getInstance().getBrowser().findElement(locator);
    }

    public void click(){
        this.findElement();
        webElement.click();
    }

    public boolean isElementDisplayed(){
        try{
            this.findElement();
            return webElement.isDisplayed();
        } catch (Exception e){
            return false;
        }
    }
}
