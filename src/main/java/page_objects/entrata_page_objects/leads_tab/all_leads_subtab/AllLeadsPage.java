package page_objects.entrata_page_objects.leads_tab.all_leads_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AllLeadsPage extends BasePage {

    //All leads page variables
    private final By LEAD_NAME_COLUMN_VIS = By.cssSelector("th[sort_by='name_full']");
    private final By LEAD_STATUS_COLUMN_VIS = By.cssSelector("th[sort_by='application_status_id']");
    private final By LEAD_PROPERTY_NAME_COLUMN_VIS = By.cssSelector("th[sort_by='property_name']");
    private final By LEAD_SOURCE_COLUMN_VIS = By.cssSelector("th[sort_by='lead_source']");
    private final By LEAD_CREATED_DATE_COLUMN_VIS = By.cssSelector("th[sort_by='application_datetime']");
    private final By LEAD_LAST_CONTACT_COLUMN_VIS = By.cssSelector("th[sort_by='last_contact_days']");
    private final By LEAD_LAST_ATTEMPT_COLUMN_VIS = By.cssSelector("th[sort_by='last_attempt_days']");
    private final By LEAD_MOVE_IN_DATE_COLUMN_VIS = By.cssSelector("th[sort_by='move_in_date']");

    //Add new lead sidebar
    private final By ADD_LEAD_LEFT_HAND_SIDE = By.className("flat-add");
    private final By FILTER_OPTION = By.id("open-filter-by-default");
    private final By LEADS_FILTER_NAME_SEARCH = By.id("resident_name");
    private final By FILTER_LEADS_SEARCH_BUTTON = By.cssSelector("#frm-view-data-filters2 > fieldset:nth-child(5) > div.align-right > ul > li:nth-child(1) > a");

    // Select Lead Method
    private final By SEARCHED_LEAD_RESULT_SANALI_PAYNE = By.cssSelector("em[title='Application ID: 18673834']");

    //Filtered Lead locator
    private final By CLICK_FIRST_FILTERED_LEAD = By.cssSelector("#property-1 > tr:nth-child(2)");

    //Overlay Selector
    private final By LOADING_OVERLAY = By.className("loading-overlay");

    //Product Specific Variables:
    //Screening
    private final String SCREENING_SMOKE_APPLICANT_ID = "14707267";
    private final By SCREENING_SMOKE_APPLICANT_BY_ID = By.cssSelector("tr[data-appid='17329937']");

    public AllLeadsPage(WebDriver driver) {
        super(driver);
    }

    //All leads page methods
    public boolean leadNameColumn() {
        return confirmElementIsVisible(LEAD_NAME_COLUMN_VIS);
    }

    public boolean statusColumn() {
        return confirmElementIsVisible(LEAD_STATUS_COLUMN_VIS);
    }

    public boolean propertyColumn() {
        return confirmElementIsVisible(LEAD_PROPERTY_NAME_COLUMN_VIS);
    }

    public boolean sourceColumn() {
        return confirmElementIsVisible(LEAD_SOURCE_COLUMN_VIS);
    }

    public boolean createdColumn() {
        return confirmElementIsVisible(LEAD_CREATED_DATE_COLUMN_VIS);
    }

    public boolean lastContactColumn() {
        return confirmElementIsVisible(LEAD_LAST_CONTACT_COLUMN_VIS);
    }

    public boolean lastAttemptColumn() {
        return confirmElementIsVisible(LEAD_LAST_ATTEMPT_COLUMN_VIS);
    }

    public boolean moveInDateColumn() {
        return confirmElementIsVisible(LEAD_MOVE_IN_DATE_COLUMN_VIS);
    }

    //Method Add new lead
    public boolean clickAddLeadLeftHandSideMenu() {
        return clickElement(ADD_LEAD_LEFT_HAND_SIDE);
    }

    // Select Lead Method
    public boolean clickSearchedLeadSanaliPayne() {
        waitForLeadFilterOverlay();
        return clickElement(SEARCHED_LEAD_RESULT_SANALI_PAYNE);
    }

    //Filter Leads
    public boolean clickFilterOption() {
        return clickElement(FILTER_OPTION);
    }

    public boolean clickFilterSearch() {
        return clickElement(FILTER_LEADS_SEARCH_BUTTON);
    }

    //Screening Specific Methods
    public boolean searchScreeningLeadID() {
        return sendKeysToElement(LEADS_FILTER_NAME_SEARCH, SCREENING_SMOKE_APPLICANT_ID);
    }

    public boolean clickScreeningSmokeLeadID() {
        return clickElement(SCREENING_SMOKE_APPLICANT_BY_ID);
    }

    //Affordable product methods
    public boolean enterLeadNameInFilterSearch(String name) {
        return sendKeysToElement(LEADS_FILTER_NAME_SEARCH, name);
    }

    public boolean clickFirstResultLeadFilter() {
        waitForLeadFilterOverlay();
        return clickElement(CLICK_FIRST_FILTERED_LEAD);
    }

    private void waitForLeadFilterOverlay() {
        waitForOverlay(LOADING_OVERLAY, waitTimes.LONG_WAIT);
    }


}
