package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.leasing_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PropertyLeasingNav extends BasePage {

    public PropertyLeasingNav(WebDriver driver) {
        super(driver);}

    private final By LEASE_SUB_TAB = By.id("property_leasing_leasexxx");
    private final By APPLICATION = By.id("property_leasing_application_systemxxx");
    private final By PROPERTY_SCREENING_SUB_TAB = By.id("property_data_management_leasing_screeningxxx");
    private final By LEASING_CENTER_SUB_TAB = By.id("property_leasing_leasing_centerxxx");

    public boolean clickLeaseSubtab(){return clickElement(LEASE_SUB_TAB);}

    public boolean clickScreeningSubtab(){return clickElement(PROPERTY_SCREENING_SUB_TAB);}

    public boolean clickApplication(){return clickElement(APPLICATION);}

    public boolean clickLeasingCenterSubTab() {
        return clickElement(LEASING_CENTER_SUB_TAB);
    }
}

