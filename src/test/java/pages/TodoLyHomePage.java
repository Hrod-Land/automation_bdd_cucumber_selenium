package pages;

import core.Button;
import org.openqa.selenium.By;

public class TodoLyHomePage {
    public Button loginButton = new Button(By.xpath("//img[@src='/Images/design/pagelogin.png']"));
    public Button signUpFree =  new Button(By.xpath("//img [@src='/Images/design/pagesignup.png']"));
}
