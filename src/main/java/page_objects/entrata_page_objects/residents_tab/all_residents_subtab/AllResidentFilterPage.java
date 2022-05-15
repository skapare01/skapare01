package page_objects.entrata_page_objects.residents_tab.all_residents_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AllResidentFilterPage extends BasePage {

    public AllResidentFilterPage(WebDriver driver) {
        super(driver);
    }

    private final By ENTER_LEASE_ID = By.className("form-field");
    //First Resident listed in the table
    private final By CLICK_LEASE_ID_SEARCH_RESULTS = By.cssSelector("#property-1 > tr:nth-child(2)");
    private final By LOADING_OVERLAY = By.className("loading-overlay");
    private final By STATUS_FIELD = By.cssSelector("#status_filter > .form-advancedmultiselect > .binded");
    private final By ADVANCED_FILTERS = By.cssSelector(".js-view-data-adv-search");
    private final By CURRENT_STATUS = By.cssSelector("input[value='4']");
    private final By PAST_STATUS = By.cssSelector("input[value='6']");

    //Filter by property process
    private final By CLEAR_ALL = By.id("js-clear-all-properties");
    private final By ADD_PROPERTY_BUTTON = By.id("addbutton");
    private final By PROPERTY_SEARCH_FIELD = By.id("test");
    private final By FILTER_RESIDENTS = By.className("submit-filter");
    //General Filter Selectors
    private final By SELECT_RESIDENTS_FILTERS = (By.cssSelector("i[class='dark-filter transition']"));
    private final By REMOVE_SELECTED_PROPERTY =   (By.id("selected-report_filterproperty_group_ids-100008132"));

    private final By PROPERTY_NAME_SEARCH_FILTER = (By.id("test"));
    private final By SELECT_RESIDENTS_FILTER_BOX_AREA = (By.cssSelector("fieldset[class='margin10']"));
    private final By RESIDENT_NAME_FILTER_TEXT_BOX = (By.id("resident_name"));
    private final By SELECT_FILTER_RESIDENTS_OPTION = (By.cssSelector("a[class='button action first green text-white bold font14 generate-report submit-filter']"));
    private final By ADD_PROPERTY_BUTTON_FROM_PROPERTY_FILTERS_CAVALIER_COURT = (By.xpath("//span[text()='Cavalier Court']"));


    //Resident Filter Methods
    public boolean enterLeaseId(String search) {
        return sendKeysToElement(ENTER_LEASE_ID, search);
    }

    public boolean submitLeaseSearch() {
        return pressEnter(ENTER_LEASE_ID);
    }

    public boolean clickResidentSearchResult() {
        waitForOverlay(LOADING_OVERLAY);
        return clickElement(CLICK_LEASE_ID_SEARCH_RESULTS); }
    public boolean clickAdvancedFilters(){return clickElement(ADVANCED_FILTERS);}


    // filter by property methods
    public boolean clickClearAll(){return clickElement(CLEAR_ALL);}
    public boolean clickAddPropertyButton(){return clickElement(ADD_PROPERTY_BUTTON);}
    // This method searches for and clicks on the specified property, avoid properties that contain apostrophes as these cause issues with this method
    public boolean clickOnSpecificFilteredProperty(String property){ sendKeysToElement(PROPERTY_SEARCH_FIELD, property);
        String addSecondProperty = String.format("//*[contains(text(), '%s')]",property);
        By addProperty = By.xpath(addSecondProperty);
        return clickElement(addProperty);}
    public boolean clickFilterResidents(){return clickElement(FILTER_RESIDENTS);}

    //Status filter
    public boolean filterByCurrentStatus(){return sendKeysToElement(STATUS_FIELD,"Current");}
    public boolean filterByPastStatus(){return sendKeysToElement(STATUS_FIELD,"Past");}
    public boolean clickCurrentStatus(){return clickElement(CURRENT_STATUS);}
    public boolean clickPastStatus(){return clickElement(PAST_STATUS);}
    // General Filter Methods
    public boolean selectResidentsFilters() { return clickElement(SELECT_RESIDENTS_FILTERS); }
    public boolean removePropertyFromPropertyFilter() { return clickElement(REMOVE_SELECTED_PROPERTY, waitTimes.SHORT_WAIT); }
    public boolean useAddPropertyButton() { return clickElement(ADD_PROPERTY_BUTTON); }

    public boolean useAddPropertyButtonFromPropertyFilterCavalierCourt() { return clickElement(ADD_PROPERTY_BUTTON_FROM_PROPERTY_FILTERS_CAVALIER_COURT, waitTimes.SHORT_WAIT); }
    public boolean selectAndSendKeysToPropertyNameFilterCavalierCourt() { return sendKeysToElement(PROPERTY_NAME_SEARCH_FILTER, "Cavalier Court"); }

    public boolean selectResidentsFilterBoxArea() { return clickElement(SELECT_RESIDENTS_FILTER_BOX_AREA); }
    public boolean selectAndSendKeysToResidentNameFilterTextBoxQuintonTucker() { return sendKeysToElement(RESIDENT_NAME_FILTER_TEXT_BOX, "15537116"); }
    public boolean selectFilterResidentsFilterOption() { return clickElement(SELECT_FILTER_RESIDENTS_OPTION); }

}
