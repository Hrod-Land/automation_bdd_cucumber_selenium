package pages;

import core.Link;
import core.Panel;
import org.openqa.selenium.By;

public class AccountHomePage {
    public Panel main_content_panel = new Panel(By.id("ctl00_MainContent_PanelAuth"));
    public Link logout_link = new Link(By.id("ctl00_HeaderTopControl1_LinkButtonLogout"));
    public Link settings_link =  new Link(By.xpath("//*[@id='ctl00_HeaderTopControl1_PanelHeaderButtons']/a[1]"));
}
