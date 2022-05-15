package page_objects.entrata_page_objects.leads_tab.all_leads_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class LeadsAllLeadsFilters extends BasePage {
    //Select Filter Selector
    private final By EXPAND_FILTER_BUTTON = By.id("open-filter-by-default");
    private final By LEADS_FILTER_BLACKBOX = By.xpath("//div[text()='Leads Filter']");

    //Remove Properties Options Selectors
    private final By CLEAR_ALL_PROPERTY_FILTER_BUTTON = By.id("js-clear-all-properties");

    //Filter General Navigation Selectors
    private final By ADD_PROPERTY_BUTTON = By.id("addbutton");
    private final By NAME_EMAIL_ID_SEARCH_FIELD = By.id("resident_name");

    //Property Groups Selectors
    private final By PROPERTY_NAME_SEARCH_FIELD = By.id("test");
    private final By LOCATE_CAVALIER_COURT_SEARCH_RESULT = By.xpath("//span[text()='Cavalier Court']");
    private final By ALL_PROPERTIES_DROPDOWN = By.xpath("//*[@id=\"property_list\"]/span[1]");
    private final By AFFORDABLE_AUTOMATION_PROPERTY = By.xpath("//span[text()='Affordable_Automation']");

    //Status Selectors//

    //Status Dropdown Selector
    private final By STATUS_SEARCH_BAR = By.cssSelector(".form-search-field.binded.binded-toggle");
    private final By APPLICATION_STARTED_CHECK_BOX = By.cssSelector("input[value='9']");
    private final By ELIGIBILITY_COMPLETED_STATUS = By.xpath("//*[@id=\"status_filter_items\"]/ul[6]/li[1]/label/input");

    //Search / Cancel Selectors
    private final By FILTER_LEADS_SEARCH_BUTTON = By.cssSelector("#frm-view-data-filters2 > fieldset:nth-child(5) > div.align-right > ul > li:nth-child(1) > a");
    private final By CLICK_CLOSE_LEAD_FILTERS = By.cssSelector("i[class='view-data-close js-view-data-close']");
    private final By CLICK_RESET_FILTERS_BUTTON = By.cssSelector("a[class='reset-filter']");

    // Overlay Selector
    private final By LOADING_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");

    //Constructor
    public LeadsAllLeadsFilters(WebDriver driver) {
        super(driver);
    }

    //Select Filter Selector
    public boolean clickExpandFilterButton() {
        return clickElement(EXPAND_FILTER_BUTTON);
    }

    public boolean clickLeadsFilterBlackTextArea() {
        return clickElement(LEADS_FILTER_BLACKBOX);
    }

    //Remove Properties Options Methods
    public boolean clickClearALlPropertiesButtonInFilters() {
        return clickElement(CLEAR_ALL_PROPERTY_FILTER_BUTTON);
    }

    //Filter General Navigation Methods
    public boolean clickAddPropertyFilterButton() {
        return clickElement(ADD_PROPERTY_BUTTON);
    }

    public boolean clickAddNameEmailorIDFilterSearchField() {
        waitForPotentialOverlay();
        return clickElement(NAME_EMAIL_ID_SEARCH_FIELD);
    }

    public boolean clickAndSendKeysToAddNameEmailOrIDFilterSearchFieldSanaliPayne() {
        return sendKeysToElement(NAME_EMAIL_ID_SEARCH_FIELD, "Sanali Payne");
    }

    //Status Methods//

    //Status Dropdown Method
    public boolean sendKeysToStatusSearchBar(String status) {
        return sendKeysToElement(STATUS_SEARCH_BAR, status);
    }

    public boolean clickApplicationStartedCheckBox() {
        return clickElement(APPLICATION_STARTED_CHECK_BOX);
    }

    public boolean scrollToEligibilityCompleteCheckbox() {
        return moveToAnElementWithActions(ELIGIBILITY_COMPLETED_STATUS);
    }

    public boolean clickEligibilityStatusCompleteCheckbox() {
        return clickElement(ELIGIBILITY_COMPLETED_STATUS);
    }

    //Property Groups Methods
    public boolean clickAndSendKeysToPropertyNameSearchFieldCavalierCourt() {
        return sendKeysToElement(PROPERTY_NAME_SEARCH_FIELD, "Cavalier Court");
    }

    public boolean clickCavalierCourtSearchedFilterResult() {
        return clickElement(LOCATE_CAVALIER_COURT_SEARCH_RESULT);
    }

    public boolean clickAllPropertiesDropdown() {
        return clickElement(ALL_PROPERTIES_DROPDOWN);
    }

    public boolean clickAffordableAutomationPropertyFromDropdown() {
        return clickElement(AFFORDABLE_AUTOMATION_PROPERTY);
    }

    //Search / Cancel Methods
    public boolean clickFilterSearch() {
        waitForPotentialOverlay();
        return clickElement(FILTER_LEADS_SEARCH_BUTTON);
    }

    public boolean scrollToFilterLeadsSearchButton() {
        return moveToAnElementWithActions(FILTER_LEADS_SEARCH_BUTTON);
    }

    //Overlay Method
    private void waitForPotentialOverlay() {
        waitForOverlay(LOADING_OVERLAY);
    }
}
