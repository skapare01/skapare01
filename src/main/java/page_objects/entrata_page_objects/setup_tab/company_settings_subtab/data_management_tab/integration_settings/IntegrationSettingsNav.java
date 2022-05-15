package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.data_management_tab.integration_settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class IntegrationSettingsNav extends BasePage {

    public IntegrationSettingsNav(WebDriver driver) {
        super(driver);
    }

    //Tab Names
    private final By TRANSMISSION_VENDORS = By.id("li_sub_nav_company_transmission_vendorsxxx");

    //Tab Navigation Methods
    public boolean clickTransmissionVendorsTab() {
        return clickElement(TRANSMISSION_VENDORS);
    }

}