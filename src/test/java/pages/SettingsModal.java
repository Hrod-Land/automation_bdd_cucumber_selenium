package pages;

import core.Tab;
import org.openqa.selenium.By;

public class SettingsModal {
    public Tab profile_tab = new Tab(By.xpath("//*[@id=\"settings_tabs\"]/li[1]/a"));
    public Tab account_tab = new Tab(By.xpath("//*[@id=\"settings_tabs\"]/li[5]/a"));
}
