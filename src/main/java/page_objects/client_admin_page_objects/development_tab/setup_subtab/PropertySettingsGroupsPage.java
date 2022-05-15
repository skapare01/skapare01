package page_objects.client_admin_page_objects.development_tab.setup_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PropertySettingsGroupsPage extends BasePage {
    public PropertySettingsGroupsPage(WebDriver driver){
        super(driver);}

    private final By ADD_PROPERTY_SETTING_GROUP = By.cssSelector(".js-add-group");
    private final By QUICK_SEARCH = By.id("property_setting_group_quick_search");

    public boolean findAddPropertySettingGroup(){return confirmElementIsVisible(ADD_PROPERTY_SETTING_GROUP);}
    public boolean findQuickSearch(){return confirmElementIsVisible(QUICK_SEARCH);}

}
