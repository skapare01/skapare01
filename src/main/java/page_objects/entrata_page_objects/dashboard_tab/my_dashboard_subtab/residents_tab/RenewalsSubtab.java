package page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.residents_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;
import page_objects.entrata_page_objects.reports_tab.ReportsBasePage;

public class RenewalsSubtab extends ReportsBasePage {
    //Create Offers
    private final By CREATE_OFFERS_TAB = By.cssSelector("li[data-label='awaiting_renewal_offers_leases']");
    private final By HEADER_RES_AWAITING_RENEWAL_OFFERS = By.xpath("//h4[text()='Residents Awaiting Renewal Offers']");
    private final By LOOK_AHEAD_DAYS_FIELD = By.name("look_ahead_days");
    private final By CREATE_RENEWAL_OFFER_BUTTON_FIRST_RESIDENT = By.xpath("//tr[1]/td[7]/div[text()='Create Offer']");
    private final By OVERLAY_BEFORE_CREATE_RENEWAL_OFFER_BUTTON = By.cssSelector("div[class='loading-overlay bg-img-medium']");
    private final By CREATE_OFFERS_HEADING_RESIDENTS_AWAITING_RENEWAL_OFFERS = By.xpath("//div//h4[text()='Residents Awaiting Renewal Offers']");
    private final By CHECKMARK_FIRST_RESIDENT = By.xpath("//tr[1]/td[1]/input[1][@class='form-checkbox']");
    private final By CREATE_OFFERS_FIRST_RESIDENT_ON_LIST = By.xpath("//form[2]/table/tbody/tr[1]/td[3]/div/strong[@class='link']");
    //Pending Offers
    private final By PENDING_OFFERS_TAB = By.cssSelector("li[data-label='pending_renewal_offers']");

    //Resubmit
    private final By RESUBMIT_TAB = By.cssSelector("li[data-label='rejected_renewal_offers']");

    //Generate Lease
    private final By GENERATE_LEASE_TAB = By.cssSelector("li[data-label='dashboard_generate_leases_container']");

    //Non-Renewing Tab
    private final By NON_RENEWING_TAB = By.cssSelector("li[data-label='non_renewal_leases_container']");

    //Requests Tab
    private final By REQUESTS_TAB = By.cssSelector("li[data-label='dashboard_residents_renewal_requests_container']");

    public RenewalsSubtab(WebDriver driver) {
        super(driver);
    }

    //Create Offers Methods
    private void overlayBeforeCreateRenewalOfferButton(){
        waitForOverlay(OVERLAY_BEFORE_CREATE_RENEWAL_OFFER_BUTTON);
    }
    public boolean residentsAwaitingHeader() {
        return confirmElementIsVisible(HEADER_RES_AWAITING_RENEWAL_OFFERS);
    }
    public boolean createOffersTabIsVisible() {
        return confirmElementIsVisible(CREATE_OFFERS_TAB);
    }
    public boolean createOffersTabClick() {
        return clickElement(CREATE_OFFERS_TAB);
    }
    public boolean lookAheadDaysClick() {
        overlayBeforeCreateRenewalOfferButton();
        return clickElement(LOOK_AHEAD_DAYS_FIELD);
    }
    public boolean lookAheadDaysClear() {
        return elementClearTextField(LOOK_AHEAD_DAYS_FIELD);
    }
    public boolean lookAheadDaysEnterKeys999() {
        return sendKeysToElement(LOOK_AHEAD_DAYS_FIELD, "999");
    }
    public boolean lookAheadDaysEnterKeys30() {
        return sendKeysToElement(LOOK_AHEAD_DAYS_FIELD, "30");
    }
    public boolean lookAheadDaysPressEnter() {
        return pressEnter(LOOK_AHEAD_DAYS_FIELD);
    }
    public boolean createRenewalOffersButtonForFirstResident() {
        overlayBeforeCreateRenewalOfferButton();
        return clickElement(CREATE_RENEWAL_OFFER_BUTTON_FIRST_RESIDENT);
    }
    public boolean residentsAwaitingRenewalOffersHeadingVis() {
        return confirmElementIsVisible(CREATE_OFFERS_HEADING_RESIDENTS_AWAITING_RENEWAL_OFFERS);
    }
    public boolean checkmarkFirstResident() {
        overlayBeforeCreateRenewalOfferButton();
        return clickElement(CHECKMARK_FIRST_RESIDENT);
    }
    public String storeFirstNameOnList() {
        return locateNumberAndStoreAsString(CREATE_OFFERS_FIRST_RESIDENT_ON_LIST);
    }
    public String getFirstNameOnListVerifyNotSameAsStored() {
        overlayBeforeCreateRenewalOfferButton();
        return getElementText(CREATE_OFFERS_FIRST_RESIDENT_ON_LIST);
    }

    //Pending Offers Methods
    public boolean pendingOffersTab() {
        return confirmElementIsVisible(PENDING_OFFERS_TAB);
    }

    //Resubmit Methods
    public boolean resubmitTab() {
        return confirmElementIsVisible(RESUBMIT_TAB);
    }

    //Generate Lease Methods
    public boolean generateLeaseTab() {
        return confirmElementIsVisible(GENERATE_LEASE_TAB);
    }

    //Non-Renewing Methods
    public boolean nonRenewingTab() {
        return confirmElementIsVisible(NON_RENEWING_TAB);
    }

    //Requests Tab Methods
    public boolean requestsTab() {
        return confirmElementIsVisible(REQUESTS_TAB);
    }

}
