package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.data_management_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PropertyDataManagementNav extends BasePage {

    public PropertyDataManagementNav(WebDriver driver) {
        super(driver);}

    //Data Management Tab Names
    private final By VENDORS_TAB = By.id("property_data_management_vendorsxxx");
    private final By LEASING_TAB = By.id("property_data_management_leasingxxx");

    //Data Management Tab Navigation Methods
    public boolean clickVendorsTab(){
        return clickElement(VENDORS_TAB);
    }

    public boolean clickLeasingTab() {
        return clickElement(LEASING_TAB);
    }

}