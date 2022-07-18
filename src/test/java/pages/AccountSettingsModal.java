package pages;

import core.Tab;
import org.openqa.selenium.By;

public class AccountSettingsModal {
    public Tab profile_tab = new Tab(By.id("//*[@id=\'settings_tabs\']/li/a[@href='#settings_Profile']"));
    public Tab account_tab = new Tab(By.id("//*[@class='ui-state-default ui-corner-top ui-tabs-selected ui-state-active']"));
}
