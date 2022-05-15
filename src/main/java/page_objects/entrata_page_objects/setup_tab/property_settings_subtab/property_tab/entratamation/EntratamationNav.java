package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.entratamation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class EntratamationNav extends BasePage {

    public EntratamationNav(WebDriver driver) {
        super(driver);}

    private final By COMMUNITY_ACCESS_TAB = By.id("property_details_entratamation_community_accessxxx");
    private final By INSTALLATION_SETUP_TAB = By.id("property_details_entratamation_installation_setupxxx");
    private final By SITE_TOUR_TAB = By.id("property_details_entratamation_installation_setupxxx");
    private final By SMART_AMENITIES_TAB = By.id("property_details_entratamation_smart_amenitiesxxx");
    private final By INTEGRATION_PARTNERS_TAB = By.id("property_details_entratamation_integration_partnersxxxx");
    private final By SMART_COMMON_AREA_TAB = By.id("property_details_entratamation_smart_common_areaxxx");
    private final By SMART_UNITS_TAB = By.id("property_details_entratamation_smart_unitsxxx");

    public boolean clickCommunityAccessTab() {
        return clickElement(COMMUNITY_ACCESS_TAB);
    }

    public boolean installationSetupTabClick() {
        return clickElement(INSTALLATION_SETUP_TAB);
    }

    public boolean siteTourTabClick() {
        return clickElement(SITE_TOUR_TAB);
    }

    public boolean smartAmenitiesTabClick() {
        return clickElement(SMART_AMENITIES_TAB);
    }

    public boolean integrationPartnersTabClick() {
        return clickElement(INTEGRATION_PARTNERS_TAB);
    }

    public boolean smartCommonAreaTabClick() {
        return clickElement(SMART_COMMON_AREA_TAB);
    }

    public boolean smartUnitsTabClick() {
        return clickElement(SMART_UNITS_TAB);
    }
}
