package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leads_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class CompanyLeadSourcesSubtab extends BasePage {

    //Constructor
    public CompanyLeadSourcesSubtab(WebDriver driver) {
        super(driver);
    }

    //Overlay Locator
    private final By COMPANY_LEVEL_LEAD_SOURCES_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");

    //Company Level Lead Sources Tab General Locators
    private final By LEAD_SOURCES_SEARCH_FILTER_LOCATOR = By.cssSelector("input[class='form-search-field ']");
    private final By LEAD_SOURCES_SELECT_PROPERTY_DROPDOWN_FILTER_LOCATOR = By.id("lead_source_property");
    private final By LEAD_SOURCES_FILTER_BUTTON_LOCATOR = By.id("search-lead-source");
    private final By LEAD_SOURCES_RESET_FILTER_LINK_LOCATOR = By.id("reset-lead-source");
    private final By HIDE_INACTIVE_LEAD_SOURCES_TOGGLE_LOCATOR = By.id("toggle_sources");
    private final By ADD_LEAD_SOURCE_BUTTON_LOCATOR = By.cssSelector("a[class='button action right nomargin nohref  binded-nohref-click']");

    //Company Level Lead Sources List Locators
    private final By COMPANY_LEAD_SOURCES_LIST_LOCATOR = By.name("lead_sources");
    private final By COMPANY_LEAD_SOURCES_ACTIVE_COLUMN_HEADER = By.xpath("//th[text()='Active']");
    private final By COMPANY_LEAD_SOURCES_SOURCE_COLUMN_HEADER = By.xpath("//a[text()='Source']");
    private final By COMPANY_LEAD_SOURCES_ASSOCIATED_ILS_COLUMN_HEADER = By.xpath("//a[text()='Associated ILS']");
    private final By COMPANY_LEAD_SOURCE_LIST_PAGES_LOCATOR = By.cssSelector("ul[class='paging']");

    //Methods

    private void companyLeadSourcesOverlay() {
        waitForOverlay(COMPANY_LEVEL_LEAD_SOURCES_OVERLAY);
    }

    public boolean findLeadSourcesSearchPropertyFilterInCompanyLevel() {
        companyLeadSourcesOverlay();
        return confirmElementIsVisible(LEAD_SOURCES_SEARCH_FILTER_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean findSelectPropertyDropdownFilter_CompanyLevel() {
        return confirmElementIsVisible(LEAD_SOURCES_SELECT_PROPERTY_DROPDOWN_FILTER_LOCATOR);
    }

    public boolean findLeadSourcesFilterButton_CompanyLevel() {
        return confirmElementIsVisible(LEAD_SOURCES_FILTER_BUTTON_LOCATOR);
    }

    public boolean findLeadSourcesResetFilterLink_CompanyLevel() {
        return confirmElementIsVisible(LEAD_SOURCES_RESET_FILTER_LINK_LOCATOR);
    }

    public boolean findHideInactiveLeadSourcesToggle_CompanyLevel() {
        return confirmElementIsVisible(HIDE_INACTIVE_LEAD_SOURCES_TOGGLE_LOCATOR);
    }

    public boolean findAddLeadSourceButton_CompanyLevel() {
        return confirmElementIsVisible(ADD_LEAD_SOURCE_BUTTON_LOCATOR);
    }

    //Lead Source List Methods
    public boolean findLeadSourcesList_CompanyLevel() {
        return confirmElementIsVisible(COMPANY_LEAD_SOURCES_LIST_LOCATOR);
    }

    public boolean findActiveColumnHeader_CompanyLevel() {
        return confirmElementIsVisible(COMPANY_LEAD_SOURCES_ACTIVE_COLUMN_HEADER);
    }

    public boolean findSourceColumnHeader_CompanyLevel() {
        return confirmElementIsVisible(COMPANY_LEAD_SOURCES_SOURCE_COLUMN_HEADER);
    }

    public boolean findAssociatedILSColumnHeader_CompanyLevel() {
        return confirmElementIsVisible(COMPANY_LEAD_SOURCES_ASSOCIATED_ILS_COLUMN_HEADER);
    }

    public boolean confirmPagesVisibleOnLeadSourceListPage_CompanyLevel() {
        return confirmElementIsVisible(COMPANY_LEAD_SOURCE_LIST_PAGES_LOCATOR);
    }

}
