package page_objects.client_admin_page_objects.development_tab.setup_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PropertySettingsKeyPage extends BasePage {
    public PropertySettingsKeyPage(WebDriver driver){
        super(driver); }
    private final By QUICK_SEARCH = By.id("property_setting_key_quick_search");
    private final By ADD_SETTING_KEY = By.cssSelector(".js-add-key");


    public boolean findQuickSearch(){return confirmElementIsVisible(QUICK_SEARCH);}
    public boolean findAddSettingKey(){return confirmElementIsVisible(ADD_SETTING_KEY);}
}
