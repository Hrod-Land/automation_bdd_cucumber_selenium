package pages;

import browser.WebBrowserSession;
import core.Button;
import core.Panel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountTab {

    public Panel settingsAccount_panel = new Panel(By.id("settings_Account"));//(By.xpath("//div[@id='settings_Account']"));//id =settings_Account
    public Button delete_account_button = new Button(By.id("DeleteAccountBtn"));

}
