package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.marketing_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PropertyLeadSourcesSubtab extends BasePage {

    //Constructor
    public PropertyLeadSourcesSubtab(WebDriver driver) {
        super(driver);
    }

    //Overlay Locator
    private final By PROPERTY_LEVEL_LEAD_SOURCES_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");

    //Property Level Lead Sources Tab General Locators
    private final By PROPERTY_LEAD_SOURCES_SEARCH_FILTER_LOCATOR = By.name("lead_source[name]");
    private final By PROPERTY_LEAD_SOURCES_FILTER_BUTTON_LOCATOR = By.id("search-lead-source");
    private final By PROPERTY_LEAD_SOURCES_RESET_LINK_LOCATOR = By.id("reset-lead-source");
    private final By PROPERTY_ADD_LEAD_SOURCE_BUTTON_LOCATOR = By.cssSelector("div[class='button action right nomargin js-add-leadsource margin10-left ']");

    //Property Level Lead Sources List Locators
    private final By PROPERTY_LEAD_SOURCES_LIST_LOCATOR = By.cssSelector("table[class='sort valign-middle']");
    private final By PROPERTY_LEAD_SOURCES_ID_COLUMN_HEADER = By.xpath("//th[text()='#']");
    private final By PROPERTY_LEAD_SOURCES_NAME_COLUMN_HEADER = By.xpath("//th[text()='Name']");
    private final By PROPERTY_LEAD_SOURCES_ILS_COLUMN_HEADER = By.xpath("//th[text()='ILS']");
    private final By PROPERTY_LEAD_SOURCES_VANITY_NUMBER_COLUMN_HEADER = By.xpath("//th[text()='Vanity Number']");
    private final By PROPERTY_LEAD_SOURCES_SMS_KEYWORD_COLUMN_HEADER = By.xpath("//th[text()='SMS Keyword']");
    private final By PROPERTY_LEAD_SOURCES_VISIBLE_COLUMN_HEADER = By.xpath("//th[text()='Visible']");
    //Property Level Lead Source Action Buttons
    private final By PROPERTY_LEAD_SOURCES_METRICS_BUTTON_LOCATOR = By.cssSelector("i[class='source-metrics graph']");
    private final By PROPERTY_LEAD_SOURCES_EDIT_BUTTON_LOCATOR = By.cssSelector("i[title='Edit Lead Source']");
    private final By PROPERTY_LEAD_SOURCES_DELETE_BUTTON_LOCATOR = By.cssSelector("i[title='Delete Lead Source']");

    //Methods
    public boolean findLeadSourcesSearchFilterInPropertyLevel() {
        waitForLeadSourceTabOverlay();
        return confirmElementIsVisible(PROPERTY_LEAD_SOURCES_SEARCH_FILTER_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean findLeadSourcesFilterButton_PropertyLevel() {
        return confirmElementIsVisible(PROPERTY_LEAD_SOURCES_FILTER_BUTTON_LOCATOR);
    }

    public boolean findLeadSourcesResetFilterLink_PropertyLevel() {
        return confirmElementIsVisible(PROPERTY_LEAD_SOURCES_RESET_LINK_LOCATOR);
    }

    public boolean findAddLeadSourceButton_PropertyLevel() {
        return confirmElementIsVisible(PROPERTY_ADD_LEAD_SOURCE_BUTTON_LOCATOR);
    }

    //Lead Source List Methods
    public boolean findLeadSourcesList_PropertyLevel() {
        return confirmElementIsVisible(PROPERTY_LEAD_SOURCES_LIST_LOCATOR);
    }

    public boolean findIDColumnHeader_PropertyLevel() {
        return confirmElementIsVisible(PROPERTY_LEAD_SOURCES_ID_COLUMN_HEADER);
    }

    public boolean findNameColumnHeader_PropertyLevel() {
        return confirmElementIsVisible(PROPERTY_LEAD_SOURCES_NAME_COLUMN_HEADER);
    }

    public boolean findILSColumnHeader_PropertyLevel() {
        return confirmElementIsVisible(PROPERTY_LEAD_SOURCES_ILS_COLUMN_HEADER);
    }

    public boolean findVanityNumberColumnHeader_PropertyLevel() {
        return confirmElementIsVisible(PROPERTY_LEAD_SOURCES_VANITY_NUMBER_COLUMN_HEADER);
    }

    public boolean findSMSKeywordColumnHeader_PropertyLevel() {
        return confirmElementIsVisible(PROPERTY_LEAD_SOURCES_SMS_KEYWORD_COLUMN_HEADER);
    }

    public boolean findVisibleColumnHeader_PropertyLevel() {
        return confirmElementIsVisible(PROPERTY_LEAD_SOURCES_VISIBLE_COLUMN_HEADER);
    }

    public boolean findLeadSourceMetricsButton_PropertyLevel() {
        return confirmElementIsVisible(PROPERTY_LEAD_SOURCES_METRICS_BUTTON_LOCATOR);
    }

    public boolean findEditLeadSourceButton_PropertyLevel() {
        return confirmElementIsVisible(PROPERTY_LEAD_SOURCES_EDIT_BUTTON_LOCATOR);
    }

    public boolean findDeleteLeadSourceButton_PropertyLevel() {
        return confirmElementIsVisible(PROPERTY_LEAD_SOURCES_DELETE_BUTTON_LOCATOR);
    }

    //Overlay Methods
    private void waitForLeadSourceTabOverlay() {
        waitForOverlay(PROPERTY_LEVEL_LEAD_SOURCES_OVERLAY);
    }

}
