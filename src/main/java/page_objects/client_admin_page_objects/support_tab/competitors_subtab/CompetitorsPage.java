package page_objects.client_admin_page_objects.support_tab.competitors_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class CompetitorsPage extends BasePage {

    private final By SCRAPER_DETAILS_TAB = By.id("competitor_queue_detail_6");
    private final By FILTER_OPTIONS = By.id("property_list");
    private final By SELECT_COMPETITOR = By.id("find_property_name");
    private final By SELECT_ASSOCIATED_PROPERTY = By.id("find_associated_property");
    private final By SELECT_ASSOCIATED_COMPANY = By.id("find_associated_company");
    private final By FILTER_SUBMIT = By.id("Scraper_Filter_Submit");
    private final By UPDATED_ON = By.id("queue_updated_on");
    private final By SCRAPER_URL = By.id("scraper_type");
    private final By STATUS = By.id("queue_status");
    private final By SCRAPER_DATA_TYPE = By.id("queue_is_rating");
    private final By COMPETITOR_PROPERTY = By.id("queue_property_name");
    private final By ASSOCIATED_PROPERTY = By.id("queue_associated_property");
    private final By ASSOCIATED_COMPANY = By.id("queue_associative_company");
    private final By URL_ID = By.id("queue_id");
    private final By ACTION = By.cssSelector(".align-left.width-8");

    public CompetitorsPage(WebDriver driver) {
        super(driver);
    }

    public boolean clickScraperDetailsTab() {
        return clickElement(SCRAPER_DETAILS_TAB);
    }

    public boolean findFilterOptionsDropdown() {
        return confirmElementIsVisible(FILTER_OPTIONS, waitTimes.LONG_WAIT);
    }

    public boolean findSelectCompetitorDropdown() {
        return confirmElementIsVisible(SELECT_COMPETITOR);
    }

    public boolean findSelectAssociatedPropertyDropdown() { return confirmElementIsVisible(SELECT_ASSOCIATED_PROPERTY); }

    public boolean findSelectAssociatedCompanyDropdown() {
        return confirmElementIsVisible(SELECT_ASSOCIATED_COMPANY);
    }

    public boolean findSubmitFilterButton() {
        return confirmElementIsVisible(FILTER_SUBMIT);
    }

    public boolean findUpdatedOn() {
        return confirmElementIsVisible(UPDATED_ON);
    }

    public boolean findScraperURL() {
        return confirmElementIsVisible(SCRAPER_URL);
    }

    public boolean findStatus() {
        return confirmElementIsVisible(STATUS);
    }

    public boolean findScraperDataType() {
        return confirmElementIsVisible(SCRAPER_DATA_TYPE);
    }

    public boolean findCompetitorProperty() {
        return confirmElementIsVisible(COMPETITOR_PROPERTY);
    }

    public boolean findAssociatedProperty() {
        return confirmElementIsVisible(ASSOCIATED_PROPERTY);
    }

    public boolean findAssociatedCompany() {
        return confirmElementIsVisible(ASSOCIATED_COMPANY);
    }

    public boolean findUrlId() {
        return confirmElementIsVisible(URL_ID);
    }

    public boolean findAction() {
        return confirmElementIsVisible(ACTION);
    }


}
