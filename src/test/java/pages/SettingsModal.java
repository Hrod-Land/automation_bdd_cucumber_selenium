package pages;

import core.Panel;
import core.Tab;
import org.openqa.selenium.By;

public class SettingsModal {

    public Panel settingsModal_panel =  new Panel (By.xpath("//div[@role='dialog']"));
    public Tab profile_tab = new Tab(By.xpath("//*[@id=\"settings_tabs\"]/li[1]/a"));
    public Tab account_tab = new Tab(By.xpath("//*[@id=\"settings_tabs\"]/li[5]/a"));
}
