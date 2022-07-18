package pages;

import core.Button;
import core.TextBox;
import org.openqa.selenium.By;

public class AccountProfileSettings {
    public TextBox old_password_txt_area = new TextBox(By.id("TextPwOld"));
    public TextBox new_password_txt_area = new TextBox(By.id("TextPwNew"));
    public Button ok_button = new Button(By.id("//*[@class='ui-dialog-buttonset']/button[1]/span"));
}
