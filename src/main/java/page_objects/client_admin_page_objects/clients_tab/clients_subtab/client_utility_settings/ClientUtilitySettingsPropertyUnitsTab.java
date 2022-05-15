package page_objects.client_admin_page_objects.clients_tab.clients_subtab.client_utility_settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ClientUtilitySettingsPropertyUnitsTab extends BasePage {

    public ClientUtilitySettingsPropertyUnitsTab(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By PROPERTY_UNITS_TABLE = By.id("frm_property_unit_utility_type");

    //Methods
    public boolean confirmPropertyUnitsTableIsVisible() {
        return confirmElementIsVisible(PROPERTY_UNITS_TABLE);
    }

}