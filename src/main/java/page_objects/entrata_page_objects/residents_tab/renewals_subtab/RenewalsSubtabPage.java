package page_objects.entrata_page_objects.residents_tab.renewals_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class RenewalsSubtabPage extends BasePage {
    //Top of Page Buttons
    private final By RENEWAL_EMAIL_BUTTON = By.cssSelector("a[class='button action first create-application-email']");
    private final By CANCEL_RENEWALS_BUTTON = By.cssSelector("a[class='button action close-applications']");
    //Renewals List Columns
    private final By RENEWALS_LIST_LEAD_COLUMN = By.cssSelector("th[sort_by='name_full']");
    private final By RENEWALS_LIST_RENEWAL_STATUS_COLUMN = By.xpath("//th[text()='Renewal Status']");
    private final By RENEWALS_OFFER_EXPIRES_COLUMN = By.xpath("//th[text()='Renewal Offer Expires']");
    private final By RENEWALS_LIST_PROPERTY_COLUMN = By.xpath("//th[text()='Property']");
    private final By RENEWALS_LIST_UNIT_COLUMN = By.xpath("//th[text()='Unit']");
    private final By RENEWALS_LIST_LEASE_STATUS_COLUMN = By.xpath("//th[text()='Lease Status']");
    private final By RENEWALS_LIST_LEASE_EXPIRES_COLUMN = By.cssSelector("th[sort_by='lease_end_date']");
    private final By RENEWALS_LIST_CREATED_COLUMN = By.cssSelector("th[sort_by='application_datetime']");
    private final By RENEWALS_LIST_LAST_CONTACT_COLUMN = By.cssSelector("th[sort_by='last_contact_days']");
    private final By RENEWALS_LIST_LAST_ATTEMPT_COLUMN = By.cssSelector("th[sort_by='last_attempt_days']");
    //Left sidebar tabs
    private final By CREATE_RENEWALS_TAB = By.cssSelector("a[title='Create Renewals']");
    private final By FILTER_TAB = By.id("open-filter-by-default");

    public RenewalsSubtabPage(WebDriver driver) {
        super(driver);
    }

    //Top of Page Button Methods
    public boolean renewalEmailButtonVisible() {
        return confirmElementIsVisible(RENEWAL_EMAIL_BUTTON);
    }
    public boolean cancelRenewalsButtonVisible() {
        return confirmElementIsVisible(CANCEL_RENEWALS_BUTTON);
    }

    //Renewals List Columns Methods
    public boolean leadColumnVisible() {
        return confirmElementIsVisible(RENEWALS_LIST_LEAD_COLUMN);
    }
    public boolean renewalStatusColumnVisible() {
        return confirmElementIsVisible(RENEWALS_LIST_RENEWAL_STATUS_COLUMN);
    }
    public boolean renewalOfferExpiresVisible() { return confirmElementIsVisible(RENEWALS_OFFER_EXPIRES_COLUMN);}
    public boolean propertyColumnVisible() {
        return confirmElementIsVisible(RENEWALS_LIST_PROPERTY_COLUMN);
    }
    public boolean unitColumnVisible() { return confirmElementIsVisible(RENEWALS_LIST_UNIT_COLUMN); }
    public boolean leaseStatusVisible() { return confirmElementIsVisible(RENEWALS_LIST_LEASE_STATUS_COLUMN); }
    public boolean leaseExpiresColumnVisible() {
        return confirmElementIsVisible(RENEWALS_LIST_LEASE_EXPIRES_COLUMN);
    }
    public boolean createdColumnVisible() {
        return confirmElementIsVisible(RENEWALS_LIST_CREATED_COLUMN);
    }
    public boolean lastContactColumnVisible() {
        return confirmElementIsVisible(RENEWALS_LIST_LAST_CONTACT_COLUMN);
    }
    public boolean lastAttemptColumnVisible() {
        return confirmElementIsVisible(RENEWALS_LIST_LAST_ATTEMPT_COLUMN);
    }

    //Left Side Bar Methods
    public boolean createRenewalsTabClick() {
        return clickElement(CREATE_RENEWALS_TAB);
    }
    public boolean renewalFilterTabVisible() {
        return confirmElementIsVisible(FILTER_TAB);
    }

}

