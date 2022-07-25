package pages;

import core.Button;
import core.Panel;
import org.openqa.selenium.By;

public class AccountTab {

    public Panel settingsAccount_panel = new Panel(By.id("settings_Account"));
    public Button delete_account_button = new Button(By.id("DeleteAccountBtn"));

}
