package pages;

import core.Button;
import core.Label;
import core.Panel;
import org.openqa.selenium.By;

public class TodoLyHomePage {
    public Button loginButton = new Button(By.xpath("//img[@src='/Images/design/pagelogin.png']"));
    public Button signUpFree =  new Button(By.xpath("//img [@src='/Images/design/pagesignup.png']"));
    public Panel todoLyNotAuthenticatedMainView_panel = new Panel(By.id("ctl00_MainContent_PanelNotAuth"));
    public Label errorSpan_label = new Label(By.id("ErrorMessageHeader"));

}
