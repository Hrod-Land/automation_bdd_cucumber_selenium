package pages;

import core.Button;
import core.TextBox;
import org.openqa.selenium.By;

public class LoginModal {
    public TextBox emailTxtBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail"));
    public TextBox passwordTxtBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword"));
    public Button loginButton = new Button(By.id("ctl00_MainContent_LoginControl1_ButtonLogin"));
}
