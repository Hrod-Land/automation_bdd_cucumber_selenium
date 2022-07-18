package pages;

import core.Button;
import core.CheckBox;
import core.TextBox;
import org.openqa.selenium.By;

public class SignupModal {
    public TextBox user_nameTxTBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName"));
    public TextBox emailTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail"));
    public TextBox passwordTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"));
    public CheckBox checkboxChkBox = new CheckBox(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms"));
    public Button signupButton = new Button(By.id("ctl00_MainContent_SignupControl1_ButtonSignup"));
}
