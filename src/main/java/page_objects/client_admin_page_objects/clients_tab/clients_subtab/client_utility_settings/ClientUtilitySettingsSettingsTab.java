package page_objects.client_admin_page_objects.clients_tab.clients_subtab.client_utility_settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ClientUtilitySettingsSettingsTab extends BasePage {

    public ClientUtilitySettingsSettingsTab(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By PROPERTY_UTILITY_SETTINGS_BILLING = By.id("property_utility_settings_billing");

    //Methods
    public boolean confirmPropertySettingsBillingIsVisible() {
        return confirmElementIsVisible(PROPERTY_UTILITY_SETTINGS_BILLING);
    }

}