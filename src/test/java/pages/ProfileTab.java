package pages;

import core.Button;
import core.Panel;
import core.TextBox;
import org.openqa.selenium.By;

public class ProfileTab {

    public Panel settingsProfile_panel = new Panel(By.xpath("//div[@id='settings_Profile']"));
    public TextBox old_password_txt_area = new TextBox(By.id("TextPwOld"));
    public TextBox new_password_txt_area = new TextBox(By.id("TextPwNew"));
    public Button ok_button = new Button(By.xpath("//*[@class='ui-dialog-buttonset']/button[1]/span"));
}
