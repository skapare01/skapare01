package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leads_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class LeadsNav extends BasePage {

    //Constructor
    public LeadsNav(WebDriver driver) {
        super(driver);
    }

    //Leads Tab Locators
    private final By LEAD_SOURCES_SUB_TAB_LOCATOR = By.id("li_nav_lead_sourcesxxx");
    private final By ILS_PORTAL_SUB_TAB_LOCATOR = By.id("li_nav_ils_portalxxx");

    //Methods
    public boolean navigateToLeadSourcesSubTab_CompanySettings() {
        return clickElement(LEAD_SOURCES_SUB_TAB_LOCATOR);
    }

    public boolean navigateToILSPortalSubTab_CompanySettings() {
        return clickElement(LEAD_SOURCES_SUB_TAB_LOCATOR);
    }

}
