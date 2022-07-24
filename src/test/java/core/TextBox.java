package core;

import org.openqa.selenium.By;

public class TextBox extends GraphElement{
    public TextBox(By locator) {
        super(locator);
    }

    public void writeText(String value){
        findElement();
        webElement.clear();
        webElement.sendKeys(value);
    }

    public String getText(){
        findElement();
        return webElement.getText();
    }

}
